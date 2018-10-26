package prova2;

import deque.generics.Deque;
import deque.generics.Elemento;

public class DequeExtensao<V> extends Deque<V> {
	public void split(V valor, Deque<V> d1, Deque<V> d2) {
		Elemento<V> elemento = cabeca;

		while (elemento != null) {
			if (elemento.getValor().equals(valor)) {
				Elemento<V> el = cabeca;

				while (el != elemento) {
					d1.add(el.getValor());
					el = el.getProximo();
				}

				d1.add(elemento.getValor());
				el = elemento.getProximo();

				while (el != null) {
					d2.add(el.getValor());
					el = el.getProximo();
				}

				break;
			}

			elemento = elemento.getProximo();
		}
	}

	public void remove(V valor) throws Exception {
		Elemento<V> elemento = cabeca;

		while (elemento != null) {
			if (elemento.getValor().equals(valor)) {
				if (elemento == cabeca) {
					this.remove();
				} else if (elemento == cauda) {
					this.removeLast();
				} else {
					Elemento<V> anterior = elemento.getAnterior();
					Elemento<V> proximo  = elemento.getProximo();	
					
					anterior.setProximo(proximo);
					proximo.setAnterior(anterior);
				}

				return;
			}

			elemento = elemento.getProximo();
		}

		throw new Exception("Valor não encontrado");
	}

}
