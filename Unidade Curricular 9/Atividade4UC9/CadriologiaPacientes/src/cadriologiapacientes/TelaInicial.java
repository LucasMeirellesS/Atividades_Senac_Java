/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadriologiapacientes;


import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paciente.Exame;
import paciente.ListaExames;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        salvarAtalho();
        ler();
    }

    public void salvarAtalho(){
        btnRegistrar.setMnemonic(KeyEvent.VK_S);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblHora = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        lblPressaoS = new javax.swing.JLabel();
        txtPressaoS = new javax.swing.JTextField();
        lblPressaoD = new javax.swing.JLabel();
        txtPressaoD = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        checkEstress = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExame = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Relatório Médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18))); // NOI18N
        jLayeredPane1.setToolTipText("Registre os dados dos Resultados da consulta");

        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setLabelFor(txtData);
        lblData.setText("Data:");

        txtData.setToolTipText("Digite a data do exame");
        txtData.setNextFocusableComponent(txtHora);

        lblHora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHora.setText("Hora:");

        txtHora.setToolTipText("Digite a hora do exame");
        txtHora.setNextFocusableComponent(txtPressaoS);

        lblPressaoS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPressaoS.setText("Pressão Sistólica:");

        txtPressaoS.setToolTipText("Digite o valor da pressão sistólica");

        lblPressaoD.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblPressaoD.setText("Pressão Diastólica:");

        txtPressaoD.setToolTipText("Digite o valor da pressão diastólica");
        txtPressaoD.setNextFocusableComponent(checkEstress);

        btnRegistrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setToolTipText("Salvar dados");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        checkEstress.setText("Sob estresse");
        checkEstress.setToolTipText("Marque se o paciênte estava sob situação de estresse");
        checkEstress.setNextFocusableComponent(btnRegistrar);

        tblExame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Data", "Hora", "Pressão Sistólica", "Pressão Diastólica", "Sob Estresse?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblExame);

        lblNome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome:");

        lblIdade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblIdade.setLabelFor(txtIdade);
        lblIdade.setText("Idade:");
        lblIdade.setToolTipText("");

        jLayeredPane1.setLayer(lblData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtHora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPressaoS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPressaoS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPressaoD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtPressaoD, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(checkEstress, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblIdade)
                .addGap(177, 177, 177))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPressaoS, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPressaoS)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblData)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome)
                            .addComponent(checkEstress))
                        .addGap(150, 150, 150)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHora)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPressaoD)
                            .addComponent(txtPressaoD, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPressaoS)
                    .addComponent(lblPressaoD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPressaoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPressaoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(checkEstress)
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if(!emptyField()){
            if(validar()){
            
                Exame exame = new Exame();
                exame = getExame();
                
                ListaExames.Adicionar(exame);
                atualizar();
                JOptionPane.showMessageDialog(rootPane, "Os seguintes dados foram registrados:"
                        +"\nNome:"+txtNome.getText()
                        +"\nIdade:"+txtIdade.getText()
                        +"\nData:"+txtData.getText()
                        +"\nHora:"+txtHora.getText()
                        +"\nPressão Sistólica:"+txtPressaoS.getText()
                        +"\nPressão Diastólica:"+txtPressaoD.getText()
                );
                Registrar();
                txtNome.setText("");
                txtIdade.setText("");
                txtData.setText("");
                txtHora.setText("");
                txtPressaoS.setText("");
                txtPressaoD.setText("");
                checkEstress.setSelected(false);
            }
    
        }
        ler();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox checkEstress;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPressaoD;
    private javax.swing.JLabel lblPressaoS;
    private javax.swing.JTable tblExame;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPressaoD;
    private javax.swing.JTextField txtPressaoS;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    public boolean validar(){
        
        String idade = txtIdade.getText();
        String data = txtData.getText();
        String pressaoS = txtPressaoS.getText();
        String pressaoD = txtPressaoD.getText();
        String hora = txtHora.getText();
        boolean idadeVal = idade.matches("[0-9]{2}|[0-9]{3}");
        boolean dataVal = data.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}");
        boolean pressaoSVal = pressaoS.matches("[0-9]{2}|[0-9]{3}");
        boolean pressaoDVal = pressaoD.matches("[0-9]{2}|[0-9]{3}");
        boolean horaVal = hora.matches("[0-9]{2}:[0-9]{2}");
        
        if(idadeVal == true & dataVal == true & pressaoSVal == true & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Hora está no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == true & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Pressão Diastólica está no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == false & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Pressão Sistólica está no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == true & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Data está no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == true & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade está no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == true & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade e data estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == false & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade e Pressão Sistólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == true & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == true & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Idade e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == false & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Data e Pressão Sistólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == true & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Data e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == true & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == false & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Pressão Sistólica e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == false & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Pressão Sistólica e hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == true & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Pressão Diastólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == false & pressaoDVal == true & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade, Data e Pressão Sistólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == true & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade, Data e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == true & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Idade, Data e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == false & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Sistólica e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == false & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Sistólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == true & pressaoSVal == false & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Pressão Sistólica, Pressão Diastólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == false & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Idade, Pressão Sistólica e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == true & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Idade, Pressão Diastólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == true & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Diastólica e Idade estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == true & dataVal == false & pressaoSVal == false & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Diastólica, Pressão Sistólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == true & pressaoSVal == false & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Idade, Pressão Diastólica, Pressão Sistólica e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == true & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Diastólica, Idade e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == false & pressaoDVal == true & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Sistólica, Idade e Hora estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == false & pressaoDVal == false & horaVal == true){
            JOptionPane.showMessageDialog(rootPane, "Data, Pressão Sistólica, Idade e Pressão Diastólica estão no formato incorreto!");
            return false;
        }
        
        else if(idadeVal == false & dataVal == false & pressaoSVal == false & pressaoDVal == false & horaVal == false){
            JOptionPane.showMessageDialog(rootPane, "Todos os campos estão no formato incorreto!");
            return false;
        }
        
        else{
            return true;
        }
       
        
    }
    
    public boolean emptyField(){
        boolean isEmpty = true;
        if(txtNome.getText().trim().isEmpty() || txtIdade.getText().trim().isEmpty() || txtData.getText().trim().isEmpty() 
                || txtHora.getText().trim().isEmpty() || txtPressaoD.getText().trim().isEmpty() || txtPressaoS.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Não é possível inserir elementos vazios.");
           
        }
        else{
            return false;
        }
        
        return isEmpty;
    }
    
    private final String[] colunas = {"Nome", "Idade", "Data", "Hora", "Pressão Sistólica", "Pressão Diabólica", "Sob Pressão?"};
    DefaultTableModel tabelaModelo = new DefaultTableModel(colunas, 0);
    private List<Exame> listaExames = ListaExames.Listar();
    
    public void atualizar(){
        try{
            if(!listaExames.isEmpty()){



                tabelaModelo = new DefaultTableModel(colunas, 0);

                List<List<String>> data = new ArrayList<>();

                      //caminho de arquivo
                      String file = path;
                      FileReader fr = new FileReader(file);
                      BufferedReader br = new BufferedReader(fr);

                      //lendo linha a linha 
                      String line = br.readLine();
                      while (line != null) {
                          //separando as informações através do metodo split dos dados 
                          //delimitados em ponto e virgula
                          List<String> lineData = Arrays.asList(line.split(";"));
                          data.add(lineData);
                          line = br.readLine();
                      }
                      String estresse;
                      if(checkEstress.isSelected()){
                            estresse = "Sim";
                        }

                        else{
                            estresse = "Não";
                        }
                      List<String> lineData = Arrays.asList(txtNome.getText(), txtIdade.getText(), txtData.getText(),
                              txtHora.getText(), txtPressaoS.getText(), txtPressaoD.getText(), estresse
                      );
                          data.add(lineData);
                for (int j = 0; j < data.size(); j++) {
                      if(j == 0){
                          continue;
                      }
                      else{
                            List<String> list = data.get(j);

                            for (int i = 0; i < list.size(); i = i + 7) {

                                String[] linha = {list.get(i), list.get(i+1), list.get(i+2), list.get(i+3), list.get(i+4), list.get(i+5), list.get(i+6)};

                              tabelaModelo.addRow(linha);
                            }
                            tblExame.setModel(tabelaModelo);
                        }
                  }
            
            }
        
    
        
        
        
        else{
            tabelaModelo = new DefaultTableModel(colunas, 0);
            tblExame.setModel(tabelaModelo);
        }
       }
        catch(Exception e){
            
        }
    }
    
       
    
    
    public Exame getExame(){
       
        Exame exame = new Exame();
        
        exame.setNome(txtNome.getText());
        exame.setIdade(txtIdade.getText());
        exame.setData(txtData.getText());
        exame.setHora(txtHora.getText());
        exame.setPressaoS(txtPressaoS.getText());
        exame.setPressaoD(txtPressaoD.getText());
        
        if(checkEstress.isSelected()){
            exame.setSobPressao("Sim");
        
        }
        else{
            exame.setSobPressao("Não");
        }
        
        return exame;
    }
    public JFileChooser path(){
        JOptionPane.showMessageDialog(rootPane, "Escolha uma pasta para criar ou escolher o arquivo para realizar a inserção e leitura de dados!");
        JFileChooser j = new JFileChooser("C:");
        int r = j.showOpenDialog(null);
        if(r == JFileChooser.APPROVE_OPTION){
            return j;
        }
        else{
            System.exit(0);
        }
        return j;
    }
    
    String path = path().getSelectedFile().getAbsolutePath();
    
    File obj = new File(path);
    
    public int getLinhas(){
        int contagem = 0;
        try {
                  //criando uma lista para armazenar os dados
                  
                  
                  //caminho de arquivo
                  FileReader fr = new FileReader(obj);
                  BufferedReader br = new BufferedReader(fr);

                  //lendo linha a linha 
                  String line = br.readLine();
                  while (line != null) {
                      //separando as informações através do metodo split dos dados 
                      //delimitados em ponto e virgula
                      contagem++;
                      line = br.readLine();
                  }
                  
                  //imprimindo os dados buscados
                  br.close();
              } catch (Exception e) {
                  System.out.print("Deu um erro aqui, meu chapa;");
              }
        return contagem;
    }
    
    public void Registrar(){
        
        String estresse;
        List<Exame> examesL = ListaExames.Listar();
        Exame exame;
        FileWriter csvWriter;
        
        try{
            
            if(!obj.exists()){
                obj.createNewFile();
                csvWriter = new FileWriter(obj);
                csvWriter.append("Nome");
                csvWriter.append(";");
                csvWriter.append("Idade");
                csvWriter.append(";");
                csvWriter.append("Data");
                csvWriter.append(";");
                csvWriter.append("Hora");
                csvWriter.append(";");
                csvWriter.append("Pressão Sistólica");
                csvWriter.append(";");
                csvWriter.append("Pressão Diabólica");
                csvWriter.append(";");
                csvWriter.append("Sob Estresse?");
                csvWriter.append("\n");
            }
            else{
                csvWriter = new FileWriter(obj,true);
            }
            
            if(checkEstress.isSelected()){
                estresse = "Sim";
            }
            
            else{
                estresse = "Não";
            }
            
            List<List<String>> rows = Arrays.asList(
                    Arrays.asList(txtNome.getText(), txtIdade.getText(), 
                            txtData.getText(), txtHora.getText(),
                            txtPressaoS.getText(), txtPressaoD.getText(), estresse)
            );
            
            for (List<String> rowData : rows) {
                  csvWriter.append(String.join(";", rowData));
                  csvWriter.append("\n");
            }
            
            csvWriter.flush();
            csvWriter.close();
            
            
            
            
            csvWriter.flush();
            csvWriter.close();
        }
        catch(IOException e){
            
        }
    }
    
    public void ler(){
         tabelaModelo = new DefaultTableModel(colunas, 0);
        try {
                  //criando uma lista para armazenar os dados
                  List<List<String>> data = new ArrayList<>();

                  //caminho de arquivo
                  String file = path;
                  FileReader fr = new FileReader(file);
                  BufferedReader br = new BufferedReader(fr);

                  //lendo linha a linha 
                  String line = br.readLine();
                  while (line != null) {
                      //separando as informações através do metodo split dos dados 
                      //delimitados em ponto e virgula
                      List<String> lineData = Arrays.asList(line.split(";"));
                      data.add(lineData);
                      line = br.readLine();
                  }
                    
                  //imprimindo os dados buscados
                  for (int j = 0; j < data.size(); j++) {
                      if(j == 0){
                          continue;
                      }
                      else{
                            List<String> list = data.get(j);

                            for (int i = 0; i < list.size(); i = i + 7) {

                                String[] linha = {list.get(i), list.get(i+1), list.get(i+2), list.get(i+3), list.get(i+4), list.get(i+5), list.get(i+6)};

                              tabelaModelo.addRow(linha);
                            }
                            tblExame.setModel(tabelaModelo);
                        }
                  }
                  //fechando o arquivo
                  br.close();
              } catch (Exception e) {
                  
              }
        
        
    
    }

}
