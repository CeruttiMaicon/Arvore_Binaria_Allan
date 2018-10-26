package deque.generics;

public interface DequeInterface<V> {
	public void add(V valor) throws Exception;
	public void addFirst(V valor) throws Exception;
	public Object remove() throws Exception;
	public Object removeLast() throws Exception;

	public boolean isEmpty();
	public void clear();
	
	public void list(FunctionInterface<V> callback);
}