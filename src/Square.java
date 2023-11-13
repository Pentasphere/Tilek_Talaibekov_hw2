public class Square extends Figure{
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nSide: " + side);
    }
}
