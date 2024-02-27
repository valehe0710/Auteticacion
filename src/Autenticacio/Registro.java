package Autenticacio;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registro extends JPanel{
	public Registro() {
		 setLayout(null);
	        
	        setBackground(Color.PINK);
	        
	        JLabel titulo = new JLabel("Nuevo Usuario");
	        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
	        titulo.setBounds(150, 90, 200, 50);
	        add(titulo);

	        JLabel usuarioLbl = new JLabel("Usuario:");
	        usuarioLbl.setFont(new Font("Arial", Font.PLAIN, 13));
	        usuarioLbl.setBounds(150, 140, 200, 50);
	        add(usuarioLbl);

	        JTextField usuarioTf = new JTextField();
	        usuarioTf.setFont(new Font("Arial", Font.PLAIN, 15));
	        usuarioTf.setBounds(150, 180, 200, 30);
	        add(usuarioTf);

	        JLabel correoLbl = new JLabel("Correo:");
	        correoLbl.setFont(new Font("Arial", Font.PLAIN, 13));
	        correoLbl.setBounds(150, 230, 200, 50);
	        add(correoLbl);

	        JTextField correoTf = new JTextField();
	        correoTf.setFont(new Font("Arial", Font.PLAIN, 15));
	        correoTf.setBounds(150, 270, 200, 30);
	        add(correoTf);

	        JLabel contrasenaLbl = new JLabel("Contraseña:");
	        contrasenaLbl.setFont(new Font("Arial", Font.PLAIN, 13));
	        contrasenaLbl.setBounds(150, 320, 200, 50);
	        add(contrasenaLbl);

	        JPasswordField contrasenaPf = new JPasswordField();
	        contrasenaPf.setFont(new Font("Arial", Font.PLAIN, 15));
	        contrasenaPf.setBounds(150, 360, 200, 30);
	        add(contrasenaPf);

	        JCheckBox cb = new JCheckBox("Acepto términos y condiciones");
	        cb.setBounds(150, 410, 200, 30);
	        cb.setBackground(Color.PINK);
	        add(cb);

	        JButton cancelarBtn = new JButton("Cancelar");
	        cancelarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
	        cancelarBtn.setBorderPainted(false);
	        cancelarBtn.setBounds(150, 460, 90, 40);
	        add(cancelarBtn);

	        JButton aceptarBtn = new JButton("Aceptar");
	        aceptarBtn.setFont(new Font("Arial", Font.PLAIN, 12));
	        aceptarBtn.setBorderPainted(false);
	        aceptarBtn.setBounds(255, 460, 90, 40);
	        add(aceptarBtn);
	}
}