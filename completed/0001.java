import java.math.BigDecimal;

abstract class Number {
protected Double value;
public __________ getValue();
}

class Integer ________ {
private Integer classValue;

public Integer(_______ classValue) {
this.classValor = classValor;
}

public _______ getValue() {
value = _____________
return value;
}
}

class Decimal extends _______ {
private BigDecimal classValue;

public Decimal(_______ classValue) {
this.classValor = classValor;
}

public _______ getValue() {
value = classValue.doubleValue();
return value;
}
}

class Floating __________ {
...
}

public class MainAdder {

public static Double adder(_______ num1, _______ num2) {
Double sum = num1._______ + num2._______;
return sum;
}

// testing the method:
public static void main(String args[]) {
________ v1 = new Integer(2);
________ v2 = new Float(4.0f);

Double res1 = adder(v1, v2);
System.out.println("Sum = " + res1); // Sum = 6.0

________ v3 = new Decimal(new BigDecimal("5"));
________ v4 = new Integer(10);

Double res2 = adder(v3, v4);
System.out.println("Sum = " + res2); // Sum = 15
}

}
