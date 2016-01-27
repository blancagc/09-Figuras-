package modelo;
/**
 * 
 * @author Blanca
 *
 */
public interface Figuras {
	/**
	 * 
	 * @param lado tipo int para cuadrado
	 * @param base tipo int para rectangulo
	 * @param altura tipo int para rectangulo
	 * @param lt1 tipo int para triángulo
	 * @param lt2 tipo int para triángulo
	 * @param lt3 tipo int para triángulo
	 * @param d tipo double para circulo
	 * 
	 */
public double perimetro(int lado,int base, int altura, int lt1, int lt2, int lt3,double d);

/**
 * 
 * @param lado tipo int para cuadrado
 * @param base tipo int para rectangulo
 * @param altura tipo int para rectangulo
 * @param lt1 tipo int para triángulo
 * @param lt2 tipo int para triángulo
 * @param lt3 tipo int para triángulo
 * @param r tipo double para circulo
 */
public double area(int lado,int base, int altura, int lt1, int lt2, int lt3, double r);

}
