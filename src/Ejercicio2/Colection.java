package Ejercicio2;

import java.util.ArrayList;

public class Colection {
       private String nameColection;
       private ArrayList<Figure> listfigures;

       public Colection(){}

       public Colection(String nameColection) {
              this.nameColection = nameColection;
              listfigures = new ArrayList<>();
       }

       public String getNameColection() {
              return nameColection;
       }

       public void setNameColection(String nameColection) {
              this.nameColection = nameColection;
       }

       public void addFigure(Figure figure){
              listfigures.add(figure);

       }

       public void raisePriceColection(double amount, String id){
              for (int i = 0; i < listfigures.size(); i++) {
                     if(listfigures.get(i).getId().equals(id)){
                            listfigures.get(i).raisePrice(amount);
                     }
              }
       }

       @Override
       public String toString() {
              String cadena = "Colection " + nameColection + "\n------------------\n";
              for (int i = 0; i < listfigures.size(); i++) {
                     cadena += listfigures.get(i) +"\n";
              }
              return cadena;
       }
       
       public String whitCape(){
              String cadena = "Super Heroes whit cape";
              for (int i = 0; i < listfigures.size(); i++) {
                     if(listfigures.get(i).getSuperHero().isCape() == true){
                            cadena += listfigures.get(i)+"\n";
                     }
              }
              return cadena;
       }
}
