import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num%2==0 && num>20 && num<30  )
      System.out.println("Tom");
    else if( num%2==1 && num>20 && num<30)
      System.out.println("Jerry");
    else
      System.out.println("NA");
  }
}