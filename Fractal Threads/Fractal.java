
import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;

public class Fractal extends JPanel{

    private static int WIDTH = 800;
    private static int HEIGHT= 800;

    //  Set variable (Julia or Mandelbrot)
    public static String Set ;

    // setting the default values
    private static double real_min_boundry =-1 ;
    private static double real_plus_boundry= 1;
    private static double complex_min_boundry = -1 ;
    private static double complex_plus_boundry = 1 ;
    private static int iterations = 1000;



    // default values for c for Julia
    private static double c_real = -0.4;
    private static double c_complex = 0.6 ;



    public static void main(String[] args) {

        Fractal f1 = new Fractal();

        Set = args[0];

        if ( Set.equals("Mandelbrot") ){
            if(args.length == 5){
                f1.real_min_boundry= Double.parseDouble(args[1]);
                f1.real_plus_boundry= Double.parseDouble(args[2]);
                f1.complex_min_boundry = Double.parseDouble(args[3]);
                f1.complex_plus_boundry = Double.parseDouble(args[4]);
            } else if (args.length == 6) {
                f1.real_min_boundry= Double.parseDouble(args[1]);
                f1.real_plus_boundry= Double.parseDouble(args[2]);
                f1.complex_min_boundry = Double.parseDouble(args[3]);
                f1.complex_plus_boundry = Double.parseDouble(args[4]);
                f1.iterations = Integer.parseInt(args[5]);
            } else if ( args.length !=1){
                System.out.println("Invalid Input");
            }

        } else if ( Set.equals("Julia")) {
            if (args.length == 3) {
                f1.c_real = Double.parseDouble(args[1]);
                f1.c_complex = Double.parseDouble(args[2]);
            } else if ( args.length != 1) {
                System.out.println("Invalid Input");
            }
        }

        JFrame frame = new JFrame(Set);

        frame.setContentPane(f1);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);

    }
	
	
    public double getReal_min_boundry() {
        return real_min_boundry;
    }

    public double getReal_plus_boundry() {
        return real_plus_boundry;
    }

    public double getComplex_min_boundry() {
        return complex_min_boundry;
    }

    public double getComplex_plus_boundry() {
        return complex_plus_boundry;
    }

    public double getC_real() {
        return c_real;
    }

    public double getC_complex() {
        return c_complex;
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

		if (Set.equals("Mandelbrot")) {
			Mandelbrot M = new Mandelbrot();
			M.plot_mandelbrot(g);
		 } else if ( Set.equals("Julia") ) {
			Julia J = new Julia() ;
			J.plot_julia(g);
		 } 

    }
}

