package atividade3uc6;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    protected String setor;
    protected double aumento = 0;
    
    
    public Funcionario(String nome,String cpf, String endereco, String telefone, String setor){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }
    
    
    
    public abstract void TotalReceber();
    
    public abstract void Aumento(double valor);
   
    
    
    public void MostrarDados(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Endereço: "+this.getEndereco());
        System.out.println("Telefone: "+this.getTelefone());
        System.out.println("Setor: "+this.getSetor());
    }
}
