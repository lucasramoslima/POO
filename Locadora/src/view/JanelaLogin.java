package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaLogin extends JanelaAbstrata{

	public JanelaLogin(JanelaImplementada j) {
		super(j);
	}

	@Override
	public void desenhar() {
		JFrame janela= desenharJanela("Tela login");
		
		JPanel painel= desenharPainel();
		
		painel.add(desenharLabel("Usuário"));
		painel.add(desenharCampo());
		painel.add(desenharBotao("Ok"));
		
		janela.add(painel);
		janela.setVisible(true);
	}
}
