import java.util.Iterator;

public class IteradorAdyacentes<T> implements Iterator<Integer> {

	Iterator<Arco<T>> arcos;

	public IteradorAdyacentes(Iterator<Arco<T>> arco) {
		this.arcos = arco;
	}

	@Override
	public boolean hasNext() {
		return arcos.hasNext();
	}

	@Override
	public Integer next() {
		return arcos.next().getVerticeDestino();
	}

}
