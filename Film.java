public class Filme {
    
 
    String nomeDoFilme;
    String generoDoFilme;
    int anoDeLancamento;
    int classificacao;
    String distribuicao;
    
   
         
 
     
   public void criarFilme(){
    
    nomeDoFilme="Sexta feira 13";
    generoDoFilme="Terror";
    anoDeLancamento=1980;
    classificacao=18;
    distribuicao="Cinema";
    }
    
    
    public void mostrarFilme(){
          System.out.println("nome do filme: " +nomeDoFilme);
         System.out.println("Genero do filme: " +generoDoFilme);
         System.out.println("Ano do filme: " + anoDeLancamento);
         System.out.println("Classicacao do filme: " +classificacao);
         System.out.println("distribuicao do filme: " +distribuicao);

        
        
    }
    
    
    
     public static void main(String[] args) {
     Filme f = new Filme();
     f.criarFilme();
     f.mostrarFilme();
         
         
    }
             
   }
