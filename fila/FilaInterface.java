package fila;

public interface FilaInterface {
	public void add(Object o) throws Exception;
	public Object remove() throws Exception;
	
	public boolean isEmpty();
	public void clear();
	
	public void list();
}