package atividade2uc6;

public class Ponto2D {
    private double vetor[] = new double[2];
    
    public Ponto2D(double x, double y){
        this.vetor[0] = x;
        this.vetor[1] = y;
    
    }
    
    public double calculaDistancia(Ponto2D ob){
        double d = Math.pow(ob.vetor[0] - this.vetor[0],2) + Math.pow(ob.vetor[1] - this.vetor[1], 2);
        return Math.sqrt(d);
    }
    
    public void multiplica(double n){
        for(int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = this.vetor[i] * n;
        }
    
    }
    
    public void mostraVetor(){
        for(int i = 0; i < this.vetor.length; i++){
            System.out.print(this.vetor[i]+",");
            if(i == this.vetor.length - 1){
                System.out.print(this.vetor[i]);
            }
        }
    
    }
    
    
    
}
