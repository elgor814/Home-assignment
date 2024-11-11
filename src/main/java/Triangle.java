class Triangle implements GeometricShapes {

    private double a, b, c, p;
    private String color;
    private String borderColor;

    public Triangle(double a, double b, double c,String color, String borderColor) { //конструктор для объекта треугольник
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.borderColor = borderColor;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        // проверим есть ли возможность применить формулу Герона
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            p = (a + b + c) / 2; // полупериметр
            return Math.sqrt((p) * (p - a) * (p - b) * (p - c));
        } else System.out.println("Треугольник с такими длинами сторон не существует");
        return 0;
    }

    public String getColor() {
        return color;
    }
    public String getBorderColor() {
        return borderColor;
    }
}




