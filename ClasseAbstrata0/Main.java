class Main extends Soma {

    void input() {
        System.out.print("Entre com dois numers: ");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    void add() {
        s = a + b;
    }

    void resultado() {
        System.out.print("Soma dos dois números:" + s);
    }

    public static void main(String args[]) {
        Main st = new Main();
        st.input();
        st.add();
        st.resultado();
    }
}
