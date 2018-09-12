import java.util.*;
public class vowel
{
public static void main(String[] args)
{
String s1,s2;
Scanner in =new Scanner(System.in);
System.out.println("Enter a string : ");
s1=in.next();

s2=s1.replaceAll("[aeiouAEIOU]","");
System.out.println("After removing vowels string is : ");
System.out.println(s2);
}
}