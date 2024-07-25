
/**
 * HiPrinter
 */
class HiPrinter extends Thread {

    public void run() {
        for (int n = 0; n < 100; n++)
            System.out.println("Hiiii");
    }

}

class HelloPrinter extends Thread {
    public void run() {
        for (int n = 0; n < 100; n++)
            System.out.println("hello");
    }
}

public class multiThreading {
    public static void main(String[] args) {
        HiPrinter hi = new HiPrinter();
        HelloPrinter hello = new HelloPrinter();
        hi.start();
        hello.start();
    }
}
