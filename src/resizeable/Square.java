package resizeable;

public abstract class Square extends Shape {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Square{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }

    double getArea() {
        return side;
    }

    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
