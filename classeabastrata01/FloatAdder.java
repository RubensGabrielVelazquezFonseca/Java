package attsomaabstrata;

public class FloatAdder extends Adder<Float> {

    public Float grabInput() {
        return scanner.nextFloat();
    }

    @Override
    public void add() {
        this.sum = this.left + this.right;
    }

    @Override
    public void result() {
        System.out.printf("%.2f + %.2f = %.2f", left, right, sum);
    }

    public static void main(String[] args) {
        FloatAdder adder = new FloatAdder();
        adder.input();
        adder.add();
        adder.result();
    }
}
