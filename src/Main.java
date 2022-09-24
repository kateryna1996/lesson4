import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(100, 200, "yellow", 10, 15);
        Shape s2 = new Circle(300, 400, "red", 50);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(s1);
        shapes.add(s2);

        for (Shape s : shapes) {
            s.draw();
        }
    }
}
