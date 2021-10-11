
public class TestaCondicional2 {

	
	public static void main(String[] args) {
		System.out.println("Testando Condicionais");
		int idade = 20;
		int quantidadePessoas=3;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor de acompanhado =" + acompanhado);
		if (idade >= 18 && acompanhado) {

			System.out.println("Seja bem vindo");
			
		}else {
			if (quantidadePessoas >=2) {
				System.out.println("Voce nao tem 18, mas pode entrar, "
						+ "pois esta acompanhado");
			}else {
				System.out.println("Infelizmente voce nao pode entrar");
			}
			
		}
		
	}
}
