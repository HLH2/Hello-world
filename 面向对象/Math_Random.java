public class Math_Random {
	public static void main(String[] args) {
		//double d = Math.random();
        //System.out.println(d);
        
        //Math.random() 会生成大于等于0.0并且小于1.0的伪随机数
        //如果希望生成1-100的随机数，可以使用Math.random() * 100 ;
        //如果希望生成0-99的随机整数，可以使用int类型，格式如：(int) (Math.random() * 100);
        //如果希望生成0-100的随机整数，可以使用(int) (Math.random() * 100) + 1;
        for (int i = 0;i < 10 ;i++) {
            System.out.println(Math.random());
        }
        
        for (int i = 0;i < 10 ;i++) {
            System.out.println((int) (Math.random() * 100) + 1);
        }
    }
}