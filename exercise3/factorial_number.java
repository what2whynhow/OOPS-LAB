import java.util.Scanner;
public class factorial_number
{
int num;
public factorial_number(int num) 
{
this.num = num;
}
public void operation() 
{
long factorial = 1;
for (int i = 1; i <= num; i++) 
{
factorial *= i; // Multiply factorial by i
}
System.out.println("Factorial of " + num + " is: " + factorial);
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number: ");
int inputNum = inp.nextInt();
factorial_number obj = new factorial_number(inputNum);
obj.operation();
}
}