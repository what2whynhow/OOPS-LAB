import java.util.Scanner;
public class sum_of_digits
{
int num,sum=0;
public sum_of_digits(int num)
{
this.num=num;
}
public void operation()
{
while (num != 0)
{
sum=sum+num%10;
num=num/10;
}
System.out.println("Sum of digits : " + sum);
}
public static void main (String[] args)
{
Scanner inp= new Scanner(System.in);
System.out.println("Enter the number : ");
int inputNum=inp.nextInt();
sum_of_digits obj=new sum_of_digits(inputNum);
obj.operation();
}
}
