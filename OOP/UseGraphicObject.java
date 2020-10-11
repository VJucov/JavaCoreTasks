public class UseGraphicObject {
    public static void main(String[] args) {

        GraphicObject circle = new Circle(2);
        GraphicObject rect = new Rectangle(4,6);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rect.area());
    }
}
