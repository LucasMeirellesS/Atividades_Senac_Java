package atividade3uc6;
import java.util.Scanner;
import java.util.Locale;
public class Atividade3UC6 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        t.useLocale(Locale.ENGLISH);
        int n;
        double porcentagem;
        String opcao;
        String tipoF;
        
        Empresa f = new Empresa();
        
        System.out.println("De 1 a 10 digite o número de funcionários que deseja cadastrar:");
        n = Integer.parseInt(t.nextLine());
        while(n > 10 || n < 1){
            System.out.println("Digite um valor entre 1 e 10:");
            n = Integer.parseInt(t.nextLine());
        }
        f.funcionarios = new Funcionario[n];
        for(int i = 0; i < f.funcionarios.length; i++){
            System.out.println("Digite os dados do funcionário:");
            System.out.print("Nome:");
            String nome = t.nextLine();
            
            System.out.print("CPF:");
            String cpf = t.nextLine();
            
            System.out.print("Endereço:");
            String endereco = t.nextLine();
            
            System.out.print("Telefone:");
            String telefone = t.nextLine();
            
            System.out.print("Setor:");
            String setor = t.nextLine();
            
            System.out.println("O funcionário em questão é horista ou assalariado?"
                    + " Digite A, para assalariado ou H, para horista.");
            tipoF = t.nextLine();
            while(!tipoF.equals("A") && !tipoF.equals("H")){
                System.out.println("Escolha uma opção válida!\nDigite A, para assalariado ou H, para horista.");
                tipoF = t.nextLine();
            }
            if(tipoF.equals("A")){
                
                System.out.println("Digite o salário mensal do funcionário:");
                System.out.print("Salário:");
                double salario = Double.parseDouble(t.nextLine());
                
                f.funcionarios[i] = new Assalariados(nome, cpf,  endereco, telefone, setor, salario);
                
                
                
            }
            
            else{
                System.out.println("Digite o valor cobrado por hora e as horas trabalhadas do funcionário:");
                System.out.print("Valor por Hora:");
                float valor = Float.parseFloat(t.nextLine());
               
                System.out.print("Horas Trabalhadas:");
                float horas =  Float.parseFloat(t.nextLine());
                
                f.funcionarios[i] = new Horistas(nome, cpf,  endereco, telefone, setor, valor, horas);
                
                
                f.funcionarios[i].TotalReceber();
                
            }
            
            
        }
        System.out.println("Funcionários sem aumento:");
        for(int i = 0; i < f.funcionarios.length; i++){
            System.out.println((i+1)+"º Funcionário:");
            f.funcionarios[i].MostrarDados();
            System.out.println();
        }
        
        
        System.out.println("Digite a porcentagem para aplicar o aumento total dos funcionários:");
        porcentagem = Double.parseDouble(t.nextLine());
        for(int i = 0; i < f.funcionarios.length; i++){
            f.funcionarios[i].Aumento(porcentagem);
            f.funcionarios[i].TotalReceber();
        }
        
        System.out.println("Funcionários com aumento:");
        for(int i = 0; i < f.funcionarios.length; i++){
            System.out.println((i+1)+"º Funcionário:");
            f.funcionarios[i].MostrarDados();
            System.out.println();
        }
    }
    
}
