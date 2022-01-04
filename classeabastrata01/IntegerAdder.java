package attsomaabstrata;
public class IntegerAdder extends Adder<Integer> {

    public Integer grabInput() {
        return scanner.nextInt();
    }

    @Override
    public void add() {
        this.sum = this.left + this.right;
    }

    @Override
    public void result() {
        System.out.printf("%d + %d = %d", left, right, sum);
    }

    public static void main(String[] args) {
        IntegerAdder adder = new IntegerAdder();
        adder.input();
        adder.add();
        adder.result();
    }
}
