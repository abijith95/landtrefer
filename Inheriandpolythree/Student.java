abstract class Student {
	String name;
	int rollno;
	String course;
	String specialization;
	int year;
	
	public Student(String name,int rollno,String course,String yearOrspecialization)
	{
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.specialization = yearOrspecialization;
		
	}
	public Student(String name,int rollno,String course,int yearOrspecialization)
	{
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.year = yearOrspecialization;;
		
	}
	abstract void display();
}
