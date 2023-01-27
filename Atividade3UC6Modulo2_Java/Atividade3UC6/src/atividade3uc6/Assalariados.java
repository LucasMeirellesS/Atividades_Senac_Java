package atividade3uc6;

public class Assalariados extends Funcionario{
    private double salario;
    
    
    public Assalariados(String nome,String cpf, String endereco, String telefone, String setor, double salario){
        super(nome, cpf,endereco, telefone, setor);
        this.salario = salario;
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
    
    @Override
    public void TotalReceber(){
        double total;
        total = this.salario + this.aumento;
        this.setSalario(total);
    }
    
    @Override
    public void Aumento(double porcentagem){
        double aumento = this.salario * (porcentagem/100.0);
        this.setAumento(aumento);
    };
    
    public void MostrarDados(){
        super.MostrarDados();
        System.out.println("Salario: "+this.getSalario());
        
    }

    
    
}
