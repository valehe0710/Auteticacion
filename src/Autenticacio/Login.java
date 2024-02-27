package Autenticacio;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel {
    public Login() {
        setLayout(null);
        
        setBackground(Color.PINK);

        JLabel titleLabel = new JLabel("Inicio de Sesion");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        titleLabel.setBounds(150, 90, 300, 50);
        add(titleLabel);

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        usuarioLabel.setBounds(150, 160, 200, 30);
        add(usuarioLabel);

        JTextField usuarioField = new JTextField();
        usuarioField.setFont(new Font("Arial", Font.PLAIN, 15));
        usuarioField.setBounds(150, 190, 200, 30);
        add(usuarioField);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 13));
        passwordLabel.setBounds(150, 240, 200, 30);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setBounds(150, 270, 200, 30);
        add(passwordField);
        
        
        JButton CambiaButton = new JButton("¿Olvistaste tu contraseña?");
        CambiaButton.setFont(new Font("Arial", Font.PLAIN, 10));
        CambiaButton.setBackground(Color.PINK);
      	CambiaButton.setForeground(Color.BLACK);
        CambiaButton.setBorderPainted(false);
        CambiaButton.setBounds(130, 310, 250, 40);
        add(CambiaButton);

        JButton loginButton = new JButton("Iniciar");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 12));
        loginButton.setBounds(255, 360, 100, 40);
        add(loginButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setFont(new Font("Arial", Font.PLAIN, 12));
        cancelButton.setBounds (150, 360, 100, 40);
        add(cancelButton);
	}
}


