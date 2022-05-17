package first_lesson;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "first_lesson.Bird{" +
                "name" + super.getName() +
                "canFly=" + canFly +
                '}';
    }
}