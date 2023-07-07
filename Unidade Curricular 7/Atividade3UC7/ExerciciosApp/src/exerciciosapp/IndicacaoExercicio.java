package exerciciosapp;

public class IndicacaoExercicio {
    public Corrida exercicioCorrida;
    public Musculacao exercicioMusculacao;
    public Modelo exercicioModelo;
    
    
    public IndicacaoExercicio(Modelo exercicio){
        this.exercicioModelo = exercicio;
    }

    public Corrida getExercicioCorrida() {
        return exercicioCorrida;
    }

    public Musculacao getExercicioMusculacao() {
        return exercicioMusculacao;
    }
    
    public void gerar(){
        this.exercicioCorrida = exercicioModelo.getCorrida();
        this.exercicioMusculacao = exercicioModelo.getMusculacao();
    
    }
    
}
