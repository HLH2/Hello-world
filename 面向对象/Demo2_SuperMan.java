public class Demo2_SuperMan {
	public static void main(String[] args) {
		Person p = new SuperMan();    //向上转型
        System.out.println(p.name);
        p.谈生意();
        //p.teyou();     //多态的弊端，无法使用子类特有的属性
        
        SuperMan sm = (SuperMan)p;    //向下转型，把p类型转型为sm
        sm.谈生意();     
        sm.teyou();    //子类是可以使用自己特有的方法
        System.out.println(sm.name);
	}
}

/*
多态的好处：
    1.提高了代码的维护性（继承保证）
    2.提高了的代码的扩展性（由多态保证）
    
多态的坏处：
    不能使用子类的特有属性
*/



class Person {
    String name = "mr.he";
    public void 谈生意() {
        System.out.println("我是父类的");
    }
}

class SuperMan extends Person {
    String name = "superman";
    public void 谈生意() {
        System.out.println("我也是子类的");
    }
    
    public void teyou() {
        System.out.println("我是特有的属性");
    }
}