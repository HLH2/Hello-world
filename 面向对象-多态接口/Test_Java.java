public class Test_Java {
	public static void main(String[] args) {
		Manage m = new Manage();
        m.setName("������");
        m.setId("ϵͳ���в�056");
        m.setMoney(8500);
        m.setBouns(10000);
        System.out.println("�ҵ������ǣ�" + m.getName() + ",�ҵĹ����ǣ�" + m.getId() + ",�ҵĹ����ǣ�" + m.getMoney() + ",�ҵĽ����ǣ�" + m.getBouns());
        
        APE a = new APE();
        a.setName("���");
        a.setId("ͼ������005");
        a.setMoney(5500);
        System.out.println("�ҵ������ǣ�" + a.getName() + ",�ҵĹ����ǣ�" + a.getId() + ",�ҵĹ����ǣ�" + a.getMoney() + ",��Ϊ����һ������Գ��������û�н���");
	}
}

/*
abstract���ܸ�static���棬��Ϊ��static���εĿ���ͨ������.���ã���abstract�ǲ�������÷�����
abstract���ܸ�final���棬��abstract���εķ���ǿ��������д����final���εķ���������������д����������������ì�ܵ�
abstract���ܸ�private���棬��abstract���ε��������࿴��������д����private���ǵĲ���������ʣ���������������ì�ܵ�
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