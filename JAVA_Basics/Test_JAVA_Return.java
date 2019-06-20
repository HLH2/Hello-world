public class Test_JAVA_Return {
    public static void main(String[] args){
        for (int x = 1;x <= 10 ;x++ ){
            if (x%3==0) {
                return;
            }
            System.out.println("循环结束了");
        }
    }
}
