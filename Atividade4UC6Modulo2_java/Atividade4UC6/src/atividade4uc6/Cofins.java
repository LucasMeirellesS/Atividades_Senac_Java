package atividade4uc6;

public class Cofins extends Pis_Cofins {
    private final double porcentagem = 7.6;
    
    public Cofins(double debito, double credito){
        super(debito, credito);
        String tipo = "Cofins";
        this.setTipo(tipo);
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    @Override
    public void calculaImposto(){
        double total = (this.debito - this.credito) * (this.porcentagem/100.0);
        this.setTotal(total);
        
    }
    
    @Override
    public void mostraImposto(){
        System.out.println("Imposto: "+this.getTipo());
        System.out.println("Total de débitos: "+this.getDebito());
        System.out.println("Total de créditos: "+this.getCredito());
        System.out.println("Valor total do Imposto: "+this.getTotal());
        
    }
}
