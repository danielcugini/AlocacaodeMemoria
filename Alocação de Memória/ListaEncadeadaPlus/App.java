package ListaEncadeadaPlus;

public class App {
    public static void main(String[] args) throws Exception {
        Node inicio, fim;

        inicio = new Node(1);
        fim = inicio;
    
        fim.setProx(new Node(2));//2º Node
        fim = fim.getProx();

        fim.setProx(new Node(3));//3° Node
        fim = fim.getProx();

        System.out.println(inicio.getX());
        System.out.println(fim.getX());

        Node aux = inicio;

        while(aux!=null){    
            System.out.println(aux.getX());
            aux = aux.getProx();
        }
    }


    
}
