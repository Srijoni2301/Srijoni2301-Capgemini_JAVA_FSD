package comcg;



public class arithmeticTest
{
	static int x = 1;
	private int y = 3;
	public void method1(int x)
	{
		arithmeticTest t = new arithmeticTest();
		this.x = 2;
		y = 4;

		System.out.println("Test.x: " + arithmeticTest.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		arithmeticTest t = new arithmeticTest();
		t.method1(5);
	}
}





