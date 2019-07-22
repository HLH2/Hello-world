public class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
        c.eat();
        c.sleep();
        c.high();
        c.setName("Ӣ�̣�������");
        c.setAge(4);
        System.out.println(c.getName() + c.getAge());
        
        System.out.println("------");
        
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.setName("��ʿ��");
        d.setAge(3);
        System.out.println(d.getName() + d.getAge());
	}
}

/*
�����ࣺ���������䣬�Է���˯����è�͹����ӿ�Ϊ������
*/

abstract class Animal {
    private String name;
    private int age;
    public Animal() {};
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public abstract void eat();
    public abstract void sleep();
}

interface High {
    void high();
}

class Cat extends Animal implements High {
    public Cat() {};
    public Cat(String name,int age) {
        super(name,age);
    }
    public void high () {
        System.out.println("�һ�������");
    }
    public void eat() {
        System.out.println("��ϲ������");
    }
    public void sleep() {
        System.out.println("��ſ��˯��");
    }
}

class Dog extends Animal {
    public Dog() {};
    public Dog(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("��ϲ������");
    }
    public void sleep() {
        System.out.println("�Ҳ���˯��");
    }
}