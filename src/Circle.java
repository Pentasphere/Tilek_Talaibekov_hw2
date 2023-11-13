public class Circle extends Figure{
    private int radius;



    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nRadius: " + radius);
    }
}
