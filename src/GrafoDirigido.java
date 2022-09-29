import java.util.LinkedList;

public class GrafoDirigido<T> implements Grafo<T> {

	LinkedList<Vertice<T>> vertices;

	public GrafoDirigido() {
		this.vertices = new LinkedList<Vertice<T>>();
	}

	@Override
	public void agregarVertice(int verticeId) {
		if (vertices != null) {
			Vertice<T> vertice = new Vertice<T>(verticeId);
			if (!this.vertices.contains(vertice)) {
				vertices.add(vertice);
			}
		}
	}

	@Override
	public void borrarVertice(int verticeId) {
		if (vertices != null) {		
			for (Vertice<T> v : vertices) {
				if (v.verticeId == verticeId) {
					vertices.remove(v);
				}
			}
		
		}
	}
}