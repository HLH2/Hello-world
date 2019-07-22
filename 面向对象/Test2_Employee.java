public class Test2_Employee {
	public static void main(String[] args) {
		Employee s1 = new Employee("mr.he","1372581",19);
		s1.work();
		
		System.out.println("___________________");
		
		Employee p1 = new Employee();
		p1.setName("mr.li");
		p1.setId("189002");
		p1.setSalary(20);
		System.out.println("My name is : " + p1.getName() + '\t' + "My id is : " + p1.getId() + '\t' + "My salary id : " + p1.getSalary());
		p1.setSalary(8000);
		System.out.println("My name is : " + p1.getName() + '\t' + "My id is : " + p1.getId() + '\t' + "My salary id : " + p1.getSalary());
	}
}

class Employee{
	private String name;   //name
	private String id; //id
	private double salary;  //Monery
	
	public Employee() {
		
	}
	
	public Employee(String name,String id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setName(String name) {   //获取名字
		this.name = name;
	}
	
	public String getName() {            //返回名字
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}	
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void work() {
		System.out.println("My name is : " + name + '\t' + "My id is : " + id + '\t' + "My salary id : " + salary);
	}
}