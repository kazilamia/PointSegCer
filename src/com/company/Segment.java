package com.company;

/**
 * Created by vaio on 27/10/2016.
 */
public class Segment {
     private Point A;
    private Point B;
    public Segment(Point A){
        this.A=A;
        this.A=new Point();
    }
    public Segment(Point A,Point B){
        this.A=A;
        this.B=B;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public void setA(Point a) {
        A = a;
    }

    public void setB(Point b) {
        B = b;
    }
    public double Dis(){
        return Math.sqrt(Math.pow(B.getX()-A.getX(),2)+Math.pow(B.getY()-A.getY(),2));


    }
    public Segment imageSegment(){
        return new Segment(this.A.imagePoint(),this.B.imagePoint());
    }
}
