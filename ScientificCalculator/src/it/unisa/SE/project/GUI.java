/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.*;
import java.util.LinkedList;
import javax.swing.*;

/**
 *
 * @author Michela
 */
public class GUI extends javax.swing.JFrame {

    private Model model;
    Calculator calculator;
    private final static int maxValues = 12;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.jTextArea1.setEditable(false);
        model = new Model();
        calculator = Calculator.getCalculator();
        
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
        jTextArea1 = new javax.swing.JTextArea();
        inputField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        swap = new javax.swing.JButton();
        over = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        inputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });
        inputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputFieldKeyPressed(evt);
            }
        });

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        jButton4.setText(":");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        swap.setText("swap");
        swap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapActionPerformed(evt);
            }
        });

        over.setText("over");
        over.setActionCommand("over");
        over.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(swap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(over, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addComponent(jButton2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(swap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(over)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed

    }//GEN-LAST:event_InputActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        String text = inputField.getText();
        try {
            calculator.processInput(text);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "The inserted element is neither a number nor an operation!");
        } catch (ArgumentNotDefinedException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(rootPane, "Arithmetic Error: " + ex.getMessage());
        } catch (stackIsEmptyException ex1) {
            JOptionPane.showMessageDialog(rootPane, "stack is empty: " + ex1.getMessage());
        } catch (notAcceptableValueException ex2) {
            JOptionPane.showMessageDialog(rootPane, "value not acceptable: " + ex2.getMessage());
        } finally {
            printOnTextArea();
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void printOnTextArea() {
        inputField.setText(""); //clean the inputTextField
        int value = 0;
        String str = "";
        if (Model.size() <= maxValues) {
           jTextArea1.setText(model.toString());  
        }
    }
 

    private void jTextArea1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1AncestorAdded

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        String mess = "There aren't two elements to sum them!";
        ComplexNumber res;
        try {
            res = this.calculator.sum();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_sumActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        ComplexNumber res;
        String mess = "There aren't two elements to sub them!";
        try {
            res = this.calculator.sub();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        ComplexNumber res;
        String mess = "There aren't two elements to mul them!";
        try {
            res = this.calculator.mul();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        ComplexNumber res;
        String mess = "There aren't two elements to divide them!";
        String messDivToZero = "Division not defined";
        try {
            res = this.calculator.div();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(rootPane, messDivToZero);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_divActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        try {
            Model.clearModel();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.jTextArea1.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void swapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapActionPerformed
        String message="There aren't two elements in the stack";
        
        try {
            Model.swap();
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, message);
        }catch(stackIsEmptyException ex1){
            JOptionPane.showMessageDialog(rootPane, ex1.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_swapActionPerformed
/**
     * This method is called when the user insert a number in the text field and press the "enter" key inside the inputtField
     * This is the same of the click on the insert button 
     * @param evt 
     */
    private void inputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFieldKeyPressed
     
         if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            insertButton.doClick(); 
         }
    }//GEN-LAST:event_inputFieldKeyPressed

    private void joverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joverActionPerformed
     
        String mess = "There aren't two elemento for pushes a copy of the second last element on the stack!";
      
        try {
           Model.over();
        }catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        } catch(stackIsEmptyException ex1){
            JOptionPane.showMessageDialog(rootPane, ex1.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_joverActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton over;
    private javax.swing.JButton swap;
    // End of variables declaration//GEN-END:variables
}
