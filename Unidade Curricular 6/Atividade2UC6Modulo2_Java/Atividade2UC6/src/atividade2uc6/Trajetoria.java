package atividade2uc6;
import java.util.Scanner;
import java.util.Locale;

public class Trajetoria {
    Ponto2D trajetos[];
    Scanner t = new Scanner(System.in);
    
    public void trajetos(int n){
        this.trajetos = new Ponto2D[n];
        for(int i = 0; i < n; i++){
            System.out.println("Digite o valor de x do "+(i+1)+" vetor:");
            double x = t.nextDouble();
            System.out.println("Digite o valor de y do "+(i+1)+" vetor:");
            double y = t.nextDouble();
            this.trajetos[i] = new Ponto2D(x, y);
        }
    }
    
    public void mostraTrajeto(){
        System.out.print("{");
        for(int i = 0; i < this.trajetos.length; i++){
            if(i == this.trajetos.length - 1){
                this.trajetos[i].mostraVetor();
            }
            else{
                this.trajetos[i].mostraVetor();
                System.out.print(", ");
            }
        }
        System.out.print("}\n");
    }
    
    public void calculaTrajeto(){
        System.out.print("{");
        for(int i = 0; i < this.trajetos.length; i++){
            if(i == this.trajetos.length - 1){
                System.out.print("(");
                this.trajetos[i].mostraVetor();
                System.out.print(")");
            }
            else{
                System.out.print("(");
                this.trajetos[i].mostraVetor();
                System.out.print("), ");
            }
            
        }
        System.out.print("}");
        System.out.println();
        for(int i = 0; i < this.trajetos.length - 1; i++){
            System.out.print("(");
            this.trajetos[i].mostraVetor();
            System.out.print(")");
            System.out.print(" a ");
            System.out.print("(");
            this.trajetos[i+1].mostraVetor();
            System.out.print(") - ");
            System.out.print(this.trajetos[i].calculaDistancia(this.trajetos[i+1]));
            System.out.println();
            
        }
    
    }
    
    public void redimenciona(double n){
        for(int i = 0; i < this.trajetos.length; i++){
            this.trajetos[i].multiplica(n);
        }
    
    }
}
