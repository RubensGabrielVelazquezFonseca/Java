public class Playlist {
	
	// Java
	public String NomePlaylist;
	
	// Programação OO
	public String topico;
	
	// true = eh publico
	// false = eh private (não publico)
	public Boolean Publico;
	
	@Override
	public String toString() {	
		return "Nome: " + this.NomePlaylist +  
				" | Topico: " + this.topico;
	}
	
	
	public Boolean getPublico() {
		return Publico;
	}
	public void setPublico(Boolean Publico) {
		this.Publico = Publico;
	}
	public String getNome() {
		return NomePlaylist;
	}
	public void setNome(String nome) {
		this.NomePlaylist = nome;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
	
	

}
