import java.util.Scanner;

class Pattern
{
  public static void main(String args[])
  {
    int num,i,j;
    System.out.println("Enter an Integer number:");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    
    for (i=1;i<=num;i++) 
    {
      for (j=1;j<=i;j++)
      {
        System.out.print(i+" ");  
      } 
    }
    System.out.println();
    
  }
}