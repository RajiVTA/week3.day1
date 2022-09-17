package language;

public class Automation extends MultipleLanguage {

	public void ruby()
	{
		System.out.println("From Abstract class MultipleLanguage - Ruby Method");
	}
	public static void main(String[] args) {
	// --------------Assignment 5 Execution class --------------
	// Implement all the methods of Interface and Abstract Class
		
		Automation auto=new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();

	}

}
