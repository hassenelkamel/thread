public class MyThread  extends Thread{
    private int in;

    MyThread( int i) {
        in = i;
    }

    public void run() {
        System.out.println("paratge "+ in);
    }

    public static void main(String args[]) {
        Thread T1 = new MyThread( 1 );
        Thread T2 = new MyThread( 6);
        T1.start();
        T2.start();
    }
}
