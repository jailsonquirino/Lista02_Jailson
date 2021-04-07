public class Valor {
    private int numero;

    public Valor(int numero) {
        this.numero = numero;
    }
   
    public void testar() { 
        System.out.println("Método somar da classe Valor, valor da variavel: " +numero);
        System.out.println("Método multiplicar da classe valor, valor da variavel: " +numero);
    }

    public void somar(int numero) { 
        numero = 100;
    }

    public void multiplicar(int numero) { 
        numero = 300;
    }
}