package atividade4uc6;

public class ICMS extends Impostos {
    private double precoMercadoria;
    private double aliquota;
    
    
    
    public ICMS( double precoMercadoria, double aliquota){
        this.precoMercadoria = precoMercadoria;
        this.aliquota = aliquota;
        String tipo = "ICMS";
        this.setTipo(tipo);
    }

    public double getPrecoMercadoria() {
        return precoMercadoria;
    }

    public void setPrecoMercadoria(double precoMercadoria) {
        this.precoMercadoria = precoMercadoria;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    
    @Override
    public void calculaImposto(){
        double total = this.precoMercadoria * (this.aliquota/100.0);
        this.setTotal(total);
    }
    
    @Override
    public void mostraImposto(){
        System.out.println("Imposto: "+this.getTipo());
        System.out.println("Valor da mercadoria: "+this.getPrecoMercadoria());
        System.out.println("Alíquota: "+this.getAliquota());
        System.out.println("Total: "+this.getTotal());
        
    }
    
}
