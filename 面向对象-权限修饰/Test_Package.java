import com.sina.Person;
import com.xxx.Test_Student;
public class Test_Package {
	public static void main(String[] args) {
		Person p = new Person();
        p.setName("������");
        p.setAge(19);
        p.print();  //�ڲ�ͬ���µ��޹��࣬��������ʣ���Ϊ��Protected���ε�
        System.out.println(p.getName() + "..." + p.getAge());
	}
}