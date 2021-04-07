public class Principal {
    public static void main(String[] args){ 
        int valor = 40; 
        
        Valor classeValor = new Valor(valor); 
               
        classeValor.somar(20); 
        classeValor.multiplicar(20); 
        classeValor.testar(); 
        System.out.println(" ");


        int[] vetor = new int[]{10, 30, -30, 40};

        int [] vetor2 = vetor;

        Referencia classReferencia = new Referencia ();

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
        System.out.println(" ");

        classReferencia.multiplicar(vetor2);

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        Pessoa pessoaA = new Pessoa ("Marcos");
        System.out.println(pessoaA.getNome());

        Pessoa pessoaB = pessoaA;

        pessoaB.setNome("Maria Júlia\n");

        System.out.println(pessoaA.getNome());
    }
}