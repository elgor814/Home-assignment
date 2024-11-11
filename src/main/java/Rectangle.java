class Rectangle implements GeometricShapes {

    private int d; // ширина прямоугольника
    private int e; // длина прямоугольника
    private  String color;
    private  String borderColor;


    public Rectangle(int d, int e, String color, String borderColor) { //конструктор для объекта прямоугольник
        this.d = d;
        this.e = e;
        this.color = color;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return 2 * (d + e);
    }

    public double getArea() {
        return d * e;
    }

    public String getColor() {
        return color;
    }
    public String getBorderColor() {
        return borderColor;
    }


}
