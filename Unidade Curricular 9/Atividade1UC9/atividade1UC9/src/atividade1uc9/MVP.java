/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1uc9;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author LUCAS MEIRELLES
 */
public class MVP {
    
        private JFrame janela1;
        private JLabel rotulo1;
        private JTextField valor;
        private JButton botao1;
        
        
        public MVP(){
            
            this.janela1 = new JFrame("MVP");
            janela1.setSize(300, 200);
            janela1.setTitle("MVP");
            janela1.setLayout(null);
            janela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
            this.rotulo1 = new JLabel("Valor de venda:");
            rotulo1.setBounds(10,10, 300,50);
            janela1.add(rotulo1);
            
            this.valor = new JTextField();
            valor.setBounds(100,30, 80,15);
            janela1.add(valor);
            
            this.botao1 = new JButton();
            JButton botao1 = new JButton("Ok");
            botao1.setBounds(90,70,100,30);
            janela1.add(botao1);
            
            botao1.addActionListener(new ActionListener(){
                
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                    
                    double valorM = Double.parseDouble(valor.getText());
                        if(valorM > 500){
                            double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual do desconto:"));
                            double total = valorM - (valorM * (desconto/100));
                            JOptionPane.showMessageDialog(null, "O valor total de vendas é: "+total);
                        }

                        else{
                            double total = valorM;
                            JOptionPane.showMessageDialog(null, "O valor total de vendas é: "+total);

                        }
                        
                    } catch (NumberFormatException excpt) {
                        JOptionPane.showMessageDialog(null, "Digite algo válido!");
                    
                    }
                }
                
            
            });
            
            janela1.setVisible(true);
            
        }

}
