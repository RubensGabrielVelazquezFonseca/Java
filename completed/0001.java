package Completar;
import java.math.BigDecimal;

public abstract class Numero {
	protected Double valor;
	public double getValor;
       
}


-------
  
  package Completar;
class Inteiro extends Numero{
	private Integer classValor;

	public Inteiro(int classValor) { // aq eu coloquei int
		this.classValor = classValor;
	}

  
	public double getValor() { //integer
          int valor = 15;
		return valor;
	}
}


-------
  
  package Completar;

import java.math.BigDecimal;

class Decimal extends Numero {
	private BigDecimal classValor;

	public Decimal(BigDecimal classValor) {
		this.classValor = classValor;
	}

	public double getValor() {
		valor = classValor.doubleValue();
		return valor;
	}
	}



-------
  
  
  
  package Completar;
class Flutuante  extends Numero {
	private Float classValor;

        public Flutuante (float classValor) { // aq eu coloquei float
		this.classValor = classValor;
	}

    public Float getValor() {
        return classValor;
    }

        
        
}



--------------
  
  
  package Completar;

import java.math.BigDecimal;

public class MainSomador {
public static Double somador(Numero num1, Numero num2) {
        Double soma = num1.  valor + num2.valor;
        return soma;
    }

 
public static void main(String args[]) {
        Inteiro v1 = new Inteiro(2);
        Flutuante v2 = new Flutuante(4.0f);
        
        Double res1 = somador(v1, v2); 
        System.out.println("Soma = " + res1); // Soma = 6.0
        
        Decimal v3 = new Decimal(new BigDecimal("5"));
        Inteiro v4 = new Inteiro(10);
        
        Double res2 = somador(v3, v4);
        System.out.println("Soma = " + res2); // Soma = 15
    }
    
}
  
  
