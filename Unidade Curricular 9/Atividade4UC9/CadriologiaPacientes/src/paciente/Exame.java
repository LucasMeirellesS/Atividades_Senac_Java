package paciente;

public class Exame {
    
    private String nome;
    private String idade;
    private String data;
    private String hora;
    private String pressaoS;
    private String pressaoD;
    private String sobPressao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPressaoS() {
        return pressaoS;
    }

    public void setPressaoS(String pressaoS) {
        this.pressaoS = pressaoS;
    }

    public String getPressaoD() {
        return pressaoD;
    }

    public void setPressaoD(String pressaoD) {
        this.pressaoD = pressaoD;
    }

    public String getSobPressao() {
        return sobPressao;
    }

    public void setSobPressao(String sobPressao) {
        this.sobPressao = sobPressao;
    }
    
    
}
