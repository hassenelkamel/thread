public class FirstThread extends Thread {
    private boolean running = true;

 // quesion 2
    @Override
    public void run() {
        while(running) {
            // Traitement
            System.out.println("Mon thread 1");
            running = false;
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        Thread t = new FirstThread();
        t.start();
        Thread.sleep(30); // Attente 1 seconde avant d'interrompre changer to 5000 = 5 s to show to student
        t.interrupt();
    }
}
