import java.util.*;
class RandomHelper{
 static double getRandomDouble(double min, double max){
    double x = (Math.random()*((max-min)+1)+min);
    return x;
}
 static int getRandomInt(double min, double max){
   int x =(int) (Math.random()*((max-min)+1)+min);
    return x;
}

}
class Demo{
public static void main(String [] args){
double d1,d2;
Scanner sc=new Scanner(System.in);
d1=sc.nextDouble();
d2=sc.nextDouble();
System.out.println(RandomHelper.getRandomInt(d1,d2));
System.out.println(RandomHelper.getRandomDouble(d1,d2));


}
}