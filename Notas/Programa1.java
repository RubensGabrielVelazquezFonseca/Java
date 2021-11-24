import java.util.ArrayList;
import java.util.List;

public class Programa1 {
	
	public static void main(String[] args) {
		
		
	float media = (3.3f + 4.2f + 8.1f + 9f + 5.5f ) / 5f;
		System.out.println("Media simples: " + media);
	
	
		List<Double> Notas = new ArrayList<>();
		Notas.add(3d);
		Notas.add(4d);
		Notas.add(8d);
		Notas.add(9d);
                Notas.add(5d);

	
		
		System.out.println(Notas.size());
		
		double soma = 0d;
		
		for(Double var: Notas) {
			soma = var + soma;
			System.out.println(soma);
		}
		System.out.println("Media: " + soma/Notas.size());
		
		
		
		Conceito a1 = new Conceito("A");
		Conceito b1 = new Conceito("B");
		Conceito c1 = new Conceito("C");
		Conceito d1 = new Conceito("D");
		
		// conceitos.add(a1);
		
		System.out.println("Valor de a1: " + 
				a1.letra + " == " + a1.getNota());
		
		System.out.println("Valor de b1: " + 
				b1.letra + " == " + b1.getNota());
		
		
	}

}
