package practice1;

public class F1 {

	void test1()
	{
		System.out.println("test1");
		this.test2();
	}
	
	void test2()
	{
		System.out.println("test2");
		this.test1();
	}
	
	public static void main(String[] args) 
	{
		F1 f=new F1();
		f.test1();
		f.test2();

	}

}
