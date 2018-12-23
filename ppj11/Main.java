public class Main {
    public static void ex1() {
        Square square = new Square(5);
        square.show();
    }

    public static void ex2() {
        Cylinder cylinder = new Cylinder(5, 5);
        cylinder.show();
    }

    public static void ex3() {
        Square square = new Square(5);
        square.showInnerCylinder();
    }

    public static void ex4() {
        SphereIn sphere1 = new SphereIn(new Cylinder(5, 3));
        sphere1.printRadius();

        SphereIn sphere2 = new SphereIn(new Square(5));
        sphere2.printRadius();
    }

    public static void ex5() {
        Word word = new Word();
        word.addCharacter('p');
        word.addCharacter('j');
        word.addCharacter('a');
        word.addCharacter('t');
        word.addCharacter('k');

        System.out.println(word.length());
        word.print();
    }

    public static void main(String[] args) {
        // ex1();
        // ex2();
        // ex3();
        // ex4();
        ex5();
    }
}