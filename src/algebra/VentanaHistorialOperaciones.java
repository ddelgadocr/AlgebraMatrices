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
        System.out.println("MATRICES:");
        for (int i = 0; i < Main.arrayOperaciones.size(); i++){            
            Main.arrayOperaciones.get(i).imprime();
            System.out.println(System.identityHashCode(Main.arrayOperaciones.get(i)));
        }
        System.out.println("********:");
        Main.arrayOperaciones.get(0).imprime();
        Main.arrayOperaciones.get(1).imprime();
        System.out.println("********:");
        
        // Agrega matriz original.
        int numerador, denominador;
        int jContador = 1;
        for (int i = 1; i <= Main.matrizFil; i++){
            textHistorial.append("|");
            while (jContador <= Main.matrizCol){
                            numerador = Main.arrayOperaciones.get(Main.arrayOperaciones.size() - 1).getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = Main.arrayOperaciones.get(Main.arrayOperaciones.size() - 1).getElemento(i - 1, jContador - 1).getDenominator();
                            textHistorial.append(numerador + "/" + denominador + "  ");
                jContador++;
            }
            textHistorial.append("\n");
            jContador = 1;         
        }
        
        Main.arrayOperaciones.get(0).imprime();
        
        for (int i = 0; i < Main.arrayOperacionesString.size(); i++){
            textHistorial.append("[" + Integer.toString(i + 1) + "] " + Main.arrayOperacionesString.get(i) + "\n");
            
        }
        /*for (int i = 0; i < Main.arrayOperaciones.size(); i++){
            for (int j = 0; j < )
            Main.arrayOperaciones.get(i).getElemento(i, NORMAL)
        }
                    
        /*
            public void imprime() {

            String borde = "|";
            System.out.println();

            for (int i=0; i<elementos.length; i++) {
                 System.out.print(borde); 
                 Fraction[] filai = elementos[i];
                 for (int j=0; j< filai.length; j++) {
                     imprimeElemento(elementos[i][j]); 
                 }            
                 System.out.print(borde);
                 System.out.println(); 
             }
             System.out.println();
         }

         public void imprimeElemento(Fraction d) {
             System.out.print(d.getNumerator() +"/"+ d.getDenominator()+ "  ");
         }
        
        
        */
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
                .addGap(356, 356, 356)
                .addComponent(HistorialOperaciones)
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
