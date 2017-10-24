package view;

import javax.swing.JFrame;

public class JanelaDialogo extends JanelaAbstrata {

	public JanelaDialogo(JanelaImplementada j) {
		super(j);
	}

	@Override
	public void desenhar() {
		JFrame janela = desenharJanela("Janela de Dialogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}

}
