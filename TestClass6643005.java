
/*
 * Name-Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
 package MQ2_6643005;

import MQ2_6643005.Student;


public class TestClass6643005  {
	public static void main(String[]args) {
		Student std1 = new Student(); 
		std1.getId();
		std1.getName();
		std1.getMidterm();
		std1.getFinal();
		std1.displayStudent();
		
		Student std2 = new Student(6710001,"Student two"); 
		std2.getId();
		std2.getName();
		std2.getMidterm();
		std2.getFinal();
		std2.displayStudent();
		
		Student std3 = new Student(6710002,"Student Three",150); 
		std3.getId();
		std3.getName();
		std3.getMidterm();
		std3.getFinal();
		std3.displayStudent();
		
		Student std4 = new Student(6710001,"Student Four",36,-5); 
		std4.getId();
		std4.getName();
		std4.getMidterm();
		std4.getFinal();
		std4.displayStudent();
		
		Student[] stdArray= [std1,std2,std3,std4];
		System.out.println("\n----------");
		System.out.println("The class mean of "+stdArray.length+"student is");
		
		
        
		
	}
	


}
