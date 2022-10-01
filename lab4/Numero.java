public class Numero {
    private int _valor;

    public Numero() {
        _valor = 0;
    }

    public Numero(int valor) {
        _valor = valor;
    }

    public int valor() {
        return _valor;
    }

    public String toString() {
        return "" + _valor;
    }

    public boolean equals(Numero n) {
        return _valor == n._valor;
    }

    public Numero maior(Numero n) {
        return _valor > n._valor ? this : n;
    }

    public static void main(String[] args) {
        Numero n1 = new Numero(1);
        Numero n2 = new Numero(2);
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        System.out.println("n1.valor() = " + n1 + ", n2.valor() = " + n2);
        System.out.println("n1.equals(n1) = " + n1.equals(n1));
        System.out.println("n1.equals(n2) = " + n1.equals(n2));
        System.out.println("n1.maior(n2) = " + n1.maior(n2));
    }
}