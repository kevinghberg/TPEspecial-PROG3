public class Arco<T> {
	private int verticeOrigen;
	private int verticeDestino;
	private T etiqueta;

	public Arco(int verticeOrigen, int verticeDestino, T etiqueta) {
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
		this.etiqueta = etiqueta;
	}

	public T getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(T etiqueta) {
		this.etiqueta = etiqueta;
	}

	public int getVerticeOrigen() {
		return verticeOrigen;
	}

	public int getVerticeDestino() {
		return verticeDestino;
	}

	@Override
	public String toString() {
		return this.verticeOrigen + "->" + this.verticeDestino;
	}

}