import java.util.Random;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int setFood(int food) {
        this.food = food;
        Random random = new Random();
        return random.nextInt(200);
    }

    public void decreaseFood(int m) {
        food -= m;
    }

    public int increaseFood() {
        Random random = new Random();
        return random.nextInt(200);
    }

    public void info() {
        System.out.println("В тарелке: " + food + " гр. кошачьего корма.");
        if (food == 0) {
            return;
        }
    }

}
