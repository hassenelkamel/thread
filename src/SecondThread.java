public class SecondThread implements Runnable{

    // question 3
    public void run() {
        // Traitement
        System.out.println("Mon thread 2");
    }

    public static void main(String[] args)
            throws InterruptedException {
        SecondThread t = new SecondThread();
        t.run();
        // question 3.b
        Thread tr = new Thread() {
            public void run() {
                System.out.println("l’autre avec la classe Thread");
            }
        };
        tr.start();
    }
}
