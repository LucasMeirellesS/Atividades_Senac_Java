package exerciciosapp;

public class ExercicioResistencia implements Modelo{
    public Corrida getCorrida(){
        return new CorridaEstacionaria();
    }
    
    public Musculacao getMusculacao(){
        return new AgachamentoSalto();
    }
}
