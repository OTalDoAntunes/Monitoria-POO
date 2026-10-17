package MonitoriaPOO.Simulado2;

public class ClienteVip extends Cliente{
    private final double percentualDesconto = 0.10;

    public ClienteVip(String nome, String cpf, String email, String endereco){
        super(nome, cpf, email, endereco);
    }

    @Override
    public String  toString(){
        return super.toString() + " | VIP(10%)";
    }
}
