package Autenticacio;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CambiarPassword extends JPanel {
    public CambiarPassword() {
        setLayout(null);
        
        setBackground(Color.PINK);
        
        JLabel titleLabel = new JLabel("Cambiar Contraseña");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        titleLabel.setBounds(110, 90, 300, 50);
        add(titleLabel);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        usuarioLabel.setBounds(150, 160, 200, 30);
        add(usuarioLabel);

        JTextField usuarioField = new JTextField();
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 15));
        usuarioField.setBounds(150, 190, 200, 30);
        add(usuarioField);

        JLabel oldPasswordLabel = new JLabel("Contraseña Actual:");
        oldPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        oldPasswordLabel.setBounds(150, 240, 200, 30);
        add(oldPasswordLabel);

        JPasswordField oldPasswordField = new JPasswordField();
        oldPasswordField.setFont(new Font("Arial", Font.PLAIN, 15));
        oldPasswordField.setBounds(150, 270, 200, 30);
        add(oldPasswordField);

        JLabel newPasswordLabel = new JLabel("Nueva Contraseña:");
        newPasswordLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        newPasswordLabel.setBounds(150, 320, 200, 30);
        add(newPasswordLabel);

        JPasswordField newPasswordField = new JPasswordField();
        newPasswordField.setFont(new Font("Arial", Font.PLAIN, 15));
        newPasswordField.setBounds(150, 350, 200, 30);
        add(newPasswordField);

        JButton cambiarButton = new JButton("Cambiar");
        cambiarButton.setFont(new Font("Arial", Font.PLAIN, 12));
        cambiarButton.setBounds(255, 420, 100, 40);
        add(cambiarButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 12));
        cancelButton.setBounds(150, 420, 100, 40);
        add(cancelButton);
    }

}
