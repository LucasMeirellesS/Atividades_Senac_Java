package exerciciosapp;

public class ExercicioVelocidade implements Modelo{
    public Corrida getCorrida(){
        return new CorridaComSaltos();
    }
    
    public Musculacao getMusculacao(){
        return new PuxarTreno();
    }
}
