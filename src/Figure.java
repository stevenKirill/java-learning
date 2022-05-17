public class Figure {
    private int width;
    private int height;

    public Figure(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
