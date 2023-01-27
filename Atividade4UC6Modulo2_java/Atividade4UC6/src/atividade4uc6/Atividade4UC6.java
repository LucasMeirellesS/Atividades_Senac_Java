package atividade4uc6;
import java.util.Scanner;
public class Atividade4UC6 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int n;
        String tipo;
        Impostos [] impostos;
        
        System.out.println("Digite o número de impostos que você deseja registrar(Max:10):");
        n = Integer.parseInt(t.nextLine());
        
        while(n < 1 || n > 10){
            System.out.println("Digite um número de 1 a 10:");
            n = Integer.parseInt(t.nextLine());
            
        }
        
        impostos = new Impostos[n];
        
        for(int i = 0; i < impostos.length; i++){
            System.out.println("Digite o tipo do imposto a ser registrado(PIS, Cofins, ICMS ou IPI):");
            tipo = t.nextLine();
            System.out.println();
            while(!tipo.equals("PIS") && !tipo.equals("Cofins") && !tipo.equals("ICMS") && !tipo.equals("IPI")){
                System.out.println("Opção inválida!");
                System.out.println();
                System.out.println("Digite o tipo do imposto a ser registrado(PIS, Cofins, ICMS ou IPI):");
                tipo = t.nextLine();
            }
            if(tipo.equals("PIS")){
                System.out.println("Digite o total de débitos:");
                double debito = Double.parseDouble(t.nextLine());
                System.out.println("Digite o total de créditos:");
                double credito = Double.parseDouble(t.nextLine());
                impostos[i] = new Pis(debito, credito);
                
                
            }
            
            else if(tipo.equals("Cofins")){
                System.out.println("Digite o total de débitos:");
                double debito = Double.parseDouble(t.nextLine());
                System.out.println("Digite o total de créditos:");
                double credito = Double.parseDouble(t.nextLine());
                impostos[i] = new Cofins(debito, credito);
            }
            
            else if(tipo.equals("ICMS")){
                System.out.println("Digite o valor do preço da mercadoria:");
                double preco = Double.parseDouble(t.nextLine());
                System.out.println("Digite de quantos % é o valor da alíquota: ");
                double aliquota = Double.parseDouble(t.nextLine());
                impostos[i] = new ICMS(preco, aliquota);
            }
            
            else if(tipo.equals("IPI")){
                System.out.println("Digite o valor do preço do produto:");
                double produto = Double.parseDouble(t.nextLine());
                System.out.println("Digite o valor do frete:");
                double frete = Double.parseDouble(t.nextLine());
                System.out.println("Digite o valor do seguro:");
                double seguro = Double.parseDouble(t.nextLine());
                System.out.println("Digite o valor das outras despesas:");
                double od = Double.parseDouble(t.nextLine());
                System.out.println("Digite de quantos % é o valor da alíquota: ");
                double aliquota = Double.parseDouble(t.nextLine());
                impostos[i] = new Ipi(produto, frete, seguro, od, aliquota);
            }
            
            impostos[i].calculaImposto();
        }
        
        System.out.println("Operações e descrição dos impostos cadastradas:");
        for(int i = 0; i < impostos.length; i++){
            impostos[i].mostraImposto();
            System.out.println();
        }
        
    }
    
}
