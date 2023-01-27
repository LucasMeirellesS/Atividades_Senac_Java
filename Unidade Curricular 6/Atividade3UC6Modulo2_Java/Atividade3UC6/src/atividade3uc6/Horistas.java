package atividade3uc6;

public class Horistas extends Funcionario{
    private float valorHora;
    private double rendaTotal;
    private float horas;
    
    public Horistas(String nome,String cpf, String endereco, String telefone, String setor, float valorHora, float horas){
        super(nome, cpf,endereco, telefone, setor);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public double getRendaTotal() {
        return rendaTotal;
    }

    public void setRendaTotal(double rendaTotal) {
        this.rendaTotal = rendaTotal;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }
    
    
    
    @Override
    public void TotalReceber(){
        double total = (this.valorHora * this.horas) + this.aumento;
        this.setRendaTotal(total);
        
    }
    
    @Override
    public void Aumento(double porcentagem){
        double aumento = (this.valorHora * this.horas) * (porcentagem/100.0);
        this.setAumento(aumento);
    };
    
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Salario: "+this.getRendaTotal());
        
    }
    
}
