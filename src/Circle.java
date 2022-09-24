public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, String c, int r) {
        super(x,y,c );
        this.radius = r;
    }


    @Override
    public void draw() {
        System.out.println("drawing circle with radius " + radius);
    }
}
