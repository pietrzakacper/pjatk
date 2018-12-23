public class SphereIn {
    double radius;

    SphereIn(Square square) {
        radius = (double)square.getSide() / 2;
    }
    
    SphereIn(Cylinder cylinder) {
        radius = Math.min((double)cylinder.getRadius(), (double)cylinder.getHeight() / 2);
    }

    public void printRadius() {
        System.out.println("Radius: \t" + radius);
    }
}