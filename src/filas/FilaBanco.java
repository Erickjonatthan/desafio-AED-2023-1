package filas;
import cliente.Cliente;
import linked.ListaLigada;
import list.Fila;

public class FilaBanco implements Fila{
    
   ListaLigada lista = new ListaLigada();

   @Override
   public void enqueue(Cliente item) {
        lista.insereFim(item);
   }

   @Override
   public Cliente dequeue() {
        Cliente valor = lista.buscaIndice(0);
        lista.removeInicio();
        return valor;
   }

   @Override
   public boolean isEmpty() {
         if (lista.buscaIndice(0) == null){
             return true;
         }
            return false;
   }

   @Override
   public int size() {
        return -1;
   }

   @Override
   public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < lista.size(); i++) {
             result.append("Cliente ").append(i + 1);
             if (i < lista.size() - 1) {
                  result.append(", ");
             }
        }
        result.append("]");
        return result.toString();
   }
     
}