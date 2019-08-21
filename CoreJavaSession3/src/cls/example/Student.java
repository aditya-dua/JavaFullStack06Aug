package cls.example;

public class Student {

	static {
		System.out.println("Class is Loading..");
	}
	//Data Members
	private int id;
	private String name;
	private int age;
	private String emailId;
	static int studentCount=0;
	boolean isTrue;
	// If you have 2 variables with the same, the one with the most local 
	//scope is given preference.
	
	
	public Student(){
		studentCount++;
		System.out.println("In default constructor....");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = Student.studentCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Student(int id,String name,int age,String emailId){
		//this();
		studentCount++;
		this.id=id;
		
		this.name=name;
		this.age=age;
		this.emailId=emailId;
	}
	
	/*public void inputData(int id,String name,int age,String emailId){
		this.id=id;
		this.name=name;
		this.age=age;
		this.emailId=emailId;
	}*/
	
	public void display(){
		System.out.println("The student details are as follows: ");
		System.out.println("ID  :"+id);
		System.out.println("Name:"+name);
		System.out.println("Age :"+age);
		System.out.println("mail:"+emailId);

	}
	
	public static void printHelloWorld(){
		System.out.println("Hello World.");
	}
}
