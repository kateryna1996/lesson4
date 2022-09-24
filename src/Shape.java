public abstract class Shape {
    private int xpos;
    private int ypos;
    private String color;

    public Shape(int x, int y, String c) {
        this.xpos = x;
        this.ypos = y;
        this.color = c;
    }

    public abstract void draw();
}
