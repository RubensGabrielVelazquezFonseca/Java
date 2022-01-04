package attsomaabstrata;

import java.util.Scanner;

public abstract class Adder<T extends Number> {
    protected T left, right, sum;
    protected Scanner scanner;

    public Adder() {
        this.scanner = new Scanner(System.in);
    }

    public void input() {
        System.out.print("Entre com dois valores: ");
        this.left = this.grabInput();
        this.right = this.grabInput();
    }

    public abstract void add();

    public abstract void result();

    protected abstract T grabInput();
}
