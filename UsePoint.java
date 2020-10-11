public class UsePoint {
    public static void main(String[] args) {

        Point pointA = new Point( 2, 0,7);
        Point pointB = new Point(-3, 9);

        System.out.println("A point's properties: ");
        System.out.println("x = " + pointA.getX());
        System.out.println("y = " + pointA.getY());
        System.out.println("z = " + pointA.getZ());

        System.out.println("B point's properties: ");
        System.out.println("x = " + pointB.getX());
        System.out.println("y = " + pointB.getY());

    }
}
