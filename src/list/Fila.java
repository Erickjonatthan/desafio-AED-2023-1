package list;

import cliente.Cliente;

public interface Fila{

    public void	enqueue(Cliente item);
    public Cliente	dequeue();
    public boolean isEmpty();
    public int	size();

}