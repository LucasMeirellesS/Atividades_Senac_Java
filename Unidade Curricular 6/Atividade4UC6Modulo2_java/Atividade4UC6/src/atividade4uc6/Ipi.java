
package atividade4uc6;

public class Ipi extends Impostos {
    private double valorProduto;
    private double frete;
    private double seguro;
    private double outrasDespesas;
    private double aliquota;
    
    
    public Ipi(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota){
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
        String tipo = "IPI";
        this.setTipo(tipo);
    
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(double outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double alicota) {
        this.aliquota = aliquota;
    }

    
    
    @Override
    public void calculaImposto(){
       double total = (this.valorProduto + this.frete + this.seguro + this.outrasDespesas) * (this.aliquota/100.0);
       this.setTotal(total);
    }
    
    @Override
    public void mostraImposto(){
        System.out.println("Imposto: "+this.getTipo());
        System.out.println("Valor do produto utilizado para o calculo: "+this.getValorProduto());
        System.out.println("Valor do frete do produto: "+this.getFrete());
        System.out.println("Valor do seguro do produto: "+this.getSeguro());
        System.out.println("Outras despesas: "+this.getOutrasDespesas());
        System.out.println("Alíquota relativa ao produto: "+this.getAliquota());
        System.out.println("Total: "+this.getTotal());
    }
    
    
    
}
