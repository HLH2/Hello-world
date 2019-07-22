class Student {
    static {
        System.out.println("Student 静态代码块");
    }
    
    {
        System.out.println("Student 构造代码块");
    }
    
    public Student() {
        System.out.println("Student 构造方法");
    }
}

//静态代码块是优先于主方法执行的，

class Demo2_Student {
    static {
        System.out.println("Demo2_Student静态代码块 ");
    }
    
	public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
	}
}
