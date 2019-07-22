public class Dome_Extends3 {
	public static void main(String[] args) {
		Sonu s = new Sonu();
        System.out.println(s.getName() + "..." + s.getAge());
        System.out.println("----------");
        Sonu s1 = new Sonu("何龙辉",19);
        System.out.println(s1.getName() + "..." + s1.getAge());
	}
}

/*
super(....)或者this(....)必须出现在构造方法的第一条语句
*/

class Father1 {
    private String name;
    private int age;
    
    public Father1() {
        System.out.println("This is 空参构造");
    }
    
    public Father1(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("This is 有参构造");
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
}

class Sonu extends Father1 {
    public Sonu() {
        ///super("王浩田",22);    //调用父类中的构造方法
        this("李朝阳",20);       //调用本类的构造方法      This跟super只能存在一个，一山不容二虎
        System.out.println("子类的空参构造");
    }
    
    public Sonu(String name,int age) {
        super(name,age);
        System.out.println("子类的有参构造");
    }
}