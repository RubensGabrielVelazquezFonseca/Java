public class Viideo {
  private String titulo;
	private String url;
	private Integer minutos;
	
	
	public Viideo(String _titulo, String _url, Integer _minutos) {
		this.titulo = _titulo;
		this.url = _url;
		this.minutos = _minutos;
	}
	// construtor vazio
	public Viideo() {
	}
	
	@Override
	public String toString() {		
 return " Titulo: " + this.titulo + " / url:  " + this.url + " /  Minutos:  " + minutos;

	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getMinutos() {
		return minutos;
	}
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	
	

}
