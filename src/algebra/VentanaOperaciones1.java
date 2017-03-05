/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algebra;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class VentanaOperaciones1 extends javax.swing.JFrame {
    ArrayList<JTextField> fracciones = new ArrayList<>();
    /**
     * Creates new form VentanaOperaciones
     */
    public VentanaOperaciones1() {
        initComponents();
        fracciones.add(NumF1C1); fracciones.add(DenF1C1);
        fracciones.add(NumF1C2); fracciones.add(DenF1C2);
        fracciones.add(NumF1C3); fracciones.add(DenF1C3);
        fracciones.add(NumF1C4); fracciones.add(DenF1C4);
        fracciones.add(NumF1C5); fracciones.add(DenF1C5);
        fracciones.add(NumF2C1); fracciones.add(DenF2C1);
        fracciones.add(NumF2C2); fracciones.add(DenF2C2);
        fracciones.add(NumF2C3); fracciones.add(DenF2C3);
        fracciones.add(NumF2C4); fracciones.add(DenF2C4);
        fracciones.add(NumF2C5); fracciones.add(DenF2C5);
        fracciones.add(NumF3C1); fracciones.add(DenF3C1);
        fracciones.add(NumF3C2); fracciones.add(DenF3C2);
        fracciones.add(NumF3C3); fracciones.add(DenF3C3);
        fracciones.add(NumF3C4); fracciones.add(DenF3C4);
        fracciones.add(NumF3C5); fracciones.add(DenF3C5);
        fracciones.add(NumF4C1); fracciones.add(DenF4C1);        
        fracciones.add(NumF4C2); fracciones.add(DenF4C2);        
        fracciones.add(NumF4C3); fracciones.add(DenF4C3);        
        fracciones.add(NumF4C4); fracciones.add(DenF4C4);        
        fracciones.add(NumF4C5); fracciones.add(DenF4C5);        
        fracciones.add(NumF5C1); fracciones.add(DenF5C1);        
        fracciones.add(NumF5C2); fracciones.add(DenF5C2);        
        fracciones.add(NumF5C3); fracciones.add(DenF5C3);        
        fracciones.add(NumF5C4); fracciones.add(DenF5C4);        
        fracciones.add(NumF5C5); fracciones.add(DenF5C5);
        
        for (int i = 0; i < fracciones.size(); i++){
            fracciones.get(i).setVisible(false);
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
        
        /*int j = 0;
        switch (Main.matrizCol) {
            case 1: Main.matrizCol = 1;
                i = 9;
                break;
            case 2: Main.matrizCol = 2;
                i = 19;
                break;
            case 3: Main.matrizCol = 3;
                i = 29;
                break;
            case 4: Main.matrizCol = 4;
                i = 39;
                break;
            case 5: Main.matrizCol = 5;
                i = 49;
                break;
        }*/
        
        int p = -2;
        for (int k = 0; k < Main.matrizFil; k++) {
            p += 2;
            for (int j = p; j <= i; j++){
                fracciones.get(j).setVisible(true);
                if((j != 0) & ((j + 1) % 2) == 0) j += 8;
            }
        }
        
        // Vuelve visible columna 1, depende de cantidad de filas.
        /*if (Main.matrizCol == 1){
            switch (Main.matrizFil) {
                case 1: Main.matrizFil = 1;
                    for (int i = 0; i <= 1; i++) {
                        fracciones.get(i).setVisible(true);   
                    }
                    break;
                case 2: Main.matrizFil = 2;
                    for (int i = 0; i <= 11; i++) {
                        fracciones.get(i).setVisible(true);
                        if((i != 0) & ((i + 1) % 2) == 0){
                            i += 8;
                        }           
                    }
                    break;
                case 3: Main.matrizFil = 3;
                    for (int i = 0; i <= 21; i++) {
                        fracciones.get(i).setVisible(true);
                        if((i != 0) & ((i + 1) % 2) == 0){
                            i += 8;
                        }           
                    }
                    break;
                case 4: Main.matrizFil = 4;
                    for (int i = 0; i <= 31; i++) {
                        fracciones.get(i).setVisible(true);
                        if((i != 0) & ((i + 1) % 2) == 0){
                            i += 8;
                        }           
                    }
                    break;
                case 5: Main.matrizFil = 5;
                    for (int i = 0; i <= 41; i++) {
                        fracciones.get(i).setVisible(true);
                        if((i != 0) & ((i + 1) % 2) == 0){
                            i += 8;
                        }           
                    }
                    break;
            }
            
        }*/
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
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        NumF5C3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DenF5C4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NumF3C1 = new javax.swing.JTextField();
        DenF1C5 = new javax.swing.JTextField();
        NumF1C1 = new javax.swing.JTextField();
        DenF5C3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DenF3C5 = new javax.swing.JTextField();
        NumF3C5 = new javax.swing.JTextField();
        DenF2C5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NumF2C2 = new javax.swing.JTextField();
        DenF5C1 = new javax.swing.JTextField();
        NumF5C5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        DenF3C2 = new javax.swing.JTextField();
        NumF5C2 = new javax.swing.JTextField();
        DenF4C1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DenF2C1 = new javax.swing.JTextField();
        DenF3C3 = new javax.swing.JTextField();
        NumF4C5 = new javax.swing.JTextField();
        NumF3C3 = new javax.swing.JTextField();
        DenF3C1 = new javax.swing.JTextField();
        NumF1C5 = new javax.swing.JTextField();
        NumF5C1 = new javax.swing.JTextField();
        NumF4C2 = new javax.swing.JTextField();
        DenF4C4 = new javax.swing.JTextField();
        NumF2C3 = new javax.swing.JTextField();
        DenF4C5 = new javax.swing.JTextField();
        NumF3C2 = new javax.swing.JTextField();
        DenF4C3 = new javax.swing.JTextField();
        DenF2C4 = new javax.swing.JTextField();
        NumF4C1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DenF1C4 = new javax.swing.JTextField();
        NumF2C4 = new javax.swing.JTextField();
        DenF1C3 = new javax.swing.JTextField();
        NumF3C4 = new javax.swing.JTextField();
        DenF2C2 = new javax.swing.JTextField();
        DenF5C2 = new javax.swing.JTextField();
        DenF2C3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NumF4C3 = new javax.swing.JTextField();
        NumF5C4 = new javax.swing.JTextField();
        NumF1C2 = new javax.swing.JTextField();
        DenF3C4 = new javax.swing.JTextField();
        NumF4C4 = new javax.swing.JTextField();
        DenF1C1 = new javax.swing.JTextField();
        DenF1C2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NumF2C1 = new javax.swing.JTextField();
        NumF2C5 = new javax.swing.JTextField();
        NumF1C4 = new javax.swing.JTextField();
        DenF5C5 = new javax.swing.JTextField();
        DenF4C2 = new javax.swing.JTextField();
        NumF1C3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Operaciones Elementales");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NumF5C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel4.setText("4");

        DenF5C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("5");

        NumF3C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C1ActionPerformed(evt);
            }
        });

        DenF1C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C5ActionPerformed(evt);
            }
        });

        NumF1C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C1ActionPerformed(evt);
            }
        });

        DenF5C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel5.setText("5");

        DenF3C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C5ActionPerformed(evt);
            }
        });

        NumF3C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C5ActionPerformed(evt);
            }
        });

        DenF2C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel3.setText("3");

        NumF2C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C2ActionPerformed(evt);
            }
        });

        DenF5C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C1ActionPerformed(evt);
            }
        });

        NumF5C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel10.setText("4");

        DenF3C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C2ActionPerformed(evt);
            }
        });

        NumF5C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C2ActionPerformed(evt);
            }
        });

        DenF4C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel7.setText("1");

        DenF2C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C1ActionPerformed(evt);
            }
        });

        DenF3C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C3ActionPerformed(evt);
            }
        });

        NumF4C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C5ActionPerformed(evt);
            }
        });

        NumF3C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C3ActionPerformed(evt);
            }
        });

        DenF3C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C1ActionPerformed(evt);
            }
        });

        NumF1C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C5ActionPerformed(evt);
            }
        });

        NumF5C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C1ActionPerformed(evt);
            }
        });

        NumF4C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C2ActionPerformed(evt);
            }
        });

        DenF4C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C4ActionPerformed(evt);
            }
        });

        NumF2C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C3ActionPerformed(evt);
            }
        });

        DenF4C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C5ActionPerformed(evt);
            }
        });

        NumF3C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C2ActionPerformed(evt);
            }
        });

        DenF4C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C3ActionPerformed(evt);
            }
        });

        DenF2C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C4ActionPerformed(evt);
            }
        });

        NumF4C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("2");

        DenF1C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C4ActionPerformed(evt);
            }
        });

        NumF2C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C4ActionPerformed(evt);
            }
        });

        DenF1C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C3ActionPerformed(evt);
            }
        });

        NumF3C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF3C4ActionPerformed(evt);
            }
        });

        DenF2C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C2ActionPerformed(evt);
            }
        });

        DenF5C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C2ActionPerformed(evt);
            }
        });

        DenF2C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF2C3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel8.setText("2");

        NumF4C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C3ActionPerformed(evt);
            }
        });

        NumF5C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF5C4ActionPerformed(evt);
            }
        });

        NumF1C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C2ActionPerformed(evt);
            }
        });

        DenF3C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF3C4ActionPerformed(evt);
            }
        });

        NumF4C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF4C4ActionPerformed(evt);
            }
        });

        DenF1C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C1ActionPerformed(evt);
            }
        });

        DenF1C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF1C2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel9.setText("3");

        NumF2C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C1ActionPerformed(evt);
            }
        });

        NumF2C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF2C5ActionPerformed(evt);
            }
        });

        NumF1C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C4ActionPerformed(evt);
            }
        });

        DenF5C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF5C5ActionPerformed(evt);
            }
        });

        DenF4C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DenF4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenF4C2ActionPerformed(evt);
            }
        });

        NumF1C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NumF1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumF1C3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel12.setText("1");

        jLayeredPane1.setLayer(NumF5C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF5C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF3C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF1C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF1C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF5C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF3C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF3C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF2C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF2C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF5C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF5C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF3C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF5C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF4C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF2C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF3C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF4C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF3C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF3C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF1C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF5C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF4C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF4C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF2C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF4C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF3C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF4C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF2C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF4C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF1C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF2C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF1C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF3C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF2C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF5C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF2C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF4C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF5C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF1C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF3C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF4C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF1C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF1C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF2C1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF2C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF1C4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF5C5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(DenF4C2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(NumF1C3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel8)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel9)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel10)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel11))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9)
                        .addComponent(NumF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DenF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NumF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NumF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NumF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DenF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NumF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(DenF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(DenF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(DenF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DenF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel12))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DenF1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(NumF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DenF1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DenF1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DenF1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DenF1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(NumF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(DenF5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 380, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumF1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C3ActionPerformed

    private void DenF4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C2ActionPerformed

    private void DenF5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C5ActionPerformed

    private void NumF1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C4ActionPerformed

    private void NumF2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C5ActionPerformed

    private void NumF2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C1ActionPerformed

    private void DenF1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C2ActionPerformed

    private void DenF1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C1ActionPerformed

    private void NumF4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C4ActionPerformed

    private void DenF3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C4ActionPerformed

    private void NumF1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C2ActionPerformed

    private void NumF5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C4ActionPerformed

    private void NumF4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C3ActionPerformed

    private void DenF2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C3ActionPerformed

    private void DenF5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C2ActionPerformed

    private void DenF2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C2ActionPerformed

    private void NumF3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C4ActionPerformed

    private void DenF1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C3ActionPerformed

    private void NumF2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C4ActionPerformed

    private void DenF1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C4ActionPerformed

    private void NumF4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C1ActionPerformed

    private void DenF2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C4ActionPerformed

    private void DenF4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C3ActionPerformed

    private void NumF3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C2ActionPerformed

    private void DenF4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C5ActionPerformed

    private void NumF2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C3ActionPerformed

    private void DenF4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C4ActionPerformed

    private void NumF4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C2ActionPerformed

    private void NumF5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C1ActionPerformed

    private void NumF1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C5ActionPerformed

    private void DenF3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C1ActionPerformed

    private void NumF3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C3ActionPerformed

    private void NumF4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF4C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF4C5ActionPerformed

    private void DenF3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C3ActionPerformed

    private void DenF2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C1ActionPerformed

    private void DenF4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF4C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF4C1ActionPerformed

    private void NumF5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C2ActionPerformed

    private void DenF3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C2ActionPerformed

    private void NumF5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C5ActionPerformed

    private void DenF5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C1ActionPerformed

    private void NumF2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF2C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF2C2ActionPerformed

    private void DenF2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF2C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF2C5ActionPerformed

    private void NumF3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C5ActionPerformed

    private void DenF3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF3C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF3C5ActionPerformed

    private void DenF5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C3ActionPerformed

    private void NumF1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF1C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF1C1ActionPerformed

    private void DenF1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF1C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF1C5ActionPerformed

    private void NumF3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF3C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF3C1ActionPerformed

    private void DenF5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenF5C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DenF5C4ActionPerformed

    private void NumF5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumF5C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumF5C3ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaOperaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOperaciones1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaOperaciones1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
