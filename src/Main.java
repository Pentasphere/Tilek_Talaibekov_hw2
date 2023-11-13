public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = createObject("1");
        printables[1] = createObject("2");
        printables[2] = createObject("3");
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }

    }
    public static Printable createObject(String className){
        switch (className){
            case "1":
                Printable circle = new Circle("Circle", 5);
                return circle;
            case "2":
                Printable square = new Square("Square", 4);
                return square;
            default: Printable triangle = new Triangle("Triangle", 1, 2, 3);
                return triangle;
        }
    }
}