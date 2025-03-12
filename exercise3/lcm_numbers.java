import java.util.Scanner;
public class lcm_numbers 
{
int num1, num2;
public lcm_numbers(int num1, int num2) 
{
this.num1 = num1;
this.num2 = num2;
}
public void operation() 
{
int lcm = (num1 > num2) ? num1 : num2;        
while (true) 
{
if (lcm % num1 == 0 && lcm % num2 == 0) 
{
System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
break;
}
lcm++;
}
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the first number: ");
int inputNum1 = inp.nextInt();
System.out.println("Enter the second number: ");
int inputNum2 = inp.nextInt();
lcm_numbers obj = new lcm_numbers(inputNum1, inputNum2);
obj.operation();
}
}