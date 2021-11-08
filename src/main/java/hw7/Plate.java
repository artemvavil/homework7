package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public int getFood() {
        return food;
    }
    public void decreaseFood (int i) {
        this.food -= i;

    }
// Метод проверящий остаток еды в тарелке больше 0
    public boolean checkFood(int i) {
        return ((food -i) >= 0);
    }
// наполняемость миски
    public void occupancyFood (int i) {
        this.food +=100;
        System.out.println(" В миске находится" +this.food+ "корма");
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
