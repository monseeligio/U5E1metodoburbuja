
package metodoburbuja;
import java.util.ArrayList;
import java.util.List;

public class MetodoBurbuja {

    public static void main(String[] args) {
     List<Integer> lista = new ArrayList<Integer>();
       lista.add(9);
       lista.add(1);
       lista.add(4);
       lista.add(3);
       lista.add(10);
       lista.add(7);
       lista.add(5);
        System.out.println("Lista desordenada"+ "");
      for(int i=0;i<lista.size();i++){
          System.out.print(lista.get(i)+" ");
      }
       for(int i=0;i<lista.size()-1;i++){
           for(int j=0;j<lista.size()-1;j++){
               if(lista.get(j)>lista.get(j+1)){
                 int aux=lista.get(j+1);
                  lista.set(j+1,lista.get(j));
                  lista.set(j,aux);      
               }
      }
      }
        System.out.println("\nLista ordenada");
       for(int i=0;i<lista.size();i++){
          System.out.print(lista.get(i)+" ");
      } 
    }
    
}
