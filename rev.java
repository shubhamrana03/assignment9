import java.util.*;
public class rev
{
 public static void main(String[] args)
{
 Scanner in = new Scanner(System.in);
 String a = in.next();
 char[] yo= a.toCharArray();
for(int i = yo.length-1;i>=0;i--)
{
 System.out.print(yo[i]);
}
System.out.print("\n");
}
}