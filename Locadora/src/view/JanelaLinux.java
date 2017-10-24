package view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaLinux implements JanelaImplementada {

	@Override
	public JFrame desenharJanela(String titulo) {
		JFrame janela= new JFrame(titulo+" Linux");
		janela.setSize(500, 400);
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
		label.setForeground(Color.blue);
		return label;
	}

}
