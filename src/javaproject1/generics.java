package javaproject1;

import java.util.ArrayList;

public class generics {

	public static void main(String[] args) {
		
		ArrayList<String> Obj1=new ArrayList<String>();
		
		Obj1.add("sravana");
		Obj1.add("Daya");
		Obj1.add("Mohan");
		Obj1.add("saha");
		
		for(String s:Obj1)
		{
			System.out.println(s);
			
		}

	}

}
