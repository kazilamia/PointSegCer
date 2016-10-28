package com.company;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        Point a=new Point();
        Point b=new Point(3);
        Point c=new Point(5,7);
        Segment ab=new Segment(a,b);
        Segment bc=new Segment(b,c);

        System.out.println("-- creation de 3 point dans l'espace en utilisant 3 constructeurs differents --");
        System.out.println(" Le point A mes coordonees sont : "+a);
        System.out.println(" Le point B mes coordonees sont : "+b);
        System.out.println(" Le point C mes coordonees sont : "+c);
        System.out.println("  \n les images de A,B,C =" );
        System.out.println(" l'image de A est : "+a.toString());
        System.out.println(" l'image de B est : "+b.SymPoint());
        System.out.println(" l'image de C est : "+c.SymgePoint());





        System.out.println("--\n  Creation de deux Segment dans l'espace  --");
        System.out.println(" Le Segment AB =  " +ab.Dis());
        System.out.println(" Le Segment BC =  " +bc.Dis());

        System.out.println("-- \n Creation de l'image du Segment BC par rapport a l'axe des ordonnées  --");
        System.out.println(" l'image de BC et CB = " +b.SymPoint()+c.SymPoint());
        System.out.println("      -------------------------------------------------------------");

        Point O=new Point();
        int r=4;
        Cercle C=new Cercle(O,r);
        System.out.println(" ---  le cercle C : \n Centre O "+O.toString()+" \n Rayon r = "+r+"\n perimetre ="+C.per()+"\n son image C-1 "+O.SymPoint()+"\n Rayon r="+r);


        Point O1=new Point(6);
        int r1=9;
        Cercle C1=new Cercle(O1,r1);
        System.out.println(" --- le cercle C1 : \n Centre O1 "+O1.toString()+" \n Rayon r1="+r1+"\n perimetre ="+C1.per()+" \n son image C1-1 "+O1.SymPoint()+"\n Rayon r1="+r1);




    }
}
