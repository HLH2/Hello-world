public class DuoTai {
	public static void main(String[] args) {
        method(new Dog());
        method(new Cat());
        
        //Animal a = new Cat();  ������ʱ��һ���Ǻ���ʹ�ø��������Ӷ���ֱ�Ӵ���������ӷ��㣬����ʹ�������е��������Ժ���Ϊ
	}
    //�����Dogǿ��ת����Cat����ô�ͻ��������ת���쳣��classCastException
    public static void method(Animal a) {   //����������ʱ���ö�̬��ã���Ϊ��չ��ǿ
        //�ؼ��֣�instanseof���ж�ǰ�ߵ������Ǻ�ߵ���������
        if (a instanceof Cat) {
            Cat c = (Cat)a;            //���ϣ��ʹ���������з�������Ҫ����ǿת֮����ܹ�����ʹ��
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
        System.out.println("����Է�");
    }
     public void benneng() {
        System.out.println("���ﱾ��");
    }
}

class Cat extends Animal {
     public void eat() {
        System.out.println("è����");
    }
     public void bn() {
        System.out.println("ץ����");
    }
}

class Dog extends Animal {
     public void eat() {
        System.out.println("������");
    }
     public void LookHome() {
        System.out.println("����");
    }
}