public class Test_Animal {
	public static void main(String[] args) {
		Cat c = new Cat();
        c.setName("美短");
        c.setAge(5);
        c.eat();
        System.out.print('\t' + "我叫" + c.getName() + '\t' + "我今年" + c.getAge() + "岁了" + '\t' + "我会");
        c.tx();
        
        System.out.println("-------");
        Dog d = new Dog();
        d.setName("旺财");
        d.setAge(4);
        d.eat();
        System.out.print("我叫" + d.getName() + '\t' + "我今年" + d.getAge() + "岁了" + '\t' + "我会");
        d.LookHome();
	}
}

/*
共性：姓名，年龄，吃饭
猫的特性：抓老鼠
狗的特性：看家
*/

abstract class Animal {
    private String name;     //姓名
    private int age;         //年龄
    
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
}

class Cat extends Animal {
    public Cat() {}
    
    public Cat(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void tx() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {}
    
    public Dog(String name,int age) {
        super(name,age);
    }
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void LookHome() {
        System.out.println("看家");
    }
}