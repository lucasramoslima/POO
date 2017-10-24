package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaWindows implements JanelaImplementada {

	@Override
	public JFrame desenharJanela(String titulo) {
		JFrame janela= new JFrame(titulo+" Windows");
		janela.setSize(500, 400);
		janela.setDefaultCloseOperation(3);
		return janela;
	}

	@Override
	public JButton desenharBotao(String titulo) {
		JButton botao= new JButton(titulo);
		return botao;
	}

	@Override
	public JTextField desenharCampo() {
		JTextField campo= new JTextField(15);
		return campo;
	}

	@Override
	public JPanel desenharPainel() {
		JPanel painel= new JPanel(new FlowLayout());
		return painel;
	}

	@Override
	public JLabel desenharLabel(String titulo) {
		JLabel label= new JLabel(titulo);
		return label;
	}
}
