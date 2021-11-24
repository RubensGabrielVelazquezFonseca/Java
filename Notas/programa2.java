package dp1;

import java.util.ArrayList;
import java.util.List;

/*Programa 2:
Conceito médio: Agora, vamos calcular o conceito médio considerando a seguinte relação entre conceito e valor:
A= 10
B= 7.5
C=6
D=4
Adicionar os seguintes conceitos para o aluno: A, B, D, D, A
Faça no código um método que calcula a média final fornecidos os conceitos acima. Obs: cada conceito é convertido em uma nota, e depois calculamos a média. A média final (número) é convertida para um conceito.
Exibir a informação para o usuário.*/



public class Programador2 {

    public static void main(String[] args) {
    	
    	
        Conceito a1 = new Conceito("A");
        Conceito b1 = new Conceito("B");
        Conceito c1 = new Conceito("C");
        Conceito d1 = new Conceito("D");
        
       
        
        System.out.println("Valor de a1: " + 
                a1.letra + " == " + a1.getNota());
        
        System.out.println("Valor de b1: " + 
                b1.letra + " == " + b1.getNota());
        
         System.out.println("Valor de c1: " + 
                c1.letra + " == " + c1.getNota());
        
          System.out.println("Valor de d1: " + 
                d1.letra + " == " + d1.getNota());
        
        
                      
          List<Double> notas = new ArrayList<>();
        
      notas.add(10d);
      notas.add(7.5d);
      notas.add(4d);
      notas.add(4d);
      notas.add(10d); 
        
     double soma = 0d;
   		
   		for(Double var: notas) {
   			soma = var + soma;
   			System.out.println(soma);
   		}
   		System.out.println("Media: " + soma/notas.size());
   		
   		
   	 if( (soma/notas.size() < 4)){
         System.out.println("Nota D");
     }
        else if(soma/notas.size() < 6){
         System.out.println("Nota C");
     }
        else if(soma/notas.size() < 7.5){
         System.out.println("Nota B");
     }
        else if(soma/notas.size() <= 10){
         System.out.println("Nota A");
     }
   		
   		
   		
   		
}
    } 
        
