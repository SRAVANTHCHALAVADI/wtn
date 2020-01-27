import java.util.*;
class Box{
double w,h,d;
Box(double w,double h,double d){
this.w=w;
this.h=h;
this.d=d;
}
double vol(){
return w*h*d;
}
public static void main (String [] args){
Scanner sc=new Scanner(System.in);
double d1,d2,d3;
d1=sc.nextDouble();
d2=sc.nextDouble();
d3=sc.nextDouble();
Box b =new Box(d1,d2,d3);
double res=b.vol();
System.out.println(res);

}

}