class Dome4_HelloWorld {
	public static void main(String[] agrs) {
		Student s1 = new Student();
		s1.show();
	}
}

class Student {
	private String name = "helh";
	private int age = 19;
	
	public void show() {
		System.out.println("My name is : " + name + '\t'+ "my age is :" + age);
	}
}