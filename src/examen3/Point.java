package examen3;
/**
 * Clase Punto para almacenar un punto con la informacion de sus coordenadas x e y. Permite hacer calculos de suma y resta de dos puntos.
 * 
 * @author favio.castro
 * @version 1
 * @since 03/05/2024
 * */
public class Point {
	/**
	 *  Variables de coordenadas de posicion de la clase Point.
	 *  @serial x 
	 *  @serial x 
	**/ 
	public Integer x, y;
	/**
	 * Constructor de Point. Recibe solo la coordenada x e y.
	 * 
	 * @param x Coordenada X.
	 * @param y Coordenada Y.
	 * */
	Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Suma de dos puntos, desde una funcion NO estatica.
	 * 
	 * @param p Segundo punto de donde se pueden acceder a sus parametros de clase.
	 * @serial x El parametro X de la propia clase (La primera).
	 * @serial y El parametro Y de la propia clase (La primera).
	 * @return La suma de dos puntos.
	 * */
	public Point add(Point p) {
		return new Point(x + p.x, y + p.y);
	}
	/**
	 * Substracción de dos puntos, desde una funcion NO estatica.
	 * 
	 * @param p Segundo punto de donde se pueden acceder a sus parametros de clase.
	 * @serial x El parametro X de la propia clase (La primera).
	 * @serial y El parametro Y de la propia clase (La primera).
	 * @return La resta de dos puntos.
	 * */
	public Point sub(Point p) {
		return new Point(x - p.x, y - p.y);
	}
}
