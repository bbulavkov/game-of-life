public class Demo {
    public static void main(String[] args) throws InterruptedException {
        GameOfLife gameOfLife = new GameOfLife();

        for (int i = 0; i < 100; i++) {

            gameOfLife.print();
            gameOfLife.nextGeneration();
            System.out.println("Next Generation");

            Thread.sleep(500);
        }
    }
}
