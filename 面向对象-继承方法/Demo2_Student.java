class Student {
    static {
        System.out.println("Student ��̬�����");
    }
    
    {
        System.out.println("Student ��������");
    }
    
    public Student() {
        System.out.println("Student ���췽��");
    }
}

//��̬�������������������ִ�еģ�

class Demo2_Student {
    static {
        System.out.println("Demo2_Student��̬����� ");
    }
    
	public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
	}
}
