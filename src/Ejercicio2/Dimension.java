package Ejercicio2;

public class Dimension {
    private double height;
    private double width;
    private double deep;

    public Dimension() {
        this.height = 0.0;
        this.width = 0.0;
        this.deep = 0.0;
    }

    public Dimension(double height, double width, double deep) {
        this.height = height;
        this.width = width;
        this.deep = deep;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDeep() {
        return deep;
    }

    public void setDeep(double deep) {
        this.deep = deep;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", deep=" + deep +
                '}';
    }

    public double getVolumen(){
        return (this.height * this.width * this.deep);
    }
}
