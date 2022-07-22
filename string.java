import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("welcome") ;
        System.out.println(sb);
       System.out.println("capacity="+sb.capacity());


   System.out.println("enter a string"); 
   Scanner sc=new Scanner(System.in);
String s=sc.next();
int l=s.length()-1;
for(int i=l;i>=0;i--)
{
    System.out.println(sb.charAt(i));
}
    }}

