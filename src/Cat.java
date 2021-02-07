public class Cat {
    private String name;
    private int appetite;

    public int getSaturation() {
        return saturation;
    }

    private int saturation;


    public Cat(String name, int appetite, int saturation) {
        this.appetite = appetite;
        this.name = name;
        this.saturation = saturation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int fullnessCat() {
        this.saturation = saturation;
        saturation = 1;
        return saturation;
    }


    public void eat(Plate p) {

        p.decreaseFood(appetite);
        System.out.println("Котик " + name + " съел " + appetite + " гр.");
    }


}
