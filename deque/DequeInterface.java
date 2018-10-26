package deque;

public interface DequeInterface {
	public void add(Object o) ;
	public void addFirst(Object o) throws Exception;
	public Object remove() throws Exception;
	public Object removeLast() throws Exception;

	public boolean isEmpty();
	public void clear();
	
	public void list();
}