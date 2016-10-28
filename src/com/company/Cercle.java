package com.company;

/**
 * Created by vaio on 27/10/2016.
 */
public class Cercle {

        private Point C;
        private double R;
        public Cercle(Point c){
            this.C=C;
            this.C=new Point();
        }
        public Cercle(Point C,double R){
            this.C= C;
            this.R=R;


        }

    public double getR() {
        return R;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point c) {
        C = c;
    }

    public void setR(double r) {
        R = r;
    }
    public double arr(double a,double b){
        return (double)((int)(a*Math.pow(10,b)+5))/Math.pow(10,b);

    }
    public double per(){
        return arr(2*Math.PI*this.R,2);

    }
    public Cercle sym(){
        return new Cercle(C.SymPoint(),R);
    }
}
