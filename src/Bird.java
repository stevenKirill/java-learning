public class Bird extends Animal{
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name" + super.getName() +
                "canFly=" + canFly +
                '}';
    }

    //    public void superExmple(){
//        super("asdsad");
//    }

}
