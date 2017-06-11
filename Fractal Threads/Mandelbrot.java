
import java.awt.*;

/**
 * Created by Dell on 9/2/2016.
 */
public class Mandelbrot {

	private  double x;
	private double y;
	private double region_y;
	private double region_x;
	
    public void plot_mandelbrot(Graphics g) {

        //mapping m = new mapping();
        Complex compl = new Complex();
        Fractal frac = new Fractal();
		
		region_y  = frac.getComplex_plus_boundry() - frac.getComplex_min_boundry() ;
        region_x = frac.getReal_plus_boundry() - frac.getReal_min_boundry() ;

        for (int j = 0; j <= 800; j++) {
            for (int i = 0; i <= 800; i++) {
			
			//if( i==0 && j== 0) { System.out.println("x="+ i + "y=" + j);  }
			
		 y = frac.getComplex_plus_boundry() - (j*region_y) / 800 ;
         x= frac.getReal_min_boundry() + (i*region_x) / 800 ;
		 
		Complex C_value = compl.complex_number(x, y);  // getting complex value of the mapped point from the Mapping class
        Complex Z0 = compl.complex_number( 0,0 )  ;   // Z0 =0


                int n;
                for (n = 0; n <= 500; n++) {
                    if (   Math.hypot  ( compl.square(Z0).getRe() , compl.square(Z0).getIm() )  < 4   ) {  // checking whether[ abs(Zn) ] ^ 2 < 4
                        Z0 = compl.add(compl.square(Z0), C_value);
                    } else {
                        break;
                    }
                }

                if( n == 501){
                    Color myBlack = new Color(0,0,0);
                    Point p = new Point(i, j, myBlack );
                    p.drawPoint(g);
                } else if (n <= 1) {
                    Color myDarkBlue = new Color(5,13,135);
                    Point p = new Point(i,j,myDarkBlue);
                    p.drawPoint(g);
                } else if ( n> 1 && n <=5 ) {
                    Color myBlue = new Color(28,22,183);
                    Point p = new Point(i,j,myBlue);
                    p.drawPoint(g);
                } else if( n > 5 && n<= 15) {
					Color myBlue2 = new Color(36,66,215);
                    Point p = new Point(i,j,myBlue2);
                    p.drawPoint(g);
				}else if ( n > 15 && n<= 25){
                    Color myLightBlue = new Color(42,87,226);
                    Point p = new Point(i,j,myLightBlue);
                    p.drawPoint(g);
                } else if (n > 25 && n<= 40 ) { 
					Color myLightBlue2 = new Color(32,125,219);
                    Point p = new Point(i,j,myLightBlue2);
                    p.drawPoint(g);
				}else if ( n>40 && n<= 60){
                    Color myLightBlue3 = new Color(32,182,219);
                    Point p = new Point(i,j,myLightBlue3);
                    p.drawPoint(g);
				} else if(  n> 60 && n<= 80) { 
					Color myBlueGreen = new Color(32,219,213);
                    Point p = new Point(i,j,myBlueGreen);
                    p.drawPoint(g);
				} else if ( n>80 && n <= 100) {
					Color myGreen = new Color(32,219,175);
                    Point p = new Point(i,j,myGreen);
                    p.drawPoint(g);
				}else if ( n > 100  && n<= 200) {
					Color myGreen2 = new Color(32,219,125);
                    Point p = new Point(i,j,myGreen2);
                    p.drawPoint(g);
				} else if ( n>200 && n <= 500) {
					Color myLightGreen = new Color(18,250,49);
                    Point p = new Point(i,j,myLightGreen);
                    p.drawPoint(g);
				}
				
            }
        }
    }
}
