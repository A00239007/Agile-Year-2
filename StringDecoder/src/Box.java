public class Box
{
    private int width = 1, height = 1, length = 1;
    private boolean full = false;

    public Box()
    {

    }

    public Box (int l, int b, int h, boolean f)
    {
        length = l;
        width = b;
        height = h;
        full = f;
    }
    public int getLength()
    {
        return length;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public boolean getFull()
    {
        return full;
    }

    public void setWidth(int i)
    {
        width = i;
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public void setLength(int i)
    {
        length = i;
    }

    public void setFull(boolean i)
    {
        full = i;
    }

    public int getArea()
    {
        return length*width*height;
    }

    public String toString()
    {
        return "L: " + length + " B: " + width + " H: " + height + " Full: " + full;
    }
}
