import java.util.*;

class Pal
{
  public static void main(String args[])
  {
    int num,w=0,rem=0,counter=0,sum=0;

    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    int m = num;

    int arr[];
    while(m > 0)
    {
      rem=m%10;
      w=w*10+rem;

      if(rem%2==0)
        sum=sum+rem;

      m = m / 10;
      counter++;
    }
    
    if(w!=num)
    {
      System.out.println("Not a palindrome");
    }
    else
    {
      if(sum>25)
      {
        System.out.println("Palindrome and Greater");
      }
      else
      {
        System.out.println("Palindrome and Lesser");
      } 
    }
  }
    
}