import java.util.*;

class Datatype
{
  public static void main(String args[])
  {
    int num,target,i,j;

    Scanner input = new Scanner(System.in);
    char sample = input.next().charAt(0);

    if(Character.isDigit(sample))
      System.out.println("Number");
    else if(Character.isLowerCase(sample))
      System.out.println("Lowercase");
    else if(Character.isUpperCase(sample))
      System.out.println("Uppercase");
    else
      System.out.println("Special");
  }
    
}