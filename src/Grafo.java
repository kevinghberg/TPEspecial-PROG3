import java.util.Iterator;

public interface Grafo<T> {

	public void agregarVertice(int verticeId);


	public void borrarVertice(int verticeId);


	Iterator<Integer> obtenerAdyacentes(int verticeId);


	Iterator<Integer> obtenerVertices();

	boolean existeArco(int verticeId1, int verticeId2);
	
	public Iterator<Arco<T>> obtenerArcos(int verticeId);

}
