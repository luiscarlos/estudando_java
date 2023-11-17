package estudando_java;

public class PromocaoAritmetica {

	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		float z = x / (float) y;// Quando faz o cast para float de y , o x e promovido
		System.out.println(z);

		System.out.println("=========================");
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
				float pi = 3.14f;
				
				// raio - informado pelo professor
				float raio = 5.3f;
				
				// area eh igual ao raio ao quadrado multiplicado por Pi
				float area = raio * raio * pi;
				int areaSemCasasDecimais = (int) area;
				
				System.out.println("Resultado: " + area);
				System.out.println("Resultado sem casas decimais: " + areaSemCasasDecimais);
				
		System.out.println("=========================");
		
		// constante do Pi - http://pt.wikipedia.org/wiki/Pi
				float pi1 = 3.14f;
				
				// raio - informado pelo professor
				float raio1 = 5.3f;
				
				// area eh igual ao raio ao quadrado multiplicado por Pi
				float area1 = raio1 * raio1 * pi1;
				
				System.out.println("Resultado: " + area1);
	}

}
