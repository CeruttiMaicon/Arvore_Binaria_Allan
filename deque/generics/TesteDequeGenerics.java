package deque.generics;

public class TesteDequeGenerics {
	public static void main(String[] args) throws Exception {
		DequeInterface<Double> deque = new Deque<Double>();

		deque.add(20.0);
		deque.add(20.8);
		deque.add(20.3);
		deque.add(44.5);
		deque.addFirst(33.33);
		deque.addFirst(20.9);
		
		deque.list(valor -> { valor *= valor; System.out.println("Dobro do valor: " + valor); });
		
		deque.remove();
		deque.removeLast();
		
		deque.list(valor -> System.out.println("Valor : " + valor));
		
		deque.clear();
	}
}
