package javaprograms;

public class Encapsulation {
	
	private int ssn;
	private String name;
	private int EmpAge;
	
	
     
	

	public static void main(String[] args) {
		Encapsulation c=new Encapsulation();
		
		c.setEmpAge(34);
		c.setName("sandhya");
		c.setSsn(12839977);
		
		System.out.println("employee name is:" + c.getName());
		System.out.println("employee age:" + c.getEmpAge());
		System.out.println("employee ssn:" + c.getSsn());
		
		
	}
		
		

	





	public int getSsn() {
		return ssn;
	}





	public void setSsn(int ssn) {
		this.ssn = ssn;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public int getEmpAge() {
		return EmpAge;
	}





	public void setEmpAge(int empAge) {
		EmpAge = empAge;
	}
}

