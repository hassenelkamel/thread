public class TestThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            // question 1
            public void run() {
                System.out.println("Mon thread 1");
            }
        };
        t.start();
    }
}
