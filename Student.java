package MQ2_6643005;

public class Student {
	private int id =0;
	private String name = "";
	private double Midterm = 0.0;
	private double Final = 0.0; 
	
	public Student() {
		 id=0;
		 name=null;
		Midterm= 0.0;
		Final= 0.0;
	}
	
	public  Student( int id , String name,double Midterm, double Final) {
		this.id= id;
		this.name = name;
		this.Midterm= Midterm;
		this.Final = Final;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMidterm() {
		return Midterm;
	}

	public void setMidterm(double midterm) {
		Midterm = midterm;
	}

	public double getFinal() {
		return Final;
	}

	public void setFinal(double final1) {
		Final = final1;
	}
	public void displayStudent() {
		
	}
	
	public double totalScores() {
		double total = 0.0;
	       total= Midterm+Final;
	 
    }
	
	
    
		
	
	

}
