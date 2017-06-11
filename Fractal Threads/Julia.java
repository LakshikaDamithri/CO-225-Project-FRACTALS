
import java.lang.*;
import java.awt.*;
/**
 * Created by Dell on 9/1/2016.
 */
public class Julia {

	private  double x;
	private double y;
	private double region_y;
	private double region_x;
		
    public void plot_julia( Graphics g) {

        Complex compl = new Complex();
        Fractal frac = new Fractal();

		region_y  = frac.getComplex_plus_boundry() - frac.getComplex_min_boundry() ;
        region_x = frac.getReal_plus_boundry() - frac.getReal_min_boundry() ;
        

        for (int j = 0; j <= 800; j++) {
            for (int i = 0; i <= 800; i++) {
			
		 y = frac.getComplex_plus_boundry() - (j*region_y) / 800 ;
         x= frac.getReal_min_boundry() + (i*region_x) / 800 ;
		 
		Complex Z0 = compl.complex_number(x, y);  // getting complex value of the mapped point from the Mapping class
        Complex C_value = compl.complex_number( frac.getC_real(), frac.getC_complex() )  ;   // getting the C value from the Fractal class

        //Complex Zn = compl.add( compl.square(Z0) , C_value )  ; // Z1 = (Z0)^2 + C
			
			
				int n;
                for (n = 0; n <= 500; n++) {
                    if (   Math.hypot  ( compl.square(Z0).getRe() , compl.square(Z0).getIm() )  < 4  ) {  // checking whether[ abs(Zn) ] ^ 2 < 4
                        Z0 = compl.add(compl.square(Z0), C_value);
                    } else {
                        break;
                    }
                }
				
				//System.out.println("iterations = " + n);
				
				if( n == 501){
                    Color myBlack = new Color(0,0,0);
                    Point p = new Point(i, j, myBlack );
                    p.drawPoint(g);
                } else if ( n <=1 ) {
                    Color myDarkGreen = new Color(0,128,0);
                    Point p = new Point(i,j,myDarkGreen);
                    p.drawPoint(g);
                } else if (n <=2) {
					Color myLimeGreen = new Color(50,205,50);
                    Point p = new Point(i,j,myLimeGreen);
                    p.drawPoint(g);
				} else if (n <= 3) {
					Color myGrey = new Color(43,213,213);
                    Point p = new Point(i,j,myGrey);
                    p.drawPoint(g);
				} else if ( n <= 4) {
					Color myGreen = new Color(56,255,53);
                    Point p = new Point(i,j,myGreen);
                    p.drawPoint(g);
				} else if ( n <= 5) {
					Color myLightGreen2 = new Color(102,255,0);
                    Point p = new Point(i,j,myLightGreen2);
                    p.drawPoint(g);
				} else if ( n <= 7) {
					Color myYelloGreen = new Color(85,107,47);
                    Point p = new Point(i,j,myYelloGreen);
                    p.drawPoint(g);
				} else if ( n <= 9) {
					Color myGold = new Color(255,215,0);
                    Point p = new Point(i,j,myGold);
                    p.drawPoint(g);
				} else if ( n<= 13) {
					Color myYello = new Color(255,255,0);
                    Point p = new Point(i,j,myYello);
                    p.drawPoint(g);
				}else if( n<= 15) {
					Color myLightYello = new Color(255,255,40);
                    Point p = new Point(i,j,myLightYello);
                    p.drawPoint(g);
				}else if ( n > 15 && n<= 25){
                    Color myLightYello2 = new Color(0,255,0);
                    Point p = new Point(i,j,myLightYello2);
                    p.drawPoint(g);
                } else if (n > 25 && n<= 40 ) { 
					Color myDarkCyan = new Color(0,139,139);
                    Point p = new Point(i,j,myDarkCyan);
                    p.drawPoint(g);
				}else if ( n>40 && n<= 60){
                    Color myBlueGreen = new Color(0,255,171);
                    Point p = new Point(i,j,myBlueGreen);
                    p.drawPoint(g);
				} else if(  n> 60 && n<= 100) { 
					Color myCyan = new Color(0,255,127);
                    Point p = new Point(i,j,myCyan);
                    p.drawPoint(g);
				} else if ( n <= 200) { 
					Color myLightPink = new Color(255,58,170);
                    Point p = new Point(i,j,myLightPink);
                    p.drawPoint(g);
				}else if ( n>200 && n <= 500) {
					Color myYello = new Color(255,255,0);
                    Point p = new Point(i,j,myYello);
                    p.drawPoint(g);
				}	

            }
        }


    }


}
