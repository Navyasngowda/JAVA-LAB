
class method{
    float l,b,h;
    double area(double l,double b)
    {
        return l*b;
    }
    float area(float l,float h)
    {
        return l*h/2;

    }
    double area(double l)
    {
        return 2*l;
    }
    }

public class AREA {
    public static void main(String[] args) {
      method m1=new method();
      float l=10,h=30;
      double a=20,b=20;
      System.out.println("method overload area\n"); 
      float triangle=m1.area(l, h) ;
      double square =m1.area(a);
      double rectangle=m1.area(l,b);
      System.out.println("area of triangle="+triangle);
      System.out.println("area of square="+square);
      System.out.println("area of rectangle="+rectangle);
    }
}
