package pokemon;
public class Pokemon implements PokeInterface {
	
	private String tipo;
	
	private int saude;
	private int ataque;
	private int defesa;

	public Pokemon(String tipo, int saude, int ataque, int defesa) {
		this.tipo = tipo;
		this.saude = saude;
		this.ataque = ataque;
		this.defesa = defesa;
	}
	
	@Override
	public void pokeSetup(String nome) {
		
		System.out.println(nome + ": " + 
		                   "\nTipo - " + tipo +
		                   "\nSaúde - " + saude +
		                   "\nAtaque - " + ataque +
		                   "\nDefesa - " + defesa);
	}
}

