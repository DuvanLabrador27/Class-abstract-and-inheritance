package Ejercicio2;

public class Figure {
    private String id;
    private double price;
    private SuperHero superHero;
    private Dimension dimension;

    public Figure() {
    }

    public Figure(String id, double price, SuperHero superHero, Dimension dimension) {
        this.id = id;
        this.price = price;
        this.superHero = superHero;
        this.dimension = dimension;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SuperHero getSuperHero() {
        return superHero;
    }

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", superHero=" + superHero +
                ", dimension=" + dimension +
                '}';
    }

    public void raisePrice(double amount) {
        this.price += amount;
    }





}
