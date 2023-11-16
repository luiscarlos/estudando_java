package estudando_java;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		
		
		System.out.println("==============================");
		//Vai truncar o valor para baixo
		double largura = 102.97;
		
		int tamanho = (int) largura;
		
		System.out.println(tamanho);
		
		System.out.println("==============================");
		//Vai truncar o valor para baixo
		double valor1 = 9300000035D;
		
		int valor2 = (int) valor1;
		
		System.out.println(valor2);
	}

}
