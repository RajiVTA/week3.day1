package language;

public abstract class MultipleLanguage implements TestTool
// -----------Assignment 5---------------------------
// Abstract class MultipleLanguage with python() and unimplemented method of ruby()
{
	public void python()
	{
		System.out.println("From Abstract class MultipleLanguage - Python Method");
	}
	
	public void java()
	{
		System.out.println("From Interface Language - Java method");
	}
	
	public void selenium()
	{
		System.out.println("From Interface TestTool - Selenium method");
	}
	abstract void ruby();
	
}
