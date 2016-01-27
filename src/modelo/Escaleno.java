package modelo;
/**
 * 
 * @author Blanca
 *
 */
public class Escaleno implements Figuras {

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
		// TODO Auto-generated method stub
		return lt1+lt2+lt3;
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
		float semiper=(lt1+lt2+lt3)/2;
		float area1=semiper*((semiper-lt1)*(semiper-lt2)*(semiper-lt3));
		
		float raiz=(float) Math.sqrt(area1);
		return raiz;
	}

}
