public class Test_JAVA_Mark {
    public static void main(String[] args) {
        a: for (int x = 1;x <= 10 ;x++ ){
            System.out.println("x = " + x);
            b: for (int p = 1;p <= 10 ;p++ ){
                System.out.println("p = " + p);
                break a;
            }
        }
    }
}
