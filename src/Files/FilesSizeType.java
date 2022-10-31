package Files;

public class FilesSizeType {

    private int width;
    private int height;

    public FilesSizeType(){};

    public FilesSizeType(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>0) this.width = width;
        else throw new IllegalArgumentException("Ширина должна быть больше 0");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0) this.height = height;
        else throw new IllegalArgumentException("Высота должна быть больше 0");
    }

    public String toStringSize() {
        return width + "x" + height;
    }
}
