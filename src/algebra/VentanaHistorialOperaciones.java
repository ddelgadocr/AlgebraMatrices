/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

/**
 *
 * @author Daniel
 */
public class VentanaHistorialOperaciones extends javax.swing.JFrame {

    /**
     * Creates new form VentanaHistorialOperaciones
     */
    public VentanaHistorialOperaciones() {
        initComponents();
        textHistorial.setEditable(false);
        System.out.println("ArrayOperacionesSize: " + Main.arrayOperaciones.size());
        System.out.println("ArrayOperacionesStringSize: " + Main.arrayOperacionesString.size());
        
        // Agrega matrices del arrayOperaciones.
        int numerador, denominador, digitos;
        int jContador = 1;
        for (int p = 0; p < Main.arrayOperaciones.size(); p++){
            // Dibujando bordes superiores de matriz.
            for (int i = -1; i <= (Main.matrizCol * 10); i++){
                    textHistorial.append("─");
            }
            textHistorial.append("\n");
            for (int i = 1; i <= Main.matrizFil; i++){               
                textHistorial.append("│");
                while (jContador <= Main.matrizCol){
                    numerador = Main.arrayOperaciones.get(p).getElemento(i - 1, jContador - 1).getNumerator();
                    denominador = Main.arrayOperaciones.get(p).getElemento(i - 1, jContador - 1).getDenominator();
                    // Validando numerador negativo, para orden de matriz.
                    if(numerador < 0) textHistorial.append("-");
                    textHistorial.append(Integer.toString(Math.abs(numerador)));
                    if(denominador > 1 || denominador < -1) textHistorial.append("/" + denominador);
                    
                    if (numerador == 0) digitos = ((int)Math.log10(denominador) + 1) + 1; // El último +1 es del '/'.
                    else if (denominador == 0 || denominador == 1 || denominador == -1) digitos = ((int)Math.log10(numerador) + 1);
                    else digitos = ((int)Math.log10(numerador) + 1) + ((int)Math.log10(denominador) + 1); // El último +1 es del '/'.
                    // Agrega espacios restantes de matriz. Para que se vea bonita :)
                    if (numerador < 0) {
                        digitos += 3;
                        textHistorial.append(" ");
                    }
                    while(digitos < 12){
                        textHistorial.append("  ");
                        digitos++;
                    }
                    textHistorial.append("│");
                    jContador++;
                }
                //textHistorial.append("│");
                textHistorial.append("\n");
                jContador = 1;         
            }
            // Dibujando bordes inferiores de matriz.
            for (int i = -1; i <= (Main.matrizCol * 10); i++){
                    textHistorial.append("─");
            }
            textHistorial.append("\n");
            for (int i = 0; i <= (Main.matrizCol * 6); i++){
                textHistorial.append("  "); 
            }
            if (p > 0) textHistorial.append("(" + Integer.toString(p) + ") " + Main.arrayOperacionesString.get(p - 1));
            textHistorial.append("\n\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textHistorial = new javax.swing.JTextArea();
        HistorialOperaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textHistorial.setColumns(20);
        textHistorial.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textHistorial.setRows(5);
        jScrollPane1.setViewportView(textHistorial);

        HistorialOperaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistorialOperaciones.setText("Cerrar");
        HistorialOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialOperacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(HistorialOperaciones)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HistorialOperaciones)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialOperacionesActionPerformed
        this.dispose();
    }//GEN-LAST:event_HistorialOperacionesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaHistorialOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaHistorialOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaHistorialOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistorialOperaciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textHistorial;
    // End of variables declaration//GEN-END:variables
}
