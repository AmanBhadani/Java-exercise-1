import java.util.*;

class Guess
{
  public static void main(String args[])
  {
    int num,target,i,j;
     
    Random rand= new Random();

    target= rand.nextInt(100);


    System.out.println("Enter an Integer number between 1 to 100:");

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    while(num!=target)
    {
      if(num>target)
      {
        System.out.println("NUMBER EXCEED");
        num=input.nextInt();
      }
      else
      {
        System.out.println("NUMBER LESS");
        num=input.nextInt();
      }
    }
    if(num==target)
    {
      System.out.println("NUMBER MATCHED");
    }
    
  }
}