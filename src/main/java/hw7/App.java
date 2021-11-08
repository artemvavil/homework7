package hw7;

public class App {
    public static void main (String [] args) {
        Cat [] cat = new Cat[3];
        cat [0] = new Cat("Васька",50, 15);
        cat [1] = new Cat ("Мурка", 14, 50);
        cat [2] = new Cat("Барсик", 25, 30);
        Plate plate = new Plate(100);

        do {
            for (Cat i: cat ) {
                if (i.getSatiety() ==0){
                    if ( plate.checkFood(i.getAppetite())){
                        plate.occupancyFood(100);
                    }
                }
                i.eat(plate);
                System.out.println( "Кот по имени " +i.getName()+ " съел " +i.getAppetite()+ " корма");

                i.setSatiety(i.getSatiety() -1);
            } break;
        } while (true);
    }
}
