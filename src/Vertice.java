import java.util.LinkedList;

public class Vertice<T> {
	protected int verticeId;
	private LinkedList<Arco<T>> arcos;

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
		// verificar arco.verticedestino
		Arco<T> arco = new Arco<T>(this.verticeId, verticeDestino, etiqueta);
		if (!arcos.contains(arco)) {
			this.arcos.add(arco);
		}
	}

	public boolean tieneArco(int verticeDestino) {
		for (Arco<T> a : arcos) {
			if (a.getVerticeDestino() == verticeDestino) {
				return true;
			}
		}
		return false;
	}

}
