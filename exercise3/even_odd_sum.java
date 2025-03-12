import java.util.Scanner;
public class even_odd_sum 
{
int limit;
public even_odd_sum(int limit) 
{
this.limit = limit;
}
public void operation() 
{
int evenSum = 0, oddSum = 0;
for (int i = 1; i <= limit; i++) 
{
if (i % 2 == 0)
{
evenSum += i;
} 
else 
{
oddSum += i;
}
}
System.out.println("Sum of even numbers up to " + limit + " is: " + evenSum);
System.out.println("Sum of odd numbers up to " + limit + " is: " + oddSum);
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the limit: ");
int inputLimit = inp.nextInt();
even_odd_sum obj = new even_odd_sum(inputLimit);
obj.operation();
}
}