public class Calculadora {
    private int numero1; 
    private int numero2;

    public Calculadora (){
        numero1=0;
        numero2=1;
    }
    public void SetNumero1(int numero1){
        this.numero1=numero1;
    }
    public void SetNumero2(int numero2){
        this.numero2= numero2;
    }
    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public int Soma(){
        return numero1 + numero2;
    }
    public int diferenca(){
        return numero1 - numero2;
    }
    public int produto(){
        return numero1 *numero2;
    }
    public double divisao(){
        return  (double) numero1 / numero2;
        
    }
}
