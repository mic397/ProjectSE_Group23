/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.unisa.SE.project;

import ProjectException.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
        setToolTipsForKeyCommand();
        this.textArea.setEditable(false);
        model = new Model();
        calculator = Calculator.getCalculator();
    }

    /**
     * this method generates toolTipCommands, to inform the user that he can use
     * various functions via the keyboard
     */
    public final void setToolTipsForKeyCommand() {
        clearButton.setToolTipText("Delete all elements from the stack (Ctrl+Q)");
        dropButton.setToolTipText("Remove the last inserted element from the stack (Ctrl+D)");
        dupButton.setToolTipText("Duplicate the last inserted element updating the stack (Ctrl+F)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        inputField = new javax.swing.JTextField();
        insertButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        swap = new javax.swing.JButton();
        over = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButtonMin = new javax.swing.JButton();
        jButtonAddVar = new javax.swing.JButton();
        sqrt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dropButton = new javax.swing.JButton();
        dupButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        invertButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        minVarButton = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                textAreaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(textArea);

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

        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        swap.setText("SWAP");
        swap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapActionPerformed(evt);
            }
        });

        over.setText("OVER");
        over.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joverActionPerformed(evt);
            }
        });

        jButton6.setText(">");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveIntoVariableActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButtonMin.setText("<");
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveIntoStackActionPerformed(evt);
            }
        });

        jButtonAddVar.setText("+ var");
        jButtonAddVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddVarActionPerformed(evt);
            }
        });

        sqrt.setText("√");
        sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("PROGRAMMABLE SCIENTIFIC CALCULATOR");

        dropButton.setText("DROP");
        dropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        dupButton.setText("DUP");
        dupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dupButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("STACK OPERATIONS");

        invertButton.setText("+-");
        invertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("VARIABLES");

        minVarButton.setText("- var");
        minVarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minVarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(308, 426, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAddVar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(minVarButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(swap, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(over, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(swap, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(over, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invertButton)
                            .addComponent(sqrt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6)
                                .addComponent(jButtonMin)
                                .addComponent(jButtonAddVar)
                                .addComponent(minVarButton)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
        textArea.setText(model.lastTwelveElements());
    }


    private void textAreaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_textAreaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textAreaAncestorAdded

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        try {
            this.calculator.sum();
        } catch (stackIsEmptyException | UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_sumActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        try {
            this.calculator.sub();
        } catch (stackIsEmptyException | UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_subActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        try {
            this.calculator.mul();
        } catch (stackIsEmptyException | UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_mulActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        try {
            this.calculator.div();
        } catch (stackIsEmptyException | UnderTwoElementsException | ArithmeticException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_divActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        try {
            Model.clearModel();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.textArea.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void swapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapActionPerformed
        String message = "There aren't two elements in the stack";
        try {
            Model.swap();
        } catch (UnderTwoElementsException | stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, message);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_swapActionPerformed
    /**
     * This method is called when the user insert a number in the text field and
     * press the "enter" key inside the inputtField This is the same of the
     * click on the insert button
     *
     * @param evt
     */
    private void inputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputFieldKeyPressed

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            insertButton.doClick();
        }
        if (evt.isControlDown() && evt.getKeyCode() == java.awt.event.KeyEvent.VK_Q) {
            clearButton.doClick();
        }
        if (evt.isControlDown() && evt.getKeyCode() == java.awt.event.KeyEvent.VK_D) {
            dropButton.doClick();
        }
        if (evt.isControlDown() && evt.getKeyCode() == java.awt.event.KeyEvent.VK_F) {
            dupButton.doClick();
        }
    }//GEN-LAST:event_inputFieldKeyPressed

    private void joverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joverActionPerformed

        String mess = "There aren't two elemento for pushes a copy of the second last element on the stack!";

        try {
            Model.over();
        } catch (UnderTwoElementsException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        } catch (stackIsEmptyException ex1) {
            JOptionPane.showMessageDialog(rootPane, ex1.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_joverActionPerformed

    private void saveIntoVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveIntoVariableActionPerformed
        String var = (String) jComboBox2.getSelectedItem();
        try {
            char va1 = var.charAt(0);
            calculator.saveIntoVariable(va1);
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error: There aren't elements in the stack", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveIntoVariableActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String var = (String) jComboBox2.getSelectedItem();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtActionPerformed

        String mess = "There isn't an element on the stack!";
        try {
            this.calculator.sqrt();
        } catch (ArgumentNotDefinedException | stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, mess);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_sqrtActionPerformed

    private void saveIntoStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveIntoStackActionPerformed

        String value = (String) jComboBox2.getSelectedItem();
        char va1 = value.charAt(0);

        try {
            calculator.saveIntoStack(va1);
        } catch (VariableValueException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.printOnTextArea();
    }//GEN-LAST:event_saveIntoStackActionPerformed

    private void jButtonAddVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddVarActionPerformed

        String var = (String) jComboBox2.getSelectedItem();

        try {
            char va1 = var.charAt(0);
            calculator.addToVariable(va1);
        } catch (stackIsEmptyException | VariableValueException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        this.printOnTextArea();
    }//GEN-LAST:event_jButtonAddVarActionPerformed

    private void dropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtonActionPerformed
        try {
            Model.removeFirstComplexNumber();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_dropButtonActionPerformed

    private void dupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dupButtonActionPerformed
        try {
            Model.duplicateFirst();
        } catch (stackIsEmptyException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_dupButtonActionPerformed

    private void invertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertButtonActionPerformed
        try {
            this.calculator.invertSign();
        } catch (stackIsEmptyException | UnderOneElementException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        this.printOnTextArea();
    }//GEN-LAST:event_invertButtonActionPerformed

    private void minVarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minVarButtonActionPerformed
        String var = (String) jComboBox2.getSelectedItem();
        try {
            String messageSuccess = "The value of variable " + var + " is modified: "
                    + var + " = " + var + " - " + "(" + Model.getFirstComplexNumber() + ")";
            char va1 = var.charAt(0);
            calculator.minToVariable(va1);
            JOptionPane.showMessageDialog(this, messageSuccess,
                    "Success Operation: ",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (stackIsEmptyException | VariableValueException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
        this.printOnTextArea();
    }//GEN-LAST:event_minVarButtonActionPerformed

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
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JButton dropButton;
    private javax.swing.JButton dupButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton invertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonAddVar;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minVarButton;
    private javax.swing.JButton over;
    private javax.swing.JButton sqrt;
    private javax.swing.JButton swap;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
