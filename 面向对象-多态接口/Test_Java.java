public class Test_Java {
	public static void main(String[] args) {
		Manage m = new Manage();
        m.setName("何龙辉");
        m.setId("系统运行部056");
        m.setMoney(8500);
        m.setBouns(10000);
        System.out.println("我的名字是：" + m.getName() + ",我的工号是：" + m.getId() + ",我的工资是：" + m.getMoney() + ",我的奖金是：" + m.getBouns());
        
        APE a = new APE();
        a.setName("李朝阳");
        a.setId("图信中心005");
        a.setMoney(5500);
        System.out.println("我的名字是：" + a.getName() + ",我的工号是：" + a.getId() + ",我的工资是：" + a.getMoney() + ",因为我是一名程序猿，所以我没有奖金");
	}
}

/*
abstract不能跟static共存，因为被static修饰的可以通过类名.调用，而abstract是不允许调用方法的
abstract不能跟final共存，被abstract修饰的方法强制子类重写，而final修饰的方法不允许子类重写，所以他们两个是矛盾的
abstract不能跟private共存，被abstract修饰的是让子类看到并且重写，但private就是的不让子类访问，所以他们两个是矛盾的
*/


class Employee {
    private String name;
    private String id;
    private double money;
    
    public Employee() {};
    public Employee(String name,String id,double money) {
        this.name = name;
        this.id = id;
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public double getMoney() {
        return money;
    }
}

class Manage extends Employee {
    private int Bouns;         
    public Manage() {}
    public Manage(String name,String id,double money,int Bouns) {
        super(name,id,money);
        this.Bouns = Bouns;
    }
    public void setBouns(int Bouns) {
        this.Bouns = Bouns;
    }
    public int getBouns() {
        return Bouns;
    }
}

class APE extends Employee {
    public APE() {}
    public APE(String name,String id,double money) {
        super(name,id,money);
    }
}