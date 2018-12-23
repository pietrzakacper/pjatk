public class Square implements Shape {
    private int side;

    Square(int _side) {
        side = _side;
    }

    public void show() {
        int area = side * side;
        int volume = area * side;

        System.out.println(
            "Area is: \t" + area + "\n"
          + "Volume is: \t" + volume
        );
    }

    public void showInnerCylinder() {
        double cylinderBottomArea = Math.PI * Math.pow(side /2, 2);
        double cylinderVolume = cylinderBottomArea * side;


        System.out.println(
            "Cylinder area is: \t" + cylinderBottomArea + "\n"
          + "Volume area is: \t" + cylinderVolume
        );
    }

    public int getSide() {return side;} 
} 