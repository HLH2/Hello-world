public class Math_Random {
	public static void main(String[] args) {
		//double d = Math.random();
        //System.out.println(d);
        
        //Math.random() �����ɴ��ڵ���0.0����С��1.0��α�����
        //���ϣ������1-100�������������ʹ��Math.random() * 100 ;
        //���ϣ������0-99���������������ʹ��int���ͣ���ʽ�磺(int) (Math.random() * 100);
        //���ϣ������0-100���������������ʹ��(int) (Math.random() * 100) + 1;
        for (int i = 0;i < 10 ;i++) {
            System.out.println(Math.random());
        }
        
        for (int i = 0;i < 10 ;i++) {
            System.out.println((int) (Math.random() * 100) + 1);
        }
    }
}