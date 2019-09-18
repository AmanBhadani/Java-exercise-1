import java.lang.*;
import java.util.*;

class Sort
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

      if(rem%2==0)
        sum=sum+rem;

      m = m / 10;
      counter++;
    }

    String str = Integer.toString(num);

    char st[]= str.toCharArray();

    Arrays.sort(st);

    StringBuilder stb= new StringBuilder();

    stb.append(st);

    stb=stb.reverse();

    System.out.println("Sorted "+stb);
    
    if(sum>15)
    {
      System.out.println("sum of even "+sum);
      System.out.println("True");
    }
    else
    {
      System.out.println("sum of even "+sum);
      System.out.println("False");
    } 
    
  }
    
}