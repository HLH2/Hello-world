public class Test1_Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
        c.eat();
        c.sleep();
        c.high();
        c.setName("英短，银渐层");
        c.setAge(4);
        System.out.println(c.getName() + c.getAge());
        
        System.out.println("------");
        
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.setName("哈士奇");
        d.setAge(3);
        System.out.println(d.getName() + d.getAge());
	}
}

/*
动物类：姓名，年龄，吃饭，睡觉，猫和狗。接口为：跳高
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
        System.out.println("我还会跳高");
    }
    public void eat() {
        System.out.println("我喜欢吃鱼");
    }
    public void sleep() {
        System.out.println("我趴着睡觉");
    }
}

class Dog extends Animal {
    public Dog() {};
    public Dog(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("我喜欢吃肉");
    }
    public void sleep() {
        System.out.println("我侧着睡觉");
    }
}