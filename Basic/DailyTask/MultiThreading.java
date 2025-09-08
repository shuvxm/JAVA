
class Printer {
    boolean isEvenTurn;

    public synchronized void printEven(int number) {
        // while (!isEvenTurn) {
        // try {
        // wait();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // }
        System.out.println(number);
        isEvenTurn = false;
        notify();
    }

    public synchronized void printOdd(int number) {
        // while (isEvenTurn) {
        // try {
        // wait();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // }
        System.out.println(number);
        isEvenTurn = true;
        notify();
    }
}

class EvenThread extends Thread {
    Printer printer;
    int max;

    public EvenThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddThread extends Thread {
    Printer printer;
    int max;

    public OddThread(Printer printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int max = 10;
        Thread oddThread = new OddThread(printer, max);
        Thread evenThread = new EvenThread(printer, max);
        oddThread.start();
        evenThread.start();
    }
}
