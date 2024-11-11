class Circle implements GeometricShapes {

    private double r; // радиус круга
    private String color;
    private String borderColor;

    public Circle(double r, String color, String borderColor) { //конструктор для объекта круг
        this.r = r;
        this.color = color;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return (2 * Math.PI) * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public String getColor() {
        return color;
    }
    public String getBorderColor() {
        return borderColor;
    }
}
