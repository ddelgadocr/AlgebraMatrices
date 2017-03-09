/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class VentanaOperaciones extends javax.swing.JFrame {
    private ArrayList<JSeparator> arraySeparadores = new ArrayList<>();
    
    private ArrayList<JTextField> arrayFila1 = new ArrayList<>();
    private ArrayList<JTextField> arrayFila2 = new ArrayList<>();
    private ArrayList<JTextField> arrayFila3 = new ArrayList<>();
    private ArrayList<JTextField> arrayFila4 = new ArrayList<>();
    private ArrayList<JTextField> arrayFila5 = new ArrayList<>();
    
    public VentanaOperaciones() {
        initComponents();
        
        arrayFila1.add(NumF1C1); arrayFila1.add(DenF1C1);
        arrayFila1.add(NumF1C2); arrayFila1.add(DenF1C2);
        arrayFila1.add(NumF1C3); arrayFila1.add(DenF1C3);
        arrayFila1.add(NumF1C4); arrayFila1.add(DenF1C4);
        arrayFila1.add(NumF1C5); arrayFila1.add(DenF1C5);

        arrayFila2.add(NumF2C1); arrayFila2.add(DenF2C1);
        arrayFila2.add(NumF2C2); arrayFila2.add(DenF2C2);
        arrayFila2.add(NumF2C3); arrayFila2.add(DenF2C3);
        arrayFila2.add(NumF2C4); arrayFila2.add(DenF2C4);
        arrayFila2.add(NumF2C5); arrayFila2.add(DenF2C5);

        arrayFila3.add(NumF3C1); arrayFila3.add(DenF3C1);
        arrayFila3.add(NumF3C2); arrayFila3.add(DenF3C2);
        arrayFila3.add(NumF3C3); arrayFila3.add(DenF3C3);
        arrayFila3.add(NumF3C4); arrayFila3.add(DenF3C4);
        arrayFila3.add(NumF3C5); arrayFila3.add(DenF3C5);

        arrayFila4.add(NumF4C1); arrayFila4.add(DenF4C1);
        arrayFila4.add(NumF4C2); arrayFila4.add(DenF4C2);
        arrayFila4.add(NumF4C3); arrayFila4.add(DenF4C3);
        arrayFila4.add(NumF4C4); arrayFila4.add(DenF4C4);
        arrayFila4.add(NumF4C5); arrayFila4.add(DenF4C5);

        arrayFila5.add(NumF5C1); arrayFila5.add(DenF5C1);
        arrayFila5.add(NumF5C2); arrayFila5.add(DenF5C2);
        arrayFila5.add(NumF5C3); arrayFila5.add(DenF5C3);
        arrayFila5.add(NumF5C4); arrayFila5.add(DenF5C4);
        arrayFila5.add(NumF5C5); arrayFila5.add(DenF5C5);
        
        arraySeparadores.add(SepF1C1); arraySeparadores.add(SepF1C2);
        arraySeparadores.add(SepF1C3); arraySeparadores.add(SepF1C4);
        arraySeparadores.add(SepF1C5); arraySeparadores.add(SepF2C1);
        arraySeparadores.add(SepF2C2); arraySeparadores.add(SepF2C3);
        arraySeparadores.add(SepF2C4); arraySeparadores.add(SepF2C5);
        arraySeparadores.add(SepF3C1); arraySeparadores.add(SepF3C2);
        arraySeparadores.add(SepF3C3); arraySeparadores.add(SepF3C4);
        arraySeparadores.add(SepF3C5); arraySeparadores.add(SepF4C1);      
        arraySeparadores.add(SepF4C2); arraySeparadores.add(SepF4C3);        
        arraySeparadores.add(SepF4C4); arraySeparadores.add(SepF4C5);       
        arraySeparadores.add(SepF5C1); arraySeparadores.add(SepF5C2);    
        arraySeparadores.add(SepF5C3); arraySeparadores.add(SepF5C4);        
        arraySeparadores.add(SepF5C5);
        
        filA1.setActionCommand("1");
        filA1.setSelected(true);
        filB2.setActionCommand("2");
        filB2.setSelected(true);
        
        // Vuelve invisible los componentes de ventana no default.
        labelB.setVisible(false);
        labelD.setVisible(false);
        filB1.setVisible(false);
        filB2.setVisible(false);
        filB3.setVisible(false);
        filB4.setVisible(false);
        filB5.setVisible(false);        

        labelA.setText("Fila:");
        labelC.setText("Escalar:");
        
        // Oculta todas las fracciones y separadores, luego se vuelven visibles de acuerdo a filasXcolumnas.
        for (int i = 0; i < arrayFila1.size(); i++) {
            arrayFila1.get(i).setVisible(false);
            arrayFila2.get(i).setVisible(false);
            arrayFila3.get(i).setVisible(false);
            arrayFila4.get(i).setVisible(false);
            arrayFila5.get(i).setVisible(false);
        }
        for (int i = 0; i < arraySeparadores.size(); i++) 
            arraySeparadores.get(i).setVisible(false);
        
        // Volviendo separadores de fracción visibles.
        int f = 0;
        int fContador = 1;
        for(int i = 0; i < Main.matrizFil; i++){
            for(int j = f; fContador <= Main.matrizCol; j++){
                arraySeparadores.get(j).setVisible(true);
                fContador++;
            }
            f += 5;
            fContador = 1;
        }
        
        switch (Main.matrizFil){
            case 1: Main.matrizFil = 1;
                LabelFil2.setVisible(false);
                LabelFil3.setVisible(false);
                LabelFil4.setVisible(false);
                LabelFil5.setVisible(false);
                filA2.setVisible(false);
                filA3.setVisible(false);
                filA4.setVisible(false);
                filA5.setVisible(false);
                break;
            case 2: Main.matrizFil = 2;
                LabelFil3.setVisible(false);
                LabelFil4.setVisible(false);
                LabelFil5.setVisible(false);
                filA3.setVisible(false);
                filA4.setVisible(false);
                filA5.setVisible(false);
                break;
            case 3: Main.matrizFil = 3;
                LabelFil4.setVisible(false);
                LabelFil5.setVisible(false);
                filA4.setVisible(false);
                filA5.setVisible(false);
                break;
            case 4: Main.matrizFil = 4;
                LabelFil5.setVisible(false);
                filA5.setVisible(false);
        }
        
        switch (Main.matrizCol){
            case 1: Main.matrizCol = 1;
                LabelCol2.setVisible(false);
                LabelCol3.setVisible(false);
                LabelCol4.setVisible(false);
                LabelCol5.setVisible(false);
                break;
            case 2: Main.matrizCol = 2;
                LabelCol3.setVisible(false);
                LabelCol4.setVisible(false);
                LabelCol5.setVisible(false);
                break;
            case 3: Main.matrizCol = 3;
                LabelCol4.setVisible(false);
                LabelCol5.setVisible(false);
                break;
            case 4: Main.matrizCol = 4;
                LabelCol5.setVisible(false);
        }
        
        int i = 0;
        switch (Main.matrizFil) {
            case 1: Main.matrizFil = 1;
                i = 9;
                break;
            case 2: Main.matrizFil = 2;
                i = 19;
                break;
            case 3: Main.matrizFil = 3;
                i = 29;
                break;
            case 4: Main.matrizFil = 4;
                i = 39;
                break;
            case 5: Main.matrizFil = 5;
                i = 49;
                break;
        }
        
        int rContador = 1;
        int r = 0;
        for (int k = 1; k <= Main.matrizFil; k++){
            while (rContador <= Main.matrizCol){
                switch (k) {
                    case 1: k = 1;
                        arrayFila1.get(r).setVisible(true);
                        arrayFila1.get(r+1).setVisible(true);
                        break;
                    case 2: k = 2;
                        arrayFila2.get(r).setVisible(true);
                        arrayFila2.get(r+1).setVisible(true);
                        break;
                    case 3: k = 3;
                        arrayFila3.get(r).setVisible(true);
                        arrayFila3.get(r+1).setVisible(true);
                        break;
                    case 4: k = 4;
                        arrayFila4.get(r).setVisible(true);
                        arrayFila4.get(r+1).setVisible(true);
                        break;
                    case 5: k = 5;
                        arrayFila5.get(r).setVisible(true);
                        arrayFila5.get(r+1).setVisible(true);
                        break;
                }
                r += 2;
                rContador++;
            }
            r = 0;
            rContador = 1;
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

        jSeparator5 = new javax.swing.JSeparator();
        ComboFilaA = new javax.swing.ButtonGroup();
        ComboFilaB = new javax.swing.ButtonGroup();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jPanel1 = new javax.swing.JPanel();
        LabelCol1 = new javax.swing.JLabel();
        LabelFil2 = new javax.swing.JLabel();
        LabelFil3 = new javax.swing.JLabel();
        LabelFil1 = new javax.swing.JLabel();
        LabelFil4 = new javax.swing.JLabel();
        LabelCol4 = new javax.swing.JLabel();
        LabelFil5 = new javax.swing.JLabel();
        LabelCol2 = new javax.swing.JLabel();
        LabelCol3 = new javax.swing.JLabel();
        LabelCol5 = new javax.swing.JLabel();
        panel8 = new javax.swing.JPanel();
        NumF2C4 = new javax.swing.JTextField();
        DenF2C4 = new javax.swing.JTextField();
        SepF2C4 = new javax.swing.JSeparator();
        panel11 = new javax.swing.JPanel();
        NumF3C2 = new javax.swing.JTextField();
        DenF3C2 = new javax.swing.JTextField();
        SepF3C2 = new javax.swing.JSeparator();
        panel23 = new javax.swing.JPanel();
        NumF5C4 = new javax.swing.JTextField();
        SepF5C4 = new javax.swing.JSeparator();
        DenF5C4 = new javax.swing.JTextField();
        panel7 = new javax.swing.JPanel();
        NumF2C3 = new javax.swing.JTextField();
        DenF2C3 = new javax.swing.JTextField();
        SepF2C3 = new javax.swing.JSeparator();
        panel9 = new javax.swing.JPanel();
        NumF2C5 = new javax.swing.JTextField();
        DenF2C5 = new javax.swing.JTextField();
        SepF2C5 = new javax.swing.JSeparator();
        panel16 = new javax.swing.JPanel();
        NumF4C2 = new javax.swing.JTextField();
        DenF4C2 = new javax.swing.JTextField();
        SepF4C2 = new javax.swing.JSeparator();
        panel6 = new javax.swing.JPanel();
        NumF2C2 = new javax.swing.JTextField();
        DenF2C2 = new javax.swing.JTextField();
        SepF2C2 = new javax.swing.JSeparator();
        panel15 = new javax.swing.JPanel();
        NumF4C1 = new javax.swing.JTextField();
        DenF4C1 = new javax.swing.JTextField();
        SepF4C1 = new javax.swing.JSeparator();
        panel17 = new javax.swing.JPanel();
        NumF4C3 = new javax.swing.JTextField();
        DenF4C3 = new javax.swing.JTextField();
        SepF4C3 = new javax.swing.JSeparator();
        panel1 = new javax.swing.JPanel();
        NumF1C2 = new javax.swing.JTextField();
        DenF1C2 = new javax.swing.JTextField();
        SepF1C2 = new javax.swing.JSeparator();
        panel3 = new javax.swing.JPanel();
        NumF1C4 = new javax.swing.JTextField();
        DenF1C4 = new javax.swing.JTextField();
        SepF1C4 = new javax.swing.JSeparator();
        panel2 = new javax.swing.JPanel();
        NumF1C3 = new javax.swing.JTextField();
        DenF1C3 = new javax.swing.JTextField();
        SepF1C3 = new javax.swing.JSeparator();
        panel18 = new javax.swing.JPanel();
        NumF4C4 = new javax.swing.JTextField();
        SepF4C4 = new javax.swing.JSeparator();
        DenF4C4 = new javax.swing.JTextField();
        panel21 = new javax.swing.JPanel();
        NumF5C2 = new javax.swing.JTextField();
        DenF5C2 = new javax.swing.JTextField();
        SepF5C2 = new javax.swing.JSeparator();
        panel22 = new javax.swing.JPanel();
        NumF5C3 = new javax.swing.JTextField();
        DenF5C3 = new javax.swing.JTextField();
        SepF5C3 = new javax.swing.JSeparator();
        panel5 = new javax.swing.JPanel();
        NumF2C1 = new javax.swing.JTextField();
        DenF2C1 = new javax.swing.JTextField();
        SepF2C1 = new javax.swing.JSeparator();
        panel12 = new javax.swing.JPanel();
        NumF3C3 = new javax.swing.JTextField();
        DenF3C3 = new javax.swing.JTextField();
        SepF3C3 = new javax.swing.JSeparator();
        panel10 = new javax.swing.JPanel();
        NumF3C1 = new javax.swing.JTextField();
        DenF3C1 = new javax.swing.JTextField();
        SepF3C1 = new javax.swing.JSeparator();
        panel20 = new javax.swing.JPanel();
        NumF5C1 = new javax.swing.JTextField();
        DenF5C1 = new javax.swing.JTextField();
        SepF5C1 = new javax.swing.JSeparator();
        panel14 = new javax.swing.JPanel();
        NumF3C5 = new javax.swing.JTextField();
        DenF3C5 = new javax.swing.JTextField();
        SepF3C5 = new javax.swing.JSeparator();
        panel4 = new javax.swing.JPanel();
        NumF1C5 = new javax.swing.JTextField();
        DenF1C5 = new javax.swing.JTextField();
        SepF1C5 = new javax.swing.JSeparator();
        panel13 = new javax.swing.JPanel();
        NumF3C4 = new javax.swing.JTextField();
        DenF3C4 = new javax.swing.JTextField();
        SepF3C4 = new javax.swing.JSeparator();
        panel0 = new javax.swing.JPanel();
        NumF1C1 = new javax.swing.JTextField();
        DenF1C1 = new javax.swing.JTextField();
        SepF1C1 = new javax.swing.JSeparator();
        panel24 = new javax.swing.JPanel();
        NumF5C5 = new javax.swing.JTextField();
        DenF5C5 = new javax.swing.JTextField();
        SepF5C5 = new javax.swing.JSeparator();
        panel19 = new javax.swing.JPanel();
        NumF4C5 = new javax.swing.JTextField();
        DenF4C5 = new javax.swing.JTextField();
        SepF4C5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        EjecutarOperación = new javax.swing.JButton();
        ComboOperaciones = new javax.swing.JComboBox<>();
        labelA = new javax.swing.JLabel();
        textNum = new javax.swing.JTextField();
        labelC = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        labelD = new javax.swing.JLabel();
        filA4 = new javax.swing.JRadioButton();
        filA5 = new javax.swing.JRadioButton();
        filA1 = new javax.swing.JRadioButton();
        filA2 = new javax.swing.JRadioButton();
        filA3 = new javax.swing.JRadioButton();
        filB4 = new javax.swing.JRadioButton();
        filB5 = new javax.swing.JRadioButton();
        filB1 = new javax.swing.JRadioButton();
        filB2 = new javax.swing.JRadioButton();
        filB3 = new javax.swing.JRadioButton();
        textDen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        HistorialOperaciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelCol1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelCol1.setText("1");

        LabelFil2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelFil2.setText("2");

        LabelFil3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelFil3.setText("3");

        LabelFil1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelFil1.setText("1");

        LabelFil4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelFil4.setText("4");

        LabelCol4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelCol4.setText("4");

        LabelFil5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelFil5.setText("5");

        LabelCol2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelCol2.setText("2");

        LabelCol3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelCol3.setText("3");

        LabelCol5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelCol5.setText("5");

        NumF2C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        NumF2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C4ActionPerformed(evt);
            }
        });

        DenF2C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        DenF2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C4ActionPerformed(evt);
            }
        });

        SepF2C4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF3C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        NumF3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C2ActionPerformed(evt);
            }
        });

        DenF3C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        DenF3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C2ActionPerformed(evt);
            }
        });

        SepF3C2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF5C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        NumF5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C4ActionPerformed(evt);
            }
        });

        SepF5C4.setForeground(new java.awt.Color(0, 0, 0));

        DenF5C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        DenF5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel23Layout = new javax.swing.GroupLayout(panel23);
        panel23.setLayout(panel23Layout);
        panel23Layout.setHorizontalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel23Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel23Layout.setVerticalGroup(
            panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF2C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        NumF2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C3ActionPerformed(evt);
            }
        });

        DenF2C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        DenF2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C3ActionPerformed(evt);
            }
        });

        SepF2C3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF2C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        NumF2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C5ActionPerformed(evt);
            }
        });

        DenF2C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        DenF2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C5ActionPerformed(evt);
            }
        });

        SepF2C5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF4C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        NumF4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C2ActionPerformed(evt);
            }
        });

        DenF4C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        DenF4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C2ActionPerformed(evt);
            }
        });

        SepF4C2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel16Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF2C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        NumF2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C2ActionPerformed(evt);
            }
        });

        DenF2C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        DenF2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C2ActionPerformed(evt);
            }
        });

        SepF2C2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF4C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        NumF4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C1ActionPerformed(evt);
            }
        });

        DenF4C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        DenF4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C1ActionPerformed(evt);
            }
        });

        SepF4C1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel15Layout = new javax.swing.GroupLayout(panel15);
        panel15.setLayout(panel15Layout);
        panel15Layout.setHorizontalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel15Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel15Layout.setVerticalGroup(
            panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF4C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        NumF4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C3ActionPerformed(evt);
            }
        });

        DenF4C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        DenF4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C3ActionPerformed(evt);
            }
        });

        SepF4C3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel17Layout = new javax.swing.GroupLayout(panel17);
        panel17.setLayout(panel17Layout);
        panel17Layout.setHorizontalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel17Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel17Layout.setVerticalGroup(
            panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF1C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        NumF1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C2ActionPerformed(evt);
            }
        });

        DenF1C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        DenF1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C2ActionPerformed(evt);
            }
        });

        SepF1C2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF1C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        NumF1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C4ActionPerformed(evt);
            }
        });

        DenF1C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        DenF1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C4ActionPerformed(evt);
            }
        });

        SepF1C4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        NumF1C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        NumF1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C3ActionPerformed(evt);
            }
        });

        DenF1C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        DenF1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C3ActionPerformed(evt);
            }
        });

        SepF1C3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        NumF4C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        NumF4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C4ActionPerformed(evt);
            }
        });

        SepF4C4.setForeground(new java.awt.Color(0, 0, 0));

        DenF4C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        DenF4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel18Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF5C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        NumF5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C2ActionPerformed(evt);
            }
        });

        DenF5C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        DenF5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C2ActionPerformed(evt);
            }
        });

        SepF5C2.setForeground(new java.awt.Color(0, 0, 0));

        NumF5C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        NumF5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C3ActionPerformed(evt);
            }
        });

        DenF5C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        DenF5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C3ActionPerformed(evt);
            }
        });

        SepF5C3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel22Layout = new javax.swing.GroupLayout(panel22);
        panel22.setLayout(panel22Layout);
        panel22Layout.setHorizontalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel22Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel22Layout.setVerticalGroup(
            panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DenF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel21Layout = new javax.swing.GroupLayout(panel21);
        panel21.setLayout(panel21Layout);
        panel21Layout.setHorizontalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel21Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel21Layout.setVerticalGroup(
            panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel21Layout.createSequentialGroup()
                .addGroup(panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NumF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(SepF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(DenF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NumF2C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        NumF2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C1ActionPerformed(evt);
            }
        });

        DenF2C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        DenF2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C1ActionPerformed(evt);
            }
        });

        SepF2C1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(NumF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF3C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        NumF3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C3ActionPerformed(evt);
            }
        });

        DenF3C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        DenF3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C3ActionPerformed(evt);
            }
        });

        SepF3C3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF3C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        NumF3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C1ActionPerformed(evt);
            }
        });

        DenF3C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        DenF3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C1ActionPerformed(evt);
            }
        });

        SepF3C1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel10Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF5C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        NumF5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C1ActionPerformed(evt);
            }
        });

        DenF5C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        DenF5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C1ActionPerformed(evt);
            }
        });

        SepF5C1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel20Layout = new javax.swing.GroupLayout(panel20);
        panel20.setLayout(panel20Layout);
        panel20Layout.setHorizontalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel20Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel20Layout.setVerticalGroup(
            panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF3C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        NumF3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C5ActionPerformed(evt);
            }
        });

        DenF3C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        DenF3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C5ActionPerformed(evt);
            }
        });

        SepF3C5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel14Layout = new javax.swing.GroupLayout(panel14);
        panel14.setLayout(panel14Layout);
        panel14Layout.setHorizontalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel14Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel14Layout.setVerticalGroup(
            panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF1C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        NumF1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C5ActionPerformed(evt);
            }
        });

        DenF1C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        DenF1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C5ActionPerformed(evt);
            }
        });

        SepF1C5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF3C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        NumF3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C4ActionPerformed(evt);
            }
        });

        DenF3C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        DenF3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C4ActionPerformed(evt);
            }
        });

        SepF3C4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF1C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        NumF1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C1ActionPerformed(evt);
            }
        });

        DenF1C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0)));
        DenF1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C1ActionPerformed(evt);
            }
        });

        SepF1C1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel0Layout = new javax.swing.GroupLayout(panel0);
        panel0.setLayout(panel0Layout);
        panel0Layout.setHorizontalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel0Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );
        panel0Layout.setVerticalGroup(
            panel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        NumF5C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        NumF5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C5ActionPerformed(evt);
            }
        });

        DenF5C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        DenF5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C5ActionPerformed(evt);
            }
        });

        SepF5C5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel24Layout = new javax.swing.GroupLayout(panel24);
        panel24.setLayout(panel24Layout);
        panel24Layout.setHorizontalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel24Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel24Layout.setVerticalGroup(
            panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        NumF4C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        NumF4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C5ActionPerformed(evt);
            }
        });

        DenF4C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));
        DenF4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C5ActionPerformed(evt);
            }
        });

        SepF4C5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel19Layout = new javax.swing.GroupLayout(panel19);
        panel19.setLayout(panel19Layout);
        panel19Layout.setHorizontalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DenF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel19Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SepF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel19Layout.setVerticalGroup(
            panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(SepF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DenF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFil1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFil2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFil3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFil4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFil5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(398, 398, 398)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(400, 400, 400)
                                .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(300, 300, 300)
                                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LabelCol1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(LabelCol2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(LabelCol3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(LabelCol4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(LabelCol5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelCol1)
                    .addComponent(LabelCol2)
                    .addComponent(LabelCol3)
                    .addComponent(LabelCol4)
                    .addComponent(LabelCol5))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(LabelFil1)
                        .addGap(105, 105, 105)
                        .addComponent(LabelFil2)
                        .addGap(105, 105, 105)
                        .addComponent(LabelFil3)
                        .addGap(105, 105, 105)
                        .addComponent(LabelFil4)
                        .addGap(105, 105, 105)
                        .addComponent(LabelFil5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Operaciones Elementales");

        EjecutarOperación.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EjecutarOperación.setText("Ejecutar operación");
        EjecutarOperación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarOperaciónActionPerformed(evt);
            }
        });

        ComboOperaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ComboOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Multiplicar fila por escalar", "Intercambiar filas", "Sumar fila con múltiplo de otra fila" }));
        ComboOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboOperacionesActionPerformed(evt);
            }
        });

        labelA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelA.setText("labelA");

        textNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumActionPerformed(evt);
            }
        });

        labelC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelC.setText("labelC");

        labelB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelB.setText("labelB");

        labelD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelD.setText("labelD");

        ComboFilaA.add(filA4);
        filA4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filA4.setText("4");
        filA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filA4ActionPerformed(evt);
            }
        });

        ComboFilaA.add(filA5);
        filA5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filA5.setText("5");
        filA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filA5ActionPerformed(evt);
            }
        });

        ComboFilaA.add(filA1);
        filA1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filA1.setText("1");
        filA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filA1ActionPerformed(evt);
            }
        });

        ComboFilaA.add(filA2);
        filA2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filA2.setText("2");
        filA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filA2ActionPerformed(evt);
            }
        });

        ComboFilaA.add(filA3);
        filA3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filA3.setText("3");
        filA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filA3ActionPerformed(evt);
            }
        });

        ComboFilaB.add(filB4);
        filB4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filB4.setText("4");
        filB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filB4ActionPerformed(evt);
            }
        });

        ComboFilaB.add(filB5);
        filB5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filB5.setText("5");
        filB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filB5ActionPerformed(evt);
            }
        });

        ComboFilaB.add(filB1);
        filB1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filB1.setText("1");
        filB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filB1ActionPerformed(evt);
            }
        });

        ComboFilaB.add(filB2);
        filB2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filB2.setText("2");
        filB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filB2ActionPerformed(evt);
            }
        });

        ComboFilaB.add(filB3);
        filB3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        filB3.setText("3");
        filB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filB3ActionPerformed(evt);
            }
        });

        textDen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        textDen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDenActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        HistorialOperaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HistorialOperaciones.setText("Historial");
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
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelC)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(EjecutarOperación)
                            .addComponent(ComboOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelA)
                                        .addGap(32, 32, 32)
                                        .addComponent(filA1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filA2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filA3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filA4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filA5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelB)
                                        .addGap(32, 32, 32)
                                        .addComponent(filB1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filB2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filB3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(filB4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(filB5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelD))
                            .addComponent(HistorialOperaciones)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addComponent(jLabel6)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(ComboOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(filA1)
                                        .addComponent(filA2)
                                        .addComponent(filA3)
                                        .addComponent(filA4)
                                        .addComponent(filA5)
                                        .addComponent(labelD))
                                    .addComponent(labelA))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(filB1)
                                    .addComponent(filB2)
                                    .addComponent(filB3)
                                    .addComponent(filB4)
                                    .addComponent(filB5)
                                    .addComponent(labelB))
                                .addGap(28, 28, 28)
                                .addComponent(textNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelC))
                        .addGap(1, 1, 1)
                        .addComponent(textDen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(EjecutarOperación)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HistorialOperaciones)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumF1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C2ActionPerformed

    private void DenF1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C2ActionPerformed

    private void NumF1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C4ActionPerformed

    private void DenF1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C4ActionPerformed

    private void NumF1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C3ActionPerformed

    private void DenF1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C3ActionPerformed

    private void NumF1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C5ActionPerformed

    private void DenF1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C5ActionPerformed

    private void NumF2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C2ActionPerformed

    private void DenF2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C2ActionPerformed

    private void NumF2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C1ActionPerformed

    private void DenF2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C1ActionPerformed

    private void NumF2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C3ActionPerformed

    private void DenF2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C3ActionPerformed

    private void NumF2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C4ActionPerformed

    private void DenF2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C4ActionPerformed

    private void NumF2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C5ActionPerformed

    private void DenF2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C5ActionPerformed

    private void NumF3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C1ActionPerformed

    private void DenF3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C1ActionPerformed

    private void NumF3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C2ActionPerformed

    private void DenF3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C2ActionPerformed

    private void NumF3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C3ActionPerformed

    private void DenF3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C3ActionPerformed

    private void NumF3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C4ActionPerformed

    private void DenF3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C4ActionPerformed

    private void NumF3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C5ActionPerformed

    private void DenF3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C5ActionPerformed

    private void NumF4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C1ActionPerformed

    private void DenF4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C1ActionPerformed

    private void NumF4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C2ActionPerformed

    private void DenF4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C2ActionPerformed

    private void NumF4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C3ActionPerformed

    private void DenF4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C3ActionPerformed

    private void NumF4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C4ActionPerformed

    private void DenF4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C4ActionPerformed

    private void NumF4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C5ActionPerformed

    private void DenF4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C5ActionPerformed

    private void NumF5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C3ActionPerformed

    private void DenF5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C3ActionPerformed

    private void NumF5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C4ActionPerformed

    private void DenF5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C4ActionPerformed

    private void NumF5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C5ActionPerformed

    private void DenF5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C5ActionPerformed

    private void NumF5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C1ActionPerformed

    private void DenF5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C1ActionPerformed

    private void NumF5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C2ActionPerformed

    private void DenF5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C2ActionPerformed

    private void DenF1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C1ActionPerformed

    private void NumF1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C1ActionPerformed

    private void EjecutarOperaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarOperaciónActionPerformed
        Fraction elementos[][]= new Fraction[Main.matrizFil][Main.matrizCol];
        Matriz matrizOperacion = new Matriz(elementos);
        
        int numerador, denominador;
        int jContador = 1;
        int j = 0;
        // Recorriendo para comprobar que no hayan 0s en denominador.
        for (int i = 1; i <= Main.matrizFil; i++){
            while (jContador <= Main.matrizCol){
                switch (i) {
                    case 1:
                        {                      
                            if(arrayFila1.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila1.get(j+1).getText()); 
                            
                            if(denominador == 0) {
                                JOptionPane.showMessageDialog(null, "Error: no pueden haber 0's en el denominador.");
                                return;
                            }
                            break;
                        }
                    case 2:
                        {                            
                            if(arrayFila2.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila2.get(j+1).getText());
                            
                            if(denominador == 0) {
                                JOptionPane.showMessageDialog(null, "Error: no pueden haber 0's en el denominador.");
                                return;
                            }
                            break;
                        }
                    case 3:
                        {
                            if(arrayFila3.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila3.get(j+1).getText());
                            
                            if(denominador == 0) {
                                JOptionPane.showMessageDialog(null, "Error: no pueden haber 0's en el denominador.");
                                return;
                            }
                            break;
                        }
                    case 4:
                        {
                            if(arrayFila4.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila4.get(j+1).getText());
                            
                            if(denominador == 0) {
                                JOptionPane.showMessageDialog(null, "Error: no pueden haber 0's en el denominador.");
                                return;
                            }
                            break;
                        }
                    case 5:
                        {
                            if(arrayFila5.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila5.get(j+1).getText());
                            
                            if(denominador == 0) {
                                JOptionPane.showMessageDialog(null, "Error: no pueden haber 0's en el denominador.");
                                return;
                            }
                            break;
                        }
                    default:
                        break;
                }
                j += 2;
                jContador++;
            }
            j = 0;
            jContador = 1;         
        }
        
        // Comprobando que se hayan ingresado los datos para operaciones.
        switch (ComboOperaciones.getSelectedIndex()) {
            case 0:
                if(textNum.getText().length() == 0 || textDen.getText().equals("0")) {
                    JOptionPane.showMessageDialog(null, "Error: debe ingresar un escalar válido.");
                    return;
                }
                break;
            case 2:
                if(textNum.getText().length() == 0 || textDen.getText().equals("0")) {
                    JOptionPane.showMessageDialog(null, "Error: debe ingresar un múltiplo válido.");
                    return;
                }
                break;
            default:
                break;
        }
        
        // Recorrido para crear matriz.
        jContador = 1;
        j = 0;
        
        //Matriz matrizA = new Matriz(elementos);
        for (int i = 1; i <= Main.matrizFil; i++){
            while (jContador <= Main.matrizCol){
                switch (i) {
                    case 1:
                        {
                            Fraction fraccion = new Fraction();
                            if(arrayFila1.get(j).getText().isEmpty()) numerador = 1;
                            else numerador = Integer.parseInt(arrayFila1.get(j).getText());
                            
                            if(arrayFila1.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila1.get(j+1).getText()); 
                            
                            fraccion.setValue(numerador, denominador);
                            matrizOperacion.setElemento(i - 1, jContador - 1, fraccion);
                            break;
                        }
                    case 2:
                        {
                            Fraction fraccion = new Fraction();
                            if(arrayFila2.get(j).getText().isEmpty()) numerador = 1;
                            else numerador = Integer.parseInt(arrayFila2.get(j).getText());
                            
                            if(arrayFila2.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila2.get(j+1).getText());
                            
                            fraccion.setValue(numerador, denominador);
                            matrizOperacion.setElemento(i - 1, jContador - 1, fraccion);
                            break;
                        }
                    case 3:
                        {
                            Fraction fraccion = new Fraction();
                            if(arrayFila3.get(j).getText().isEmpty()) numerador = 1;
                            else numerador = Integer.parseInt(arrayFila3.get(j).getText());
                            
                            if(arrayFila3.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila3.get(j+1).getText());
                            
                            fraccion.setValue(numerador, denominador);
                            matrizOperacion.setElemento(i - 1, jContador - 1, fraccion);
                            break;
                        }
                    case 4:
                        {
                            Fraction fraccion = new Fraction();
                            if(arrayFila4.get(j).getText().isEmpty()) numerador = 1;
                            else numerador = Integer.parseInt(arrayFila4.get(j).getText());
                            
                            if(arrayFila4.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila4.get(j+1).getText());
                            
                            fraccion.setValue(numerador, denominador);
                            matrizOperacion.setElemento(i - 1, jContador - 1, fraccion);
                            break;
                        }
                    case 5:
                        {
                            Fraction fraccion = new Fraction();
                            if(arrayFila5.get(j).getText().isEmpty()) numerador = 1;
                            else numerador = Integer.parseInt(arrayFila5.get(j).getText());
                            
                            if(arrayFila5.get(j+1).getText().isEmpty()) denominador = 1;
                            else denominador = Integer.parseInt(arrayFila5.get(j+1).getText());
                            
                            fraccion.setValue(numerador, denominador);
                            matrizOperacion.setElemento(i - 1, jContador - 1, fraccion);
                            break;
                        }
                    default:
                        break;
                }
                j += 2;
                jContador++;
            }
            j = 0;
            jContador = 1;         
        }
        
        Main.arrayOperaciones.add(matrizOperacion); // Agrega primer matriz a arrayOperaciones.
        //System.out.println("Soy la matriz A:");
        //matrizOperacion.imprime();
        
        
        
        // Realizando operación seleccionada.
        Matriz matrizOperacion2 = new Matriz(elementos);
        switch (ComboOperaciones.getSelectedIndex()) {
            case 0:       
                
                int fila = Integer.parseInt(ComboFilaA.getSelection().getActionCommand());
                Fraction escalar = new Fraction();
                numerador = Integer.parseInt(textNum.getText());
                if (textDen.getText().isEmpty()) denominador = 1;
                else denominador = Integer.parseInt(textDen.getText());
                System.out.println(textDen.getText());
                escalar.setValue(numerador, denominador);
                
                // Crea objeto de OperacionesElementales para aplicar operación.
                OperacionesElementales OperacionElementalA = new OperacionesElementales(Main.arrayOperaciones.get(Main.arrayOperaciones.size() - 1));
                
                OperacionElementalA.MultiplicarFilaPorEscalar(fila, escalar); // Realiza operación.
                matrizOperacion2 = OperacionElementalA.getMatrizA(); // Actualiza matrizA.
                Main.arrayOperaciones.add(matrizOperacion2); // Agrega matriz modificada.               
                Main.arrayOperacionesString.add("f" + ComboFilaA.getSelection().getActionCommand() + " * " + Integer.toString(numerador) + "/" + Integer.toString(denominador)); // Agrega indicación de operación.
                break;
            case 1:
                //Matriz matrizOperacion2 = new Matriz(elementos);
                Fraction fraccion = new Fraction();
                int fila1 = Integer.parseInt(ComboFilaA.getSelection().getActionCommand());
                int fila2 = Integer.parseInt(ComboFilaB.getSelection().getActionCommand());
                
                // Crea objeto de OperacionesElementales para aplicar operación.
                OperacionesElementales OperacionElementalB = new OperacionesElementales(Main.arrayOperaciones.get(Main.arrayOperaciones.size() - 1));
                
                OperacionElementalB.IntercabiarFilas(fila1, fila2); // Realiza operación.
                matrizOperacion2 = OperacionElementalB.getMatrizA(); // Actualiza matrizA.
                Main.arrayOperaciones.add(matrizOperacion2); // Agrega matriz modificada.
                Main.arrayOperacionesString.add("f" + ComboFilaA.getSelection().getActionCommand() + " <-> " + "f" + ComboFilaB.getSelection().getActionCommand()); // Agrega indicación de operación.
                break;
            case 2:
                int numeroFila1 = Integer.parseInt(ComboFilaA.getSelection().getActionCommand());
                int numeroFila2 = Integer.parseInt(ComboFilaB.getSelection().getActionCommand());
                
                Fraction multiplo = new Fraction();
                numerador = Integer.parseInt(textNum.getText());
                if (textDen.getText().isEmpty()) denominador = 1;
                else denominador = Integer.parseInt(textDen.getText());
                System.out.println(textDen.getText());
                multiplo.setValue(numerador, denominador);
                
                // Crea objeto de OperacionesElementales para aplicar operación.
                OperacionesElementales OperacionElementalC = new OperacionesElementales(Main.arrayOperaciones.get(Main.arrayOperaciones.size() - 1));
                
                OperacionElementalC.SumaFilaMultiplo(numeroFila1, numeroFila2, multiplo); // Realiza operación.
                matrizOperacion2 = OperacionElementalC.getMatrizA(); // Actualiza matrizA.
                Main.arrayOperaciones.add(matrizOperacion2); // Agrega matriz modificada.
                Main.arrayOperacionesString.add("f" + ComboFilaA.getSelection().getActionCommand() + " + " + Integer.toString(numerador) + "/" + Integer.toString(denominador) + " * " + "f" + ComboFilaB.getSelection().getActionCommand()); // Agrega indicación de operación.
                break;
            default:
                break;
        }
        
        //Recorre matriz para actualizar interfaz.
        jContador = 1;
        j = 0;
        for (int i = 1; i <= Main.matrizFil; i++){
            while (jContador <= Main.matrizCol){
                switch (i) {
                    case 1:
                        {
                            numerador = matrizOperacion.getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = matrizOperacion.getElemento(i - 1, jContador - 1).getDenominator();
                            
                            arrayFila1.get(j).setText(Integer.toString(numerador));
                            if(denominador == 1) arrayFila1.get(j+1).setText("");
                            else arrayFila1.get(j+1).setText(Integer.toString(denominador));                            
                            break;
                        }
                    case 2:
                        {
                            numerador = matrizOperacion.getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = matrizOperacion.getElemento(i - 1, jContador - 1).getDenominator();
                            
                            arrayFila2.get(j).setText(Integer.toString(numerador));
                            if(denominador == 1) arrayFila2.get(j+1).setText("");
                            else arrayFila2.get(j+1).setText(Integer.toString(denominador));
                            break;
                        }
                    case 3:
                        {
                            numerador = matrizOperacion.getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = matrizOperacion.getElemento(i - 1, jContador - 1).getDenominator();
                            
                            arrayFila3.get(j).setText(Integer.toString(numerador));
                            if(denominador == 1) arrayFila3.get(j+1).setText("");
                            else arrayFila3.get(j+1).setText(Integer.toString(denominador));
                            break;
                        }
                    case 4:
                        {
                            numerador = matrizOperacion.getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = matrizOperacion.getElemento(i - 1, jContador - 1).getDenominator();
                            
                            arrayFila4.get(j).setText(Integer.toString(numerador));
                            if(denominador == 1) arrayFila4.get(j+1).setText("");
                            else arrayFila4.get(j+1).setText(Integer.toString(denominador));
                            break;
                        }
                    case 5:
                        {
                            numerador = matrizOperacion.getElemento(i - 1, jContador - 1).getNumerator();
                            denominador = matrizOperacion.getElemento(i - 1, jContador - 1).getDenominator();
                            
                            arrayFila5.get(j).setText(Integer.toString(numerador));
                            if(denominador == 1) arrayFila5.get(j+1).setText("");
                            else arrayFila5.get(j+1).setText(Integer.toString(denominador));
                            break;
                        }
                    default:
                        break;
                }
                j += 2;
                jContador++;
            }
            j = 0;
            jContador = 1;         
        }
    }//GEN-LAST:event_EjecutarOperaciónActionPerformed

    private void ComboOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboOperacionesActionPerformed
        //short filaSeleccionada = Short.parseShort(ComboFila.getSelection().getActionCommand());
        switch (ComboOperaciones.getSelectedIndex()) {
            case 0:
                labelA.setVisible(true);
                labelB.setVisible(false);
                labelC.setVisible(true);
                labelD.setVisible(false);
                textNum.setVisible(true);
                filB1.setVisible(false);
                filB2.setVisible(false);
                filB3.setVisible(false);
                filB4.setVisible(false);
                filB5.setVisible(false);
                textNum.setVisible(true);
                textDen.setVisible(true);
                jSeparator1.setVisible(true);
                labelA.setText("Fila:");
                labelC.setText("Escalar:");

                // Activando y desactivando radiobutton de filas.
                switch (Main.matrizFil - 1) {
                    case 0:                
                        filA1.setVisible(true);
                        filA2.setVisible(false);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        break;
                    case 1:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        break;
                    case 2:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        break;
                    case 3:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(false);
                        break;
                    case 4:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(true);
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                labelA.setVisible(true);
                labelB.setVisible(true);
                labelC.setVisible(false);
                labelD.setVisible(false);
                textNum.setVisible(false);
                textNum.setVisible(false);
                textDen.setVisible(false);
                jSeparator1.setVisible(false);
                labelA.setText("Fila 'a':");
                labelB.setText("Fila 'b':");
                
                // Activando y desactivando radiobutton de filas.
                switch (Main.matrizFil - 1) {
                    case 0:                
                        filA1.setVisible(true);
                        filA2.setVisible(false);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(false);
                        filB3.setVisible(false);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 1:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(false);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 2:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 3:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(true);
                        filB5.setVisible(false);
                        break;
                    case 4:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(true);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(true);
                        filB5.setVisible(true);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                labelA.setVisible(true);
                labelB.setVisible(true);
                labelC.setVisible(true);
                labelD.setVisible(true);
                textNum.setVisible(false);
                textNum.setVisible(true);
                textDen.setVisible(true);
                jSeparator1.setVisible(true);
                labelA.setText("Fila 'a':");
                labelB.setText("Fila 'b':");
                labelC.setText("Múltiplo:");
                labelD.setText("(Fila destino)");
                
                // Activando y desactivando radiobutton de filas.
                switch (Main.matrizFil - 1) {
                    case 0:                
                        filA1.setVisible(true);
                        filA2.setVisible(false);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(false);
                        filB3.setVisible(false);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 1:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(false);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(false);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 2:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(false);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(false);
                        filB5.setVisible(false);
                        break;
                    case 3:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(false);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(true);
                        filB5.setVisible(false);
                        break;
                    case 4:
                        filA1.setVisible(true);
                        filA2.setVisible(true);
                        filA3.setVisible(true);
                        filA4.setVisible(true);
                        filA5.setVisible(true);
                        filB1.setVisible(true);
                        filB2.setVisible(true);
                        filB3.setVisible(true);
                        filB4.setVisible(true);
                        filB5.setVisible(true);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_ComboOperacionesActionPerformed

    private void textNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumActionPerformed

    private void filA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filA4ActionPerformed
        filA4.setActionCommand("4");
    }//GEN-LAST:event_filA4ActionPerformed

    private void filA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filA5ActionPerformed
        filA5.setActionCommand("5");
    }//GEN-LAST:event_filA5ActionPerformed

    private void filA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filA1ActionPerformed
        filA1.setActionCommand("1");
    }//GEN-LAST:event_filA1ActionPerformed

    private void filA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filA2ActionPerformed
        filA2.setActionCommand("2");
    }//GEN-LAST:event_filA2ActionPerformed

    private void filA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filA3ActionPerformed
        filA3.setActionCommand("3");
    }//GEN-LAST:event_filA3ActionPerformed

    private void filB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filB4ActionPerformed
        filB4.setActionCommand("4");
    }//GEN-LAST:event_filB4ActionPerformed

    private void filB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filB5ActionPerformed
        filB5.setActionCommand("5");
    }//GEN-LAST:event_filB5ActionPerformed

    private void filB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filB1ActionPerformed
        filB1.setActionCommand("1");
    }//GEN-LAST:event_filB1ActionPerformed

    private void filB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filB2ActionPerformed
        filB2.setActionCommand("2");
    }//GEN-LAST:event_filB2ActionPerformed

    private void filB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filB3ActionPerformed
        filB3.setActionCommand("3");
    }//GEN-LAST:event_filB3ActionPerformed

    private void textDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDenActionPerformed

    private void HistorialOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialOperacionesActionPerformed
         // Inicia VentanaHistorialOperaciones.
        VentanaHistorialOperaciones VentanaHistorialOperaciones_ = new VentanaHistorialOperaciones();
        VentanaHistorialOperaciones_.setVisible(true);
        VentanaHistorialOperaciones_.setResizable(false); // Tamaño de ventana no variable.
        VentanaHistorialOperaciones_.setLocationRelativeTo(null); // Centra ventana.
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
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOperaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ComboFilaA;
    private javax.swing.ButtonGroup ComboFilaB;
    private javax.swing.JComboBox<String> ComboOperaciones;
    private javax.swing.JTextField DenF1C1;
    private javax.swing.JTextField DenF1C2;
    private javax.swing.JTextField DenF1C3;
    private javax.swing.JTextField DenF1C4;
    private javax.swing.JTextField DenF1C5;
    private javax.swing.JTextField DenF2C1;
    private javax.swing.JTextField DenF2C2;
    private javax.swing.JTextField DenF2C3;
    private javax.swing.JTextField DenF2C4;
    private javax.swing.JTextField DenF2C5;
    private javax.swing.JTextField DenF3C1;
    private javax.swing.JTextField DenF3C2;
    private javax.swing.JTextField DenF3C3;
    private javax.swing.JTextField DenF3C4;
    private javax.swing.JTextField DenF3C5;
    private javax.swing.JTextField DenF4C1;
    private javax.swing.JTextField DenF4C2;
    private javax.swing.JTextField DenF4C3;
    private javax.swing.JTextField DenF4C4;
    private javax.swing.JTextField DenF4C5;
    private javax.swing.JTextField DenF5C1;
    private javax.swing.JTextField DenF5C2;
    private javax.swing.JTextField DenF5C3;
    private javax.swing.JTextField DenF5C4;
    private javax.swing.JTextField DenF5C5;
    private javax.swing.JButton EjecutarOperación;
    private javax.swing.JButton HistorialOperaciones;
    private javax.swing.JLabel LabelCol1;
    private javax.swing.JLabel LabelCol2;
    private javax.swing.JLabel LabelCol3;
    private javax.swing.JLabel LabelCol4;
    private javax.swing.JLabel LabelCol5;
    private javax.swing.JLabel LabelFil1;
    private javax.swing.JLabel LabelFil2;
    private javax.swing.JLabel LabelFil3;
    private javax.swing.JLabel LabelFil4;
    private javax.swing.JLabel LabelFil5;
    private javax.swing.JTextField NumF1C1;
    private javax.swing.JTextField NumF1C2;
    private javax.swing.JTextField NumF1C3;
    private javax.swing.JTextField NumF1C4;
    private javax.swing.JTextField NumF1C5;
    private javax.swing.JTextField NumF2C1;
    private javax.swing.JTextField NumF2C2;
    private javax.swing.JTextField NumF2C3;
    private javax.swing.JTextField NumF2C4;
    private javax.swing.JTextField NumF2C5;
    private javax.swing.JTextField NumF3C1;
    private javax.swing.JTextField NumF3C2;
    private javax.swing.JTextField NumF3C3;
    private javax.swing.JTextField NumF3C4;
    private javax.swing.JTextField NumF3C5;
    private javax.swing.JTextField NumF4C1;
    private javax.swing.JTextField NumF4C2;
    private javax.swing.JTextField NumF4C3;
    private javax.swing.JTextField NumF4C4;
    private javax.swing.JTextField NumF4C5;
    private javax.swing.JTextField NumF5C1;
    private javax.swing.JTextField NumF5C2;
    private javax.swing.JTextField NumF5C3;
    private javax.swing.JTextField NumF5C4;
    private javax.swing.JTextField NumF5C5;
    private javax.swing.JSeparator SepF1C1;
    private javax.swing.JSeparator SepF1C2;
    private javax.swing.JSeparator SepF1C3;
    private javax.swing.JSeparator SepF1C4;
    private javax.swing.JSeparator SepF1C5;
    private javax.swing.JSeparator SepF2C1;
    private javax.swing.JSeparator SepF2C2;
    private javax.swing.JSeparator SepF2C3;
    private javax.swing.JSeparator SepF2C4;
    private javax.swing.JSeparator SepF2C5;
    private javax.swing.JSeparator SepF3C1;
    private javax.swing.JSeparator SepF3C2;
    private javax.swing.JSeparator SepF3C3;
    private javax.swing.JSeparator SepF3C4;
    private javax.swing.JSeparator SepF3C5;
    private javax.swing.JSeparator SepF4C1;
    private javax.swing.JSeparator SepF4C2;
    private javax.swing.JSeparator SepF4C3;
    private javax.swing.JSeparator SepF4C4;
    private javax.swing.JSeparator SepF4C5;
    private javax.swing.JSeparator SepF5C1;
    private javax.swing.JSeparator SepF5C2;
    private javax.swing.JSeparator SepF5C3;
    private javax.swing.JSeparator SepF5C4;
    private javax.swing.JSeparator SepF5C5;
    private javax.swing.JRadioButton filA1;
    private javax.swing.JRadioButton filA2;
    private javax.swing.JRadioButton filA3;
    private javax.swing.JRadioButton filA4;
    private javax.swing.JRadioButton filA5;
    private javax.swing.JRadioButton filB1;
    private javax.swing.JRadioButton filB2;
    private javax.swing.JRadioButton filB3;
    private javax.swing.JRadioButton filB4;
    private javax.swing.JRadioButton filB5;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JPanel panel0;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel12;
    private javax.swing.JPanel panel13;
    private javax.swing.JPanel panel14;
    private javax.swing.JPanel panel15;
    private javax.swing.JPanel panel16;
    private javax.swing.JPanel panel17;
    private javax.swing.JPanel panel18;
    private javax.swing.JPanel panel19;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel20;
    private javax.swing.JPanel panel21;
    private javax.swing.JPanel panel22;
    private javax.swing.JPanel panel23;
    private javax.swing.JPanel panel24;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel7;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JTextField textDen;
    private javax.swing.JTextField textNum;
    // End of variables declaration//GEN-END:variables
}
