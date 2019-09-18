import java.util.*;
import java.lang.*;

class Reverse
{
  public static void main(String args[])
  {
    int num,j;
    
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();

    StringBuilder alt = new StringBuilder();

    alt.append(str);

    alt= alt.reverse();

    System.out.println(alt);
    
  }
}