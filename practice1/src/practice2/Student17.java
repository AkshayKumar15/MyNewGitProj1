package practice2;

class Person{  
void message(){System.out.println("welcome");}  
}  
  
class Student17 extends Person{  
  
void display(){  
message();//will invoke parent class message() method  
super.message();
}  
  
public static void main(String args[]){  
Student17 s=new Student17();  
s.display();  
}  
}  
