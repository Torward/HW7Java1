import java.util.Scanner;

public class Main {
    public static int quantityOfCat;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plate plate = new Plate(42);
        for (; ; ) {

            Cat[] arrayCat = new Cat[5];
            arrayCat[0] = new Cat("Живчик", 25, 0);
            arrayCat[1] = new Cat("Каннибальчик", 1, 0);
            arrayCat[2] = new Cat("Баюн", 4, 0);
            arrayCat[3] = new Cat("Рыка", 12, 0);
            arrayCat[4] = new Cat("Ляля", 8, 0);
            for (Cat op : arrayCat) {
                if (plate.getFood() >= op.getAppetite()) {
                    quantityOfCat++;
                    System.out.println("Вы кормите " + quantityOfCat + " коте");
                    plate.info();
                    op.eat(plate);
                    op.fullnessCat();

                    if (op.getAppetite() == plate.getFood()) {
                        op.eat(plate);
                        plate.info();

                    }
                    if (plate.getFood() <= 0) {
                        System.out.println("Еда кончилась! Наложить котикам ещё? Да - 1/ нет - 0");
                        int unoMas = scanner.nextInt();
                        plate = new Plate(plate.increaseFood());

                        if (unoMas == 0) {
                            break;
                        }
                    }


                }


            }
        }
    }
}
