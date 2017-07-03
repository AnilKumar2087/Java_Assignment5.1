

/*Create an abstract class Parent and define an abstract methods in
it and implement it in the child*/

/*Abstract class is defined using keyword abstract*/
public abstract class Abstract_Demo

{
	//below is abstract method which only have declaration
	public abstract void ab_Print();
	
	//Below is complete method which has declaration as well as defination
	public void Print()
	{
		
		System.out.println("Hi From non abstract Method");
	}
	
}