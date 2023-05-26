package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        SuperHero sp1 = new SuperHero("Spiderman");
        SuperHero sp2 = new SuperHero("Iron Man");
        SuperHero sp3 = new SuperHero("Thor");
        sp1.setDescription("Este es spiderman");
        sp2.setDescription("Este es Iron Man");
        sp3.setDescription("Este es Thor");
        System.out.println(sp1.toString());
        sp3.setCape(true);

        Dimension dimpeq = new Dimension(20.0,5.0,6.0);
        double s = dimpeq.getVolumen();
        System.out.println(s);

        Figure fig = new Figure("1-S",15.0,sp1,dimpeq);
        Figure fig2 = new Figure("2-S",10.0,sp2,dimpeq);
        Figure fig3 = new Figure("3-S",5.0,sp3,dimpeq);
        System.out.println();
        System.out.println(fig.toString());
        System.out.println();
        fig.raisePrice(10.0);
        System.out.println(fig.toString());

        Colection cl = new Colection("Marvel");
        cl.addFigure(fig);
        cl.addFigure(fig2);
        cl.addFigure(fig3);
        System.out.println();
        System.out.println(cl);

        System.out.println(cl.whitCape());
        System.out.println(cl.higherPrice());
        System.out.println();
        System.out.println(cl.getTotalPrice());
        System.out.println();
        System.out.println(cl.getMaxVolumen());
    }
}
