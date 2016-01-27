package modelo;
/**
 * 
 * @author Blanca
 *
 */
public class Circulo implements Figuras {

	
	/**
	 * @param lado tipo entero
	 * @param base tipo entero
	 * @param altura tipo entero
	 * @param lt1 tipo entero
	 * @param lt2 tipo entero
	 * @param lt3 tipo entero
	 * @param d tipo double
	 */
	public double perimetro(int lado, int base, int altura, int lt1, int lt2, int lt3, double d) {
		
		return 2*3.1416*d;
	}

	/**
	 * @param lado tipo entero
	 * @param base tipo entero
	 * @param altura tipo entero
	 * @param lt1 tipo entero
	 * @param lt2 tipo entero
	 * @param lt3 tipo entero
	 * @param r tipo double
	 */
	public double area(int lado, int base, int altura, int lt1, int lt2, int lt3, double r) {
		// TODO Auto-generated method stub
		return 3.1416*Math.pow(r, 2);
	}

}
