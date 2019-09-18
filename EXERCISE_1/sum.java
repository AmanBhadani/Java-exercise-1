import java.util.*;
import java.lang.*;

class Sum
{
  public static void main(String args[])
  {
    int sum=0;
    for(int i=0;i<args.length;i++)  
    {
      if(test(args[i]))
      {
        sum=sum+Integer.parseInt(args[i]);
      }
      else
      {
        System.out.println("Error");
        System.exit(0);
      }
    }
    System.out.println(sum);
    

  }
  static boolean test(String s)
  {
    for(int i=0;i<s.length();i++)
    {
      if(!((Character.isDigit(s.charAt(i)))||(s.charAt(i)=='-')))
        return false;
    }

    return true;
  }
}