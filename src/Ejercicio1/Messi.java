package Ejercicio1;

public class Messi extends Persona{

    private String posicion;
    private String dorsal;

    public Messi(){}

    public Messi(String posicion, String dorsal) {
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public Messi(String name, String edad, double sueldo, String posicion, String dorsal) {
        super(name, edad, sueldo);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Messi{" +
                "posicion='" + posicion + '\'' +
                ", dorsal='" + dorsal + '\'' +
                '}';
    }
}
