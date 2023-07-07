package exerciciosapp;
import java.util.Scanner;

public class ExerciciosApp {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.println("Diga qual o tipo de exercício você deseja cadastrar: (1: Velocidade/ 2: Resistência)");
        Modelo modelo;
        
        int opcao = t.nextInt();
        while(opcao != 1 && opcao != 2){
            System.out.println("Digite 1 ou 2");
            opcao = t.nextInt();
        }
        
        if(opcao == 1){
            modelo = new ExercicioVelocidade();
        }
        else{
            modelo = new ExercicioResistencia();
        }
        
        IndicacaoExercicio indicacao = new IndicacaoExercicio(modelo);
        indicacao.gerar();
        
        System.out.println("Corrida: "+ indicacao.getExercicioCorrida().getNome());
        System.out.println("Musculacao: "+ indicacao.getExercicioMusculacao().getNome());
        
    }
    
}
