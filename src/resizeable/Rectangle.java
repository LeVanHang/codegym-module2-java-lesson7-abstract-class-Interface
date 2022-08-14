package resizeable;

public abstract class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimater() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("width=").append(width);
        sb.append(", length=").append(length);
        sb.append('}');
        return sb.toString();
    }

    public void resize(double percent) {
        this.length *= (percent / 200);
        this.width *= (percent / 200);

    }
}
