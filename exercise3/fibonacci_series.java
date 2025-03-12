import java.util.Scanner;
public class fibonacci_series 
{
int limit;
public fibonacci_series(int limit) 
{
this.limit = limit;
}
public void operation() 
{
int num1 = 0, num2 = 1;
System.out.println("Fibonacci Series up to " + limit + " terms:");
for (int i = 1; i <= limit; i++) 
{
System.out.print(num1 + " ");
int nextNum = num1 + num2;
num1 = num2;
num2 = nextNum;
}
System.out.println();
}
public static void main(String[] args) 
{        
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number of terms for the Fibonacci series: ");
int inputLimit = inp.nextInt();
fibonacci_series obj = new fibonacci_series(inputLimit);
obj.operation();
}
}