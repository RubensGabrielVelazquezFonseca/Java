import java.util.ArrayList;
import java.util.List;

public class programa1 {
    
    public static void main(String[] args) {
     
 //Cálculo da Nota média: faça o código que calcula a nota média de um aluno. 
 //As notas variam de 0 até 10. Construa a classe nota que representa a nota
// (possui um campo double). Para testar, criar uma lista de notas adicionando 
//as seguintes notas: 3.3, 4.2, 8.1, 9, 5.5


float media = (3.3f + 4.2f + 8.1f + 9f + 5.5f ) / 5f;


  System.out.println("Calculo da media: " + media);

	List<Double> notas = new ArrayList<>();
       notas.add(3.3d);
     notas.add(4.2d);
   notas.add(8.1d);
   notas.add(9d);
  notas.add(5.5d); 
  double soma = 0d;
		
		for(Double var: notas) {
			soma = var + soma;
			System.out.println(soma);
		}
		System.out.println("Media: " + soma/notas.size());
        
                

  
  
  
  
  

                }
    
}
