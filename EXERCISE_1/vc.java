import java.util.*;

class Vc
{
  public static void main(String args[])
  {
    int num,target,j;

    Scanner input = new Scanner(System.in);
    String sample = input.next();

    for(int i=0;i<sample.length();i++)
    {
      if(!Character.isLetter(sample.charAt(i)))
      { 
        System.out.println("Error");
        System.exit(0);
      }
    }


    for(int i=0;i<sample.length();i++)
    {
      if(sample.charAt(i)=='a'||sample.charAt(i)=='e'||sample.charAt(i)=='i'||sample.charAt(i)=='o'||sample.charAt(i)=='u'||sample.charAt(i)=='A'||sample.charAt(i)=='E'||sample.charAt(i)=='I'||sample.charAt(i)=='O'||sample.charAt(i)=='U')
        System.out.print("Vowel ");
      else
        System.out.print("Consonent ");
    }

    System.out.println();



  }
    
}