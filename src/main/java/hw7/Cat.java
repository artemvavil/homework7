package hw7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;


    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

}

