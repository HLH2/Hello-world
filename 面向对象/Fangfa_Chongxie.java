public class Fangfa_Chongxie {
	public static void main(String[] args) {
		Ios8 i = new Ios8();
        i.siri();
        i.call();
	}
}

/*
重写方法注意事项：
1.在父类中，私有的方法是不能被重写的，因为父类私有的方法根本就无法继承
2.子类重写父类方法的时候，访问权限最好保持一致
3.静态的只能够覆盖静态的方法，不能够覆盖非静态的
4.overload可以改变返回值类型，只看参数列表
方法重写： 子类中出现了和父类中方法声明一模一样的方法，与返回值类型有关，返回值是一致（或是子父类的）
方法重载： 本类中出现的方法名一样，参数列表不同的方法，与返回值无关
子类对象调用方法的时候：
            先找子类本身，再找父类
*/

class Ios7 {
    public void call() {
        System.out.println("打电话");
    }
    
    
    public void siri() {
        System.out.println("speak English");
    }
}

class Ios8 extends Ios7 {
    public void siri() {
        super.siri();     //使用子方法重新定义，以覆盖父方法，如果希望保留以前的功能，则从子方法调用父方法
        System.out.println("speak chinese");
    }
}