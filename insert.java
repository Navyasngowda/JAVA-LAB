public class insert {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("java") ;
        System.out.println("original word="+sb);
    char s1;
    String s2="";
        for(int i=0;i<sb.length();i++)
        {
          s1=sb.charAt(i);
          s2=s1+s2;
            
        }
      
        System.out.println(sb.charAt(1));
    }}
