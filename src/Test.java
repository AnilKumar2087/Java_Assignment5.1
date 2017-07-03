/*
 *As below class is inheriting  abstract class it should implement its abstract method
 */
public class Test extends Abstract_Demo
{

	public void ab_Print()
	{
		
		System.out.println("Hi From abstract method defined in child class");
		
	}
	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		Test obj=new Test();
		
		//calling abstract method implemented in child class
		obj.ab_Print();
		obj.Print();

	}

}
