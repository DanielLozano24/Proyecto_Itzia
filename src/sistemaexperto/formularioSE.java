package sistemaexperto;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;


public class formularioSE extends javax.swing.JFrame {

   
    public formularioSE() {
        initComponents();
        setTitle("Sistema Experto para la identificacion de Alumnos");
        setResizable(false);
        this.setLocationRelativeTo(null);
        texto.setEditable(false);
    }

    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido al Sistema Experto para reconocimineto de Alumnos ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(84, 84, 84))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.gray));

        jButton1.setText("Empezar");
        jButton1.setToolTipText("Clic para comenzar el examen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);

        jLabel6.setText("Para comenzar con el cuestionario dar click ");

        jLabel3.setText("en el boton Empezar, conteste las preguntas de acuerdo ");

        jLabel7.setText("a los rasgos fisicos del alumno, una vez terminado el");

        jLabel8.setText("cuestionario obtendra como resultado el nombre del alumno.");

        jButton2.setText("Salir");
        jButton2.setToolTipText("Clic para salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int a;
          
        a = JOptionPane.showConfirmDialog(rootPane,"¿EL alumno es hombre?", null, YES_NO_OPTION);
                
        if(a == 0){
            hombres();
        }
        else{
            mujeres();
              }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hombres(){
      int a,b,c;
      
      a = JOptionPane.showConfirmDialog(rootPane, "¿El alumno es de estatura alta?", null, YES_NO_OPTION);
    
      if((a==0)){
      b = JOptionPane.showConfirmDialog(rootPane, "¿El alumno es de tez morena?", null, YES_NO_OPTION);
       if (b==0){
            String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Manuel Alvarez Castro            \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
          }
       else{
           c = JOptionPane.showConfirmDialog(rootPane, "¿El alumno tiene barba?", null, YES_NO_OPTION);
           if (c==0){ 
               String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Raúl Basurto Valdivia         \n"
                     + "----------------------------------------------------";
           texto.setText(dg);   
           }
           else if (c==1){
               String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  David Weston Milla Cooley        \n"
                     + "----------------------------------------------------";
           texto.setText(dg);   
               
           }
       }
       }
      else if (a==1){
           hombres_2();
       }
    }
    
    private void hombres_2(){
      int a,b;
      
      a = JOptionPane.showConfirmDialog(rootPane, "¿El alumno tiene cabello chino?", null, YES_NO_OPTION);
    
      if((a==0)){
      b = JOptionPane.showConfirmDialog(rootPane, "¿El alumno habla con acento?", null, YES_NO_OPTION);
       if (b==0){
            String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Omar Alejandro Alonso Ruiz          \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
          }
       else{
           String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Humberto Gerardo Marin Muñoz            \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
          }
       }
      else if (a==1){
           hombres_3();
       }
    }
    
    
     private void hombres_3(){
      int a,b,c;
      
      a = JOptionPane.showConfirmDialog(rootPane, "¿El alumno usa lentes?", null, YES_NO_OPTION);
        if((a==0)){
            String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Diego Enrique Garcia Larrondo            \n"
                     + "----------------------------------------------------";
          texto.setText(dg);
      
       }
      else if (a==1){
      b = JOptionPane.showConfirmDialog(rootPane, "¿El alumno es de tez morena?", null, YES_NO_OPTION);
      if (b==0){
          String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  José Daniel Lozano Vargas            \n"
                     + "----------------------------------------------------";
          texto.setText(dg);
      }
      else if (b==1){
          String dg = "---------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    El alumno es:                                  \n"
                     + "-                  Jorge Alberto Garzón Jimenez            \n"
                     + "----------------------------------------------------";
          texto.setText(dg);
      }
       }  
    }
   
    private void mujeres (){
      int a;  
      
      a= JOptionPane.showConfirmDialog(rootPane, "¿La alumna es de estatura alta?", null, YES_NO_OPTION);

      
      if(a==0){
           String dg = "----------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    La alumna es:                                  \n"
                     + "-                 Doris Marcela García Herrera      \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
      }
      else{
           String dg = "----------------------------------------------------\n"
                     + "-            ANALISIS COMPLETO                      \n"
                     + "-    La alumna es:                                  \n"
                     + "-                 Monica Leticia Rivera Sanchez      \n"
                     + "----------------------------------------------------";
           
          texto.setText(dg);
          
      }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioSE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioSE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables
}
