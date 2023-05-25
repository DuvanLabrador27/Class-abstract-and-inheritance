package Ejercicio2;

public class SuperHero {
    private String name;
    private String description;
    private boolean cape;

    public SuperHero(){}
    public SuperHero(String name){
        this.name = name;
        this.description = "";
        this.cape = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCape() {
        return cape;
    }

    public void setCape(boolean cape) {
        this.cape = cape;
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cape=" + cape +
                '}';
    }
}

