import java.util.Scanner;
public class palindrome_number 
{
int num;
int reversedNum = 0;
public palindrome_number(int num) 
{
this.num = num;
}
public void operation() 
{
int originalNum = num;
while (num != 0) 
{
int digit = num % 10;
reversedNum = reversedNum * 10 + digit;
num = num / 10; // Remove the last digit
}
if (originalNum == reversedNum) 
{
System.out.println(originalNum + " is a palindrome number.");
} 
else 
{
System.out.println(originalNum + " is not a palindrome number.");
}
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number: ");
int inputNum = inp.nextInt();
palindrome_number obj = new palindrome_number(inputNum);
obj.operation();
}
}