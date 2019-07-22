public class Test_Static {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = ("mr.he");
		p1.country = ("china");
		p1.speak();
		
		Person p2 = new Person();
		p2.name = "mr.wang";
		p2.speak();
	}
}
//1.共性使用静态，个性使用动态，推荐使用类名. 如person.country = *;
//2.无法从静态的上下文中调用非静态的成员变量，静态的成员变量只能够被静态的方法调用
//3.如果一个类中所有的方法都是静态的，则需要构造私有方法，目的是不让其他类创建本类对象，可以使用类名.直接调用

class Person {
	String name;
	static String country; 
    
	public void speak() {
		System.out.println(name + "..." + country);
    }
}