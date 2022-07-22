class CONS_DEMO
{
    double l;
    double b;
    double h;
    

CONS_DEMO(Double l,Double b,Double h)
{
    this.l=l;
    this.b=b;
    this.h=h;
}

CONS_DEMO(Double l)
{
    this.l=b=h=l;
    
}
double volume()
{
    return l*b*h;
}

void print()
{
    System.out.println("method overloaded");
}
void print(double v)
{
    System.out.printf("VOLUME OF cuboid="+v);
    
}
}

public class CONSTRUCTOR_DEMO {
 public static void main(String[] args) {
    CONS_DEMO cuboid=new CONS_DEMO(10.0,20.0,30.0);
    CONS_DEMO cube=new CONS_DEMO(4.0);
    double v1=cuboid.volume();
    double v2=cube.volume();
    cuboid.print();
    cube.print();
    cuboid.print(v1);
    cube.print(v2);

        
    }

}    

