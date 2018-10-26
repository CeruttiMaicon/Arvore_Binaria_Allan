package prova2;

public class Q5 {
	public static void main(String[] args) {
		DequeExtensao<String> d1 = new DequeExtensao<>();
		DequeExtensao<String> d2 = new DequeExtensao<>();
		DequeExtensao<String> d3 = new DequeExtensao<>();
		
		d1.add("1");
		d1.add("2");
		d1.add("3");
		d1.add("4");
		d1.add("5");
		
		d1.split("3", d2, d3);
		
		System.out.println("Listando d1 ---------------");
		d1.list(x -> System.out.println("Valor: " + x));
		
		System.out.println("Listando d2 ---------------");
		d2.list(x -> System.out.println("Valor: " + x));
		
		System.out.println("Listando d3 ---------------");
		d3.list(x -> System.out.println("Valor: " + x));
	}
}
