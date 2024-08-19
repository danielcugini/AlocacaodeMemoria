package Ponteiro;

public class App {

    public static void Main(String[] args) throws Exception{
        Teste t = new Teste(4);//t(ponteiro) - variável do parâmetro, variável não guarda o objeto, guarda uma forma de acessar o objeto e uma forma de mostrar que é dona do Objeto
        Teste k = t; //k e t são ponteiros diferentes ,mas apontam para o mesmo ponteiro
        
        int[] v = new int[4]; //o new tem a mesma função do teste


        v[0] = 10;
        v[1] = 20;

        System.out.println(v[0] + v[1]);
           
        k.x = 200; 


        System.out.println(t.x);
        System.out.println(t.y);
    }
}