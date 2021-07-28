package javaproject1;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		 
		ArrayList Obj1=new ArrayList();
		
		 Obj1.add(163637);
		 Obj1.add('M');
		 Obj1.add("sravana chippala");
		 Obj1.add(13.45);
		 
		 //System.out.println(Obj1);
		 
		 //int size=Obj1.size();
		 
//		 for(int i=0;i<size;i++)
//		 {
//			 System.out.println("values are " + Obj1.get(i));
//			 
//		 }
		 
//		 for(Object e:Obj1)
//		 {
//			 System.out.println(e);
//		 }
//		 

		 Iterator it=Obj1.iterator();
		 
		 while(it.hasNext())
		 {
			 Object value=it.next();
			 System.out.println("values are "+ value);
			 
		 }
		 
		 
		 
		 
		 
	}

}
