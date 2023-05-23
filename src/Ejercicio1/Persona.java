package Ejercicio1;

public abstract class Persona {

    private String name;
    private String edad;
    private double sueldo;

    public Persona () {

    }

    public Persona(String name, String edad, double sueldo) {
        this.name = name;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", edad='" + edad + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
