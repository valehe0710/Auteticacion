package Autenticacio;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class EjemploComboBox extends JPanel{
	public EjemploComboBox(){
		String [] frutaStrings = {"Manzana", "Naranja","Pera", "Uva"};
		
		JComboBox<String> listaFrutasBox = new JComboBox<String>(frutaStrings);
		listaFrutasBox.setSelectedIndex(0);
		add(listaFrutasBox);
		
	}
}
