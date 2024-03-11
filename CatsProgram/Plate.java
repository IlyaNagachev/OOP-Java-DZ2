package CatsProgram;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void reducingFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
        } else {
            System.out.println("Не достаточно еды в тарелке!");
        }
    }

    public void increaseFood(int appetite) {

        food += appetite;
    }

    public int getFood() {
        return food;
    }
}