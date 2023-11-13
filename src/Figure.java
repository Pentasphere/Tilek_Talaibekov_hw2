public abstract class Figure implements Printable{
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public void print() {

    }

    public Figure(String name) {
        this.name = name;
    }
}

