package app;

public class Fruits extends Thread {
    private String[] fruits= {"Apple", "Banana", "Orange", "Grapes", "Watermelon"};

    @Override
    public void run() {
        printFruits();
    }

    public void printFruits() {
        Thread.yield();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
