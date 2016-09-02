package br.ufjf.lab3;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Janela extends JFrame {
    
    public Janela() throws HeadlessException {
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
