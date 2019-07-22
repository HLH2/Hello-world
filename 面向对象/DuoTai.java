public class DuoTai {
	public static void main(String[] args) {
        method(new Dog());
        method(new Cat());
        
        //Animal a = new Cat();  开发的时候一般是很少使用父类引用子对象，直接创建对象更加方便，可以使用子类中的特有属性和行为
	}
    //如果把Dog强行转换成Cat，那么就会出现类型转换异常，classCastException
    public static void method(Animal a) {   //当做参数的时候用多态最好，因为扩展性强
        //关键字：instanseof：判断前边的引用是后边的数据类型
        if (a instanceof Cat) {
            Cat c = (Cat)a;            //如果希望使用子类特有方法，需要进行强转之后才能够进行使用
            c.eat();
            c.bn();
        }else if (a instanceof Dog) {
            Dog d = (Dog)a;
            d.eat();
            d.LookHome();
        }else {
            a.eat();
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("动物吃饭");
    }
     public void benneng() {
        System.out.println("动物本能");
    }
}

class Cat extends Animal {
     public void eat() {
        System.out.println("猫吃鱼");
    }
     public void bn() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
     public void eat() {
        System.out.println("狗吃肉");
    }
     public void LookHome() {
        System.out.println("看家");
    }
}