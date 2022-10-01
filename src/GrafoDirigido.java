import java.util.Iterator;
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

	@Override
	public Iterator<Integer> obtenerVertices() {
		Iterator<Integer> iterator = new IteratorVertice<T>(this.vertices.iterator());
		return iterator;
	}

	@Override
	public Iterator<Integer> obtenerAdyacentes(int verticeId) {
		for (Vertice<T> v : this.vertices) {
			if (v.getVerticeId() == verticeId) {
				return new IteradorAdyacentes<T>(v.getArcos().iterator());
			}
		}
		return null;
	}

	@Override
	public boolean existeArco(int verticeId1, int verticeId2) {
		for (Vertice<T> v : this.vertices) {
			if (v.getVerticeId() == verticeId1) {
				if (v.tieneArco(verticeId2)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Iterator<Arco<T>> obtenerArcos(int verticeId) {
		for (Vertice<T> v : this.vertices) {
			if (v.getVerticeId() == verticeId) {
				return v.getArcos().iterator();
			}
		}
		return null;

	}
}