package deque;

public class TesteDeque {
	public static void main(String[] args) throws Exception {
		DequeInterface fila = new Deque();

		fila.add(20.0);
		fila.add(20.8);
		fila.add(20.3);
		fila.add(44.5);
		fila.addFirst(33.33);
		fila.addFirst(20.9);
		
		fila.list();
		
		fila.remove();
		fila.removeLast();
		
		fila.list();
		
		fila.clear();
	}
}
