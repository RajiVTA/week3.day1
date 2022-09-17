package student;

public class Students {
	//Overloading Main
	//--------------Assignment 4 ------------------
	public void getStudentInfo(int id)
	//getStudentInfo() method by passing id argument alone
	{
		System.out.println("Student id  is  " +id);;
	}

	public void getStudentInfo(int id, String name)
	// getStudentInfo() method by passing id and name
	{
		System.out.println("Student id is  "  +id);
		System.out.println("Student name is " +name);
	}
	
	public void getStudentInfo(String email, String phone)
	//getStudentInfo() method by passing email and phone
	{
		System.out.println("Student email is " +email);
		System.out.println("Student phone is " +phone);
	}
	public static void main(String[] args) {
	
		Students ss=new Students();
		ss.getStudentInfo(100101);
		ss.getStudentInfo(200201, "Deepthi");
		ss.getStudentInfo("abc@gmail.com", "912345124");
		
		
	}

}
