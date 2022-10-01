public class Numero2 {
    private int _valor;
    private static Numero2 _numeros[];

    static {
        _numeros = new Numero2[100];
        for (int i = 0; i < 100; i += 1) {
            _numeros[i] = new Numero2(i);
        }
    }

    private Numero2(int valor) {
        _valor = valor;
    }

    public static Numero2 comValor(int valor) {
        return valor >= 0 && valor <= 99 ? _numeros[valor] : new Numero2(valor);
    }

    public String toString() {
        return "" + _valor;
    }

    public boolean equals(Numero2 n) {
        return _valor == n._valor;
    }

    public Numero2 maior(Numero2 n) {
        return _valor > n._valor ? this : n;
    }

    public static void main(String[] args) {
        Numero2 n1 = new Numero2(1);
        Numero2 n2 = new Numero2(2);
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
        System.out.println("n1.valor() = " + n1 + ", n2.valor() = " + n2);
        System.out.println("n1.equals(n1) = " + n1.equals(n1));
        System.out.println("n1.equals(n2) = " + n1.equals(n2));
        System.out.println("n1.maior(n2) = " + n1.maior(n2));
        System.out.println("n1 == new Numero2(1): " + (n1 == new Numero2(1)));
    }
}