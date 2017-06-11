
/**
 * Created by Dell on 9/1/2016.
 */
public class Complex {

    private double re;
    private double im;


    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public Complex complex_number(double x, double y) {
        Complex C = new Complex();
        C.re = x ;
        C.im = y;
        return C ;
    }

    public Complex add( Complex z1 , Complex z2){
        Complex c1 = new Complex();
        c1.re = z1.re + z2.re ;
        c1.im = z1.im + z2.im;
        return c1;
    }

    public Complex square ( Complex z){
        Complex c2 = new Complex();
        c2.re = z.re*z.re - z.im*z.im ;
        c2.im = 2*z.re*z.im ;
        return c2;
    }


}
