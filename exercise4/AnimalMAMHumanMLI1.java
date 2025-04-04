// Base class
class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type + " is eating.");
    }
}

// Intermediate class
class Mammal extends Animal {
    boolean hasFur;

    Mammal(String type, boolean hasFur) {
        super(type);
        this.hasFur = hasFur;
    }

    void breathe() {
        System.out.println(type + " is breathing.");
    }
}

// Derived class
class Human extends Mammal {
    String name;

    Human(String type, boolean hasFur, String name) {
        super(type, hasFur);
        this.name = name;
    }

    void speak() {
        System.out.println(name + " is speaking.");
    }
}

public AnimalMAMHumanMLI1 {
    public static void main(String[] args) {
        Human human = new Human("Mammal", true, "Alice");
        human.eat();
        human.breathe();
        human.speak();
    }
}