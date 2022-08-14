package resizeable;

public abstract class Shape implements Resizeable {
    private String color = "greeen";
    private  boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shape{");
        sb.append("color='").append(color).append('\'');
        sb.append(", filled=").append(filled);
        sb.append('}');
        return sb.toString();

    }
}


