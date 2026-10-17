package MonitoriaPOO.Simulado2;

public class EstoqueInsuficienteException extends Exception{
    public EstoqueInsuficienteException(String nome, int quantidade){
        super(nome);
        System.out.println("Insuficiente para " + nome + ". Disponivel: " + quantidade);
    }
}
