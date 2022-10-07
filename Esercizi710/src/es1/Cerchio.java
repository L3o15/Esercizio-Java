package es1;

public class Cerchio {

    private final double r;
    private final static double pi = Math.PI;

    public Cerchio(double r) {
        this.r = r;
    }

    public double raggio() {
        return r;
    }

    public double diametro(){
        return (r*2);
    }

    public double perimetro(){
        return diametro()*pi;
    }

    public double area(){
        return Math.pow(r,2)*pi;
    }

    public Cerchio sommaCerchio(Cerchio c){
        return new Cerchio(r+c.raggio());
    }

}
