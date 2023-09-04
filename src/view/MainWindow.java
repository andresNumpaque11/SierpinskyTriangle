/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Andres
 */
public class MainWindow extends JFrame {
    
    private JLabel rounds;
    private JTextField txtRounds;
    private JButton btn;
    
    private SierpinskyTriangle sierpinskyTriangle;

    public MainWindow(ActionListener listener){
        initComponents(listener);
        this.setTitle("Sierpinsky Triangle");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        sierpinskyTriangle = new SierpinskyTriangle();
    }

    private void initComponents(ActionListener listener) {
        this.setLayout(new FlowLayout());
        rounds = new JLabel("Ciclos: ");
        add(rounds);
        txtRounds = new JTextField(10);
        add(txtRounds);
        btn = new JButton("Aceptar");
        btn.addActionListener(listener);
        btn.setActionCommand("ok");
        add(btn);
    }
    
    public void openWindowTriangle(boolean  b){
        sierpinskyTriangle.setVisible(b);
    }

    public JTextField getTxtRounds() {
        return txtRounds;
    }

    public SierpinskyTriangle getSierpinskyTriangle() {
        return sierpinskyTriangle;
    }
    
    
    
    
    
    
    
}
