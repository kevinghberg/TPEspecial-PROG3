import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ServicioDFS<T> {

	protected LinkedList<Integer> vertices;
	protected GrafoDirigido<T> grafo;
	protected HashMap<Integer, String> colores;

	public ServicioDFS(GrafoDirigido<T> grafo) {
		this.grafo = grafo;
	}

	public LinkedList<Integer> dfsForest() {
		Iterator<Integer> iterador = grafo.obtenerVertices();

		while (iterador.hasNext()) {
			int verticeId = iterador.next();
			colores.put(verticeId, "blanco");
		}

		Iterator<Integer> it = grafo.obtenerVertices();

		while (it.hasNext()) {
			int verticeId = it.next();
			if (colores.get(verticeId).equals("blanco")) {
				dfsVisit(verticeId);
			}
		}
		return vertices;

	}

	private void dfsVisit(int verticeId) {

		colores.put(verticeId, "amarillo");

		Iterator<Integer> iterador = grafo.obtenerAdyacentes(verticeId);
		while (iterador.hasNext()) {
			int verticeNuevo = iterador.next();
			if (colores.get(verticeNuevo).equals("blanco")) {
				dfsVisit(verticeNuevo);
			}
			
		}

		colores.put(verticeId, "negro");

	}

}
