import java.util.Scanner;
public class lower_triangle 
{
int rows;
public lower_triangle(int rows) 
{        
this.rows = rows;
}
public void operation() 
{
for (int i = 1; i <= rows; i++) 
{
for (int j = 1; j <= i; j++) 
{
System.out.print(j + " ");
}
System.out.println();
}
}
public static void main(String[] args) 
{
Scanner inp = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int inputRows = inp.nextInt();
lower_triangle obj = new lower_triangle(inputRows);
obj.operation();
}
}