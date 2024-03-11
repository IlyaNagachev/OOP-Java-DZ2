package CatsProgram;

public class Cat {
    private String name;
    private int appetite;
    private boolean isWellFed;

    public String getName() {
        return name;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isWellFed = false; //при создании кота он голоден
    }
    public void eat(Plate plate) {
        if (plate.getFood() >= appetite){
            plate.reducingFood(appetite);
            isWellFed = true;
        }
    }

    public boolean isWellFed() {
        return isWellFed;
    }

}