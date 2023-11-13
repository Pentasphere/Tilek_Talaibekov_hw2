public class Triangle extends Figure{
    private int a, b, c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nSide a: " + a +
                "\nSide b: " + b +
                "\nSide c: " + c);
    }
}
