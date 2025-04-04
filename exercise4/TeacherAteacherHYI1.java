// Base class
class School {
    String name;

    School(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("School Name: " + name);
    }
}

// Derived class 1
class Teacher extends School {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void teach() {
        System.out.println("Teaching " + subject);
    }
}

// Derived class 2
class Student extends School {
    int grade;

    Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    void study() {
        System.out.println("Studying in grade " + grade);
    }
}

// Derived class (hybrid: inherits from both Teacher and Student)
class AssistantTeacher extends Teacher {
    int experience;

    AssistantTeacher(String schoolName, String subject, int experience) {
        super(schoolName, subject);
        this.experience = experience;
    }

    void assist() {
        System.out.println("Assisting with " + subject + " for " + experience + " years");
    }
}

public class TeacherAteacherHYI1 {
    public static void main(String[] args) {
        AssistantTeacher assistant = new AssistantTeacher("XYZ School", "Math", 2);
        assistant.showInfo();
        assistant.teach();
        assistant.assist();
    }
}