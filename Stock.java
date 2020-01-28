import java.util.*;
class Stock{
	String name,sym;
	double pre,curr;
	Stock(String name,String sym,double pre,double curr){
		this.name=name;
		this.sym=sym;
		this.pre=pre;
		this.curr=curr;
	}
	double getChangePercentage(){
		return Math.abs(((curr-pre)/curr)*100);
	}

public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	String s1,s2;
	double p,c,res;
	s1=sc.next();
	s2=sc.next();
	p=sc.nextDouble();
	c=sc.nextDouble();
	
	Stock s=new Stock(s1,s2,p,c);
	res=s.getChangePercentage();

	System.out.println(res);

}
}