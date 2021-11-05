public class Main {
    
    
    public static void main(String[] args) {
        

         
        Playlist Lis = new Playlist();
        
        Integer minutos = 12;
        
        
        
        
  Lis.setNome("Java");  
  Lis.setTopico("Programacao OO");
  Lis.setPublico(true);
  
  
        System.out.println(Lis);
        
    Viideo video1 = new Viideo(
			"Aula 01 - introdução conceitos OO", // titulo
			"https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=1&t=1900s", // url
			32 // minutos
        
        
          
        
        );
    
    
        Viideo video2 = new Viideo(
			"Aula 02 - O que é um objeto", // titulo
			"https://www.youtube.com/watch?v=aR7CKNFECx0&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=3", // url
			30 // minutos
        
        
        
        );
       
        
        
            Viideo video3 = new Viideo(
			"Aula 03 - Visibilidade de um objeto", // titulo
			"https://www.youtube.com/watch?v=jFI-qqitzwk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=6", // url
			18 // minutos
        
        
        
        );
        
        
        System.out.println(video1);
        System.out.println(video2);
        System.out.println(video3);

          
     
        
        
        
        
    }
    
}
