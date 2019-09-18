import java.util.*;
import java.lang.*;

class Repstr
{
  public static void main(String args[])
  {
    int num,j;
    
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();

    int n = sc.nextInt();

    String append = str.substring(str.length()-n);

    for(int i=0;i<n;i++)
    { 
      str=str+append;
    }

    

    System.out.println(str);
    
  }
}