package MonitoriaPOO.Simulado1.Questao2;

public class Retangulo {
    private double largura, altura;

    public Retangulo(){
        this.largura = 1;
        this.altura = 1;
    }
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getLargura(){
        return this.largura;
    }
    public double getAltura(){
        return this.altura;
    }

    public double calcularArea(){
        return getLargura() * getAltura();
    }
    public boolean isQuadrado(){
        if(getAltura() == getLargura())
            return true;
        else
            return false;
    }
}
