package estudando_java;

public class SequenciasDeScape {
	
	public static void main(String[] args) {
		System.out.println("ola!");
		System.out.println("ola! \"mundo\"");  //imprime ""
		System.out.println("ola! \"mundo\"  \"mundo\"");// imprime dois nomes com ""
		System.out.println("ola! \"mundo\"  \\mundo\\");// imprimi contra barra
		System.out.println("ola! \"mundo\"  \n mundo");// imprimi com quebra de linha
	}

}
