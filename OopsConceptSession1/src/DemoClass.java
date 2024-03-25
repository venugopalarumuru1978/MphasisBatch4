public class DemoClass {

	private int x, y;
	
	public void getdata()
	{
		x = 100;
		y = 200;
	}
	
	public void putdata()
	{
		System.out.println("X value is : " + x);
		System.out.println("Y value is : " + y);
		int sum = x+y;  // sum is a local variable.
		System.out.println("Sum value is : " + sum);
	}
}
