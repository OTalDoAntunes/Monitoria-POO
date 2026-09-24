package MonitoriaPOO.Simulado1.Questao2;

public class Main {
    public static void main(String args[]){
        Retangulo retangulo = new Retangulo(5, 5);
        if(retangulo.isQuadrado()){
            System.out.println("E um quadrado!");
            System.out.println("A area do quadrado e: " + retangulo.calcularArea());
        }
        else{
            System.out.println("E um retangulo!");        
            System.out.println("A area do retangulo e: " + retangulo.calcularArea());
        }
    }    
}
