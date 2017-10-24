package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public interface JanelaImplementada {

	JFrame desenharJanela(String titulo);

	JButton desenharBotao(String titulo);
	
	JTextField desenharCampo();
	
	JPanel desenharPainel();
	
	JLabel desenharLabel(String titulo) ;

}
