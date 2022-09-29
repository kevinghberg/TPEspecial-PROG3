import java.util.LinkedList;

public class Vertice<T> {
	public int verticeId;
	public LinkedList<Arco<T>> arcos;

	public Vertice(int verticeId) {
		this.verticeId = verticeId;
		this.arcos = new LinkedList<Arco<T>>();
	}

	public int getVerticeId() {
		return this.verticeId;
	}

	public LinkedList<Arco<T>> getArcos() {
		return this.arcos;
	}

	public void agregarArco(int verticeDestino, T etiqueta) {
		Arco<T> arco = new Arco<T>(this.verticeId, verticeDestino, etiqueta);
		if (!arcos.contains(arco)) {
			this.arcos.add(arco);
		}
	}
}
