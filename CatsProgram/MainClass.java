package CatsProgram;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 15);
        Cat cat2 = new Cat("Тимофей", 3);
        Plate plate = new Plate(10);
        plate.info();

        ArrayList<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);


        for(Cat cat: list){
            cat.eat(plate);
            System.out.println(cat.getName() + " наелся: " + cat.isWellFed());
            //System.out.println(plate.reducingFood(10)); Почему-то не получается запустить метод
        }
    }
}