package practice1;

public class D1 {

	public static void main(String[] args) {
		Students stu=new Students(22, "sri");
		Students stu1=new Students(34, "nivas");
		
		System.out.println(stu.hashCode());
		System.out.println(stu1.hashCode());
		System.out.println(stu==stu1);
	}

}
class Students{
	int sid;
	String name;
	Students(int sid,String name) {
		// TODO Auto-generated constructor stub
	this.sid=sid;
	this.name=name;
	}
}
