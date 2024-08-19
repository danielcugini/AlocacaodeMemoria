package ListaEncadeada;

public class App {
     public static void main(String[] args) throws Exception {
        Node inicio = new Node(1);
        //sempre inseri no fim
        System.out.println(inicio);
        System.out.println(inicio.getX());
        System.out.println(inicio.getProx());
        
        inicio.setProx (new Node(2)); //prox foi uma variável para ser ponteiro para Node
        System.out.println(inicio.getProx());
        System.out.println(inicio.getProx().getX());
        System.out.println(inicio.getProx().getProx());

        inicio.getProx().setProx (new Node(2)); 
        System.out.println(inicio.getProx());
        System.out.println(inicio.getProx().getX());
        System.out.println(inicio.getProx().getProx());
     }
    
}
