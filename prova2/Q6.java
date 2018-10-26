package prova2;

public class Q6 {
	public static void main(String[] args) throws Exception {
		DequeExtensao<String> deque = new DequeExtensao<>();
		
		deque.add("T1");
		deque.add("T2");
		deque.add("T3");
		
		System.out.println("----------------");
		deque.list(x -> System.out.println("Valor: " + x));
		
		deque.remove("T2");
		
		System.out.println("----------------");
		deque.list(x -> System.out.println("Valor: " + x));
	}
}
