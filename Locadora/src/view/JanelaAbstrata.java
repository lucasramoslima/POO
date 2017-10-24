package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public abstract class JanelaAbstrata {

	protected JanelaImplementada janela;

	public JanelaAbstrata(JanelaImplementada j) {
		janela = j;
	}

	public JFrame desenharJanela(String titulo) {
		return janela.desenharJanela(titulo);
	}

	public JButton desenharBotao(String titulo) {
		return janela.desenharBotao(titulo);
	}
	
	public JTextField desenharCampo(){
		return janela.desenharCampo();
	}
	
	public JPanel desenharPainel(){
		return janela.desenharPainel();
	}
	
	public JLabel desenharLabel(String titulo){
		return janela.desenharLabel(titulo);
	}

	public abstract void desenhar();

}
