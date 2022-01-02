import java.math.BigDecimal;

abstract class Numero {
	protected Double valor;
	public __________ getValor();
}

class Inteiro ________ {
	private Integer classValor;

	public Inteiro(_______ classValor) {
		this.classValor = classValor;
	}

	public _______ getValor() {
		valor = _____________
		return valor;
	}
}

class Decimal extends _______ {
	private BigDecimal classValor;

	public Decimal(_______ classValor) {
		this.classValor = classValor;
	}

	public _______ getValor() {
		valor = classValor.doubleValue();
		return valor;
	}
}

class Flutuante __________ {
	...
}

public class MainSomador {

	public static Double somador(_______ num1, _______ num2) {
		Double soma = num1._______ + num2._______;
		return soma;
	}

	 testando o método
	public static void main(String args[]) {
		________ v1 = new Inteiro(2);
		________ v2 = new Flutuante(4.0f);
		
		Double res1 = somador(v1, v2); 
		System.out.println(Soma =  + res1);  Soma = 6.0
		
		________ v3 = new Decimal(new BigDecimal(5));
		________ v4 = new Inteiro(10);
		
		Double res2 = somador(v3, v4);
		System.out.println(Soma =  + res2);  Soma = 15
	}
}
