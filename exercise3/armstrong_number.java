import java.util.Scanner;
public class armstrong_number
{
int num;
public armstrong_number(int num) 
{
this.num = num;
}
public void operation() 
{
int originalNum = num;
int sum = 0;
int digits = String.valueOf(num).length();
while (num != 0) 
{
int digit = num % 10;
sum += Math.pow(digit, digits);
num /= 10;
}
if (sum == originalNum) 
{
System.out.println(originalNum + " is an Armstrong number.");
} 
else 
{
System.out.println(originalNum + " is not an Armstrong number.");
}
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number: ");
int inputNum = inp.nextInt();
armstrong_number obj = new armstrong_number(inputNum);
obj.operation();
}
}