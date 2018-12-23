public class Cylinder implements Shape {
    private int radius;
    private int height;

    Cylinder(int _radius, int _height) {
        radius = _radius;
        height = _height;
    }

    public void show() {
        double area = Math.PI * radius * radius;
        double volume = area * height;

        System.out.println(
            "Area is: \t" + area + "\n"
          + "Volume is: \t" + volume
        );
    }

    public int getRadius() {return radius;}
    public int getHeight() {return height;} 

} 