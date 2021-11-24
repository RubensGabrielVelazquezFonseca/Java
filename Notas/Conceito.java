package Dp2;
public class Conceito {
	
	// A, B, C, D
	public String letra; 
	
	public Conceito(String _letra) {
		letra = _letra;
	}
	
	public Double getNota() {
		if (this.letra == "A")
			return 10d; 
		if (this.letra == "B")
			return 8d;
		if (this.letra == "C")
			return 6d;
		return 4d;		
	}

}
