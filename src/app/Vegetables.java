package app;

public class Vegetables extends Thread {
    private String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Cucumber", "Potato"};

    @Override
    public void run() {

        printVegetables();
    }

    public void printVegetables() {
        for (String vegetable : vegetables) {
            System.out.println(vegetable);
        }
    }
}
