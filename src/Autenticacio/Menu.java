package Autenticacio;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Menu extends JPanel {
    public Menu() {
   	 setLayout(null);
   	 
   	 setBackground(Color.PINK);
   	 
        /*JLabel titulo = new JLabel("Menu");
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
        titulo.setBounds(150, 90, 200, 50);
        add(titulo);*/
        
        JPanel panelCentro = new JPanel();
        SpringLayout springLayout = new SpringLayout();
        panelCentro.setLayout(springLayout);
        panelCentro.setBounds(20, 20, 800, 800);
        panelCentro.setBackground(Color.PINK);
        add(panelCentro);

        JLabel etiqueta = new JLabel("Label:");
        JTextField textField = new JTextField(15);
        panelCentro.add(etiqueta);
        panelCentro.add(textField);

        springLayout.putConstraint(SpringLayout.WEST, etiqueta, 10, SpringLayout.WEST, panelCentro);
        springLayout.putConstraint(SpringLayout.NORTH, etiqueta, 10, SpringLayout.NORTH, panelCentro);
        springLayout.putConstraint(SpringLayout.WEST, textField, 10, SpringLayout.EAST, etiqueta);
        springLayout.putConstraint(SpringLayout.NORTH, textField, 10, SpringLayout.NORTH, panelCentro);
    }
}
