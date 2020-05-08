import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String sexo;
		int qt_cerveja, qt_refrigerante, qt_espetinho;
		double vl_cerveja = 5.0, vl_refrigerante = 3.0, vl_espetinho = 7.0, vl_ingresso, vl_couvert = 4.0, consumo,
				valoraPagar;

		System.out.println("Sexo: ");
		sexo = sc.next();
		System.out.println("Quantidade de Cervejas: ");
		qt_cerveja = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		qt_refrigerante = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		qt_espetinho = sc.nextInt();
		
		
		if (sexo.equalsIgnoreCase("M")) {
			vl_ingresso = 8.00;
		} else {
			vl_ingresso = 10.00;
		}

		consumo = (qt_cerveja * vl_cerveja) + (qt_refrigerante * vl_refrigerante) + (qt_espetinho * vl_espetinho);

		if (consumo >= 30.0) {
			vl_couvert = 0.0;
			valoraPagar = consumo + vl_couvert + vl_ingresso;

		} else {
			valoraPagar = consumo + vl_couvert + vl_ingresso;
		}

		System.out.println("Sexo:" + sexo);
		System.out.println("Quantidade de Cervejas: " + qt_cerveja);
		System.out.println("Quantidade de refrigerantes: " + qt_refrigerante);
		System.out.println("quantidade de espetinhos: " + qt_espetinho);

		System.out.println("RELATÓRIO:");
		System.out.println("Consumo: " + consumo);
		System.out.println("Couvert: " + vl_couvert);
		System.out.println("Ingresso:" + vl_ingresso);
		System.out.println("Valor a pagar: " + valoraPagar);

	}

}
