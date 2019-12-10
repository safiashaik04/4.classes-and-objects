class Box
{
double width;
double height;
double depth;
void initialize(int w,int h,double d)
{
this.width=w;
this.height=h;
this.depth=d;
}
double volume()
{
double ans;
ans=(width*height)*depth;
return ans;
}
}
class P1
{
public static void main(String args[])
{
Box b1=new Box();
b1.initialize(20,10,400);
double r=b1.volume();
System.out.println("Volume of box:"+r);
}
}