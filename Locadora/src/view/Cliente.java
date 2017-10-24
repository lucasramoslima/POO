package view;

public class Cliente {
	public static void main(String[] args) {
		
		JanelaAbstrata janela = new JanelaLogin(new JanelaWindows());
		
		janela.desenhar();
	}
}
