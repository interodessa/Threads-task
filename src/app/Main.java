package app;

public class Main {
    public static void main(String[] args) {
        Fruits fruitThread = new Fruits();
        Vegetables vegetableThread = new Vegetables();
        fruitThread.start();
        vegetableThread.start();

}
}
