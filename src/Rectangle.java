public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int x, int y, String c, int h, int w) {
        super(x,y,c );
        this.height = h;
        this.width = w;
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle with size " + height + " x " + width);
    }
}
