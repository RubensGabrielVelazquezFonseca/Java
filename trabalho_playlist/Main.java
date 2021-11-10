public class Main {
    
    
    public static void main(String[] args) {
       public class Main {

	public static void main(String[] args) {

		Playlist listaJava = new Playlist();

		listaJava.setNome("Java");
		listaJava.setTopico("Programacao OO");
		listaJava.setPublico(true);
		

		System.out.println(listaJava);


	listaJava.video.add(new Viideo("\n Aula 01 - introdução conceitos OO ","  https://www.youtube.com/watch?v=KlIL63MeyMY&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=1&t=1900s", 32));
	listaJava.video.add(new Viideo("\n Aula 02 - O que é um objeto", "https://www.youtube.com/watch?v=aR7CKNFECx0&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=3 ", 30));
	listaJava.video.add(new Viideo("\n Aula 03 - Visibilidade de um objeto "," https://www.youtube.com/watch?v=jFI-qqitzwk&list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY&index=6 ", 18));

		System.out.println(listaJava.video);
		
		

	 Playlist listaMatematica = new Playlist();

	 listaMatematica.setNome("Matematica");
	 listaMatematica.setTopico("Matematica Basica");
	 listaMatematica.setPublico(true);
			
			System.out.println(listaMatematica);
			
		listaMatematica.video.add(new Viideo("\n Aula 01 - Adicao ", "https://www.youtube.com/watch?v=az6OYFS7AUA&list=PLTPg64KdGgYgFpOFt2TETLdEuBB4fvxxf&index=1&t=4s",9));
	  listaMatematica.video.add(new Viideo("\n Aula 02 - Subtracao", "https://www.youtube.com/watch?v=oSzh7TjIsjs&list=PLTPg64KdGgYgFpOFt2TETLdEuBB4fvxxf&index=2", 6));
	  listaMatematica.video.add(new Viideo("\n Aula 03 - Multiplicacao ","https://www.youtube.com/watch?v=BetgRvNQEC0&list=PLTPg64KdGgYgFpOFt2TETLdEuBB4fvxxf&index=3 ", 19));
		
		
		System.out.println( listaMatematica.video);
		
		
		 Playlist listaPyton= new Playlist();

		 listaPyton.setNome("Matematica");
		 listaPyton.setTopico("Matematica Basica");
		 listaPyton.setPublico(true);
				
				System.out.println( listaPyton);
				
				 listaPyton.video.add(new Viideo("\n Aula 01 - Para que serve o Pyton ", "https://www.youtube.com/watch?v=Mp0vhMDI7fA&list=PLvE-ZAFRgX8hnECDn1v9HNTI71veL3oW0&index=4",21));
				 listaPyton.video.add(new Viideo("\n Aula 02 - Primeros Comandos", "https://www.youtube.com/watch?v=31llNGKWDdo&list=PLvE-ZAFRgX8hnECDn1v9HNTI71veL3oW0&index=6", 27));
				 listaPyton.video.add(new Viideo("\n Aula 03 - Respondendo Usuario ","https://www.youtube.com/watch?v=FNqdV5Zb_5Q&list=PLvE-ZAFRgX8hnECDn1v9HNTI71veL3oW0&index=9&t=189s ", 4));
			
			
			System.out.println( listaPyton.video);


		//System.out.println(video1.getUrl());
	}
	
	
	

	


         
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
