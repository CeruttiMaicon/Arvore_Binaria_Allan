package arvore;

import java.util.ArrayList;
import java.util.List;

public class No<T> {
	public T valor;
	
	public No<T> pai;
	public List<No<T>> filhos = new ArrayList<No<T>>();
	
	public No(T v) {
		valor = v;
	}
}
