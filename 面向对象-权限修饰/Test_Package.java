import com.sina.Person;
import com.xxx.Test_Student;
public class Test_Package {
	public static void main(String[] args) {
		Person p = new Person();
        p.setName("何龙辉");
        p.setAge(19);
        p.print();  //在不同包下的无关类，不允许访问，因为是Protected修饰的
        System.out.println(p.getName() + "..." + p.getAge());
	}
}