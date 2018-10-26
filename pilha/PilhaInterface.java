package pilha;

public interface PilhaInterface {
	public void push(Object valor) throws Exception;
	public Object pop() throws Exception;
	
	public boolean isEmpty();
	public void clear();
	
	public void list();
}
