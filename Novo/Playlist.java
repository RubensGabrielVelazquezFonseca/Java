import java.util.ArrayList;
import java.util.List;

public class Playlist {
	
	public String NomePlaylist;
 public String topico;
	public Boolean Publico;
	
		List<Viideo> video = new ArrayList<>();

	
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
