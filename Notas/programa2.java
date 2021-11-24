/*Programa 2:

Conceito médio: Agora, vamos calcular o conceito médio considerando a seguinte relação entre conceito e valor:
A= 10
B= 7.5
C=6
D=4

Adicionar os seguintes conceitos para o aluno: A, B, D, D, A

Faça no código um método que calcula a média final fornecidos os conceitos acima. Obs: cada conceito é convertido em uma nota, e depois calculamos a média. A média final (número) é convertida para um conceito.
Exibir a informação para o usuário.*/



import java.util.Scanner;

public class Programador2 {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;
        
        for(i = 0; i < 4; i++){
            
            contAluno++;
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();
            
               System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
            nota4 = ent.nextInt();
            
            
            media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            if( (media >= 0) && (media <4) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }
        }       
    }
}
