import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String sexo ;
		int qt_cerveja, qt_refrigerante,qt_espetinho ;
		double vl_cerveja, vl_refrigerante, vl_espetinho,
		vl_ingresso, vl_couvert ;
		
		System.out.println("Sexo: ");
		sexo = sc.next();
		System.out.println("Quantidade de Cervejas: ");
		qt_cerveja = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		qt_refrigerante =sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		qt_espetinho = sc.nextInt();
		
		
		
		
		
		
		System.out.println("Sexo:" +sexo);
		System.out.println("Quantidade de Cervejas: " + qt_cerveja );
		System.out.println("Quantidade de refrigerantes: "+ qt_refrigerante);
		System.out.println("quantidade de espetinhos: "+ qt_espetinho);
		

	}

}
