package javaprograms;

public class Diffmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Diffmethods obj=new Diffmethods();
		
		obj.test();
		
		int l=obj.pnr();
		
		System.out.println(l);
		
		String s=obj.QA();
		System.out.println(s);
		
		int div=obj.division(30,10);
		System.out.println(div);
		

	}
	
	public void test()
	{
		System.out.println("test method");
	}

	public int pnr() {
		System.out.println("pnr method");
		int a=20;
		int b=30;
		int c=a+b;
		return c;
	}
	
	
	public String QA()
	{
		System.out.println("QA");
		
		String a="java";
		return a;
	}
	
	public int division(int x,int y)
	{
		System.out.println("division");
		int d=x/y;
		return d;
		
	}
	
	
}
