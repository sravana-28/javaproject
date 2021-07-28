package javaprograms;

public class reverseString {

	public static void main(String[] args) {
		
		 String s="selenium";
		
		//int len=s.length();
		//String rev="";
		
		//for(int i=len-1;i>=0;i--)
		//{
			//rev=rev+s.charAt(i);
		//}
		//System.out.println("reverse number is:"+rev);
			
			
		StringBuffer sf=new StringBuffer(s);
		System.out.println("reverse string:"+sf.reverse());
		

	}

}
