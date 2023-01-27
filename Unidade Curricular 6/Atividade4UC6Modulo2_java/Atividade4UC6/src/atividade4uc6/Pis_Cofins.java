package atividade4uc6;

public abstract class Pis_Cofins extends Impostos{
    protected double debito;
    protected double credito;
    
    
    public Pis_Cofins(double debito, double credito){
        this.debito = debito;
        this.credito = credito;
        
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    
    
    
    
    
}
