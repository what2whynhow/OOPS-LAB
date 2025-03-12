import java.util.Scanner;
public class prime_number
{
int num;
Boolean isPrime=true;
public prime_number(int num)
{
this.num=num;
}
public void operation()
{
if (num<=1)
{
isPrime=false;
}
else
{
for (int i=2;i*i<=num;i++)
{
if (num % i == 0)
{
isPrime=false;
break;
}
}
}
if (isPrime)
{
System.out.println(num + " is a prime number");
}
else
{
System.out.println(num + " is not a prime number");
}
}
public static void main (String[] args)
{
Scanner inp= new Scanner(System.in);
System.out.println("Enter the number : ");
int inputNum=inp.nextInt();
prime_number obj=new prime_number(inputNum);
obj.operation();
}
}
