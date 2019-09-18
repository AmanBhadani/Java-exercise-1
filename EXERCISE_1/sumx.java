import java.util.*;
import java.lang.*;

class Sumx
{
  public static void main(String args[])
  {
    int sum=0,num;
    Scanner in= new Scanner(System.in);

    String s= in.nextLine();

    String str[]= s.split(" ");

    for(String sd:str)
    {
      if(!test(sd))
      {
        System.out.println("Error");
        System.exit(0);
      }
      else
        sum+=Integer.parseInt(sd);
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