package examen3;
/**
 * Clase vector para almacenar un vector con la información de dos puntos. Permite hacer calculos de producto de vectores y si es ortogonal a otro vector.
 * 
 * @author favio.castro
 * @version 1
 * @since 03/05/2024
 * @see <a href="https://www.superprof.es/apuntes/escolar/matematicas/analitica/vectores/producto-escalar-2.html#:~:text=Un%20producto%20escalar%20es%20una,la%20que%20apunta%20el%20vector.">Explicación del producto escalar</a>
 * */
public class Vector2D {
	/**
	 * Variables de coordenadas de un punto de la clase Vector2D.
	 *  @serial x
	 *  @serial x 
	**/ 
	public Integer x, y;
	/**
	 * Constructor de Vector2D. Recibe solo la coordenada x e y.
	 * 
	 * @param x Coordenada X.
	 * @param y Coordenada Y.
	 * */
	
	Vector2D(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Segundo constructor de la clase Vector2D. Recibe dos puntos de la clase Point.
	 * 
	 * @param p1 Primer punto de la clase Point.
	 * @param p2 Segundo punto de la clase Point.
	 * */
	Vector2D(Point p1, Point p2) {
		this.x = p2.x - p1.x;
		this.y = p2.y - p1.y;
	}
	/**
	 * Producto de dos vectores, desde una funcion NO estatica.
	 * 
	 * @param v Segundo Vector de donde se pueden acceder a sus parametros de clase.
	 * @serial x El parametro X de la propia clase (La primera).
	 * @serial y El parametro Y de la propia clase (La primera).
	 * @return El producto de dos vectores.
	 * */
	
	public int dotProduct(Vector2D v) {
		return (x * v.x) + (y * v.y);
	}
	/**
	 * Comprobacion si es Ortogonal un vector respecto a otro, desde una funcion NO estatica.
	 * 
	 * @param v Segundo Vector de donde se pueden acceder a sus parametros de clase.
	 * @return Devuelve si el producto de ambos vectores da 0 o no, indicando si es ortogonal o no.
	 * */
	public boolean isOrthogonalTo(Vector2D v) {
		return (dotProduct(v) == 0);
	}
	
}
