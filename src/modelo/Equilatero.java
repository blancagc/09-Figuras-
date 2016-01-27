package modelo;
/**
 * 
 * @author Blanca
 *
 */
public class Equilatero implements Figuras {

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
		return lt1+lt1+lt1;
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
		double raiz=Math.sqrt(3);
		double elevar=Math.pow(lado, 2);
		return raiz/4*elevar;
	}

}
