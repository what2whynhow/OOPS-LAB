import java.util.Scanner;
public class reverse_number
{
int num,rev=0,digit;
public reverse_number(int num)
{
this.num=num;
}
public void operation()
{
while (num != 0)
{
digit=num%10;
rev=rev*10+digit;
num=num/10;
}
System.out.println("Reversed number : " + rev);
}
public static void main (String[] args)
{
Scanner inp= new Scanner(System.in);
System.out.println("Enter the number : ");
int inputNum=inp.nextInt();
reverse_number obj=new reverse_number(inputNum);
obj.operation();
}
}
