/*Programa 2:
Conceito médio: Agora, vamos calcular o conceito médio considerando a seguinte relação entre conceito e valor:
A= 10
B= 7.5
C=6
D=4
Adicionar os seguintes conceitos para o aluno: A, B, D, D, A
Faça no código um método que calcula a média final fornecidos os conceitos acima. Obs: cada conceito é convertido em uma nota, e depois calculamos a média. A média final (número) é convertida para um conceito.
Exibir a informação para o usuário.*/



package Dp2;
public class programa2 {

    public static void main(String[] args) {
        
         Conceito a1 = new Conceito("A");
        Conceito b1 = new Conceito("B");
        Conceito c1 = new Conceito("C");
        Conceito d1 = new Conceito("D");
        
        // conceitos.add(a1);
        
        System.out.println("Valor de a1: " + 
                a1.letra + " == " + a1.getNota());
        
        System.out.println("Valor de b1: " + 
                b1.letra + " == " + b1.getNota());
        
         System.out.println("Valor de c1: " + 
                c1.letra + " == " + c1.getNota());
        
          System.out.println("Valor de d1: " + 
                d1.letra + " == " + d1.getNota());
        
    }

}
        
        
