public class Rectangle extends GraphicObject {

    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }
}
