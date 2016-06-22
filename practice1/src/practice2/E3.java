package practice2;

public class E3 
{
	int i=10;
	Integer a=Integer.valueOf(i);
	Integer b=a;

	public static void main(String[] args) 
	{
		E3 e=new E3();
		System.out.println(e.i);
		System.out.println(e.a);
		System.out.println(e.b);
	}

}
