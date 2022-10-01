/*
------------------------------------------------
                     Numero
------------------------------------------------
+Numero()
+Numero(valor:int)
+alterarValor(valor:int)
+obterValor():int

-----------------------------------------------

                      A
                      |
                      |
                      |
                      |
                      |

-------------------------------------------------
|                NUmerocomMemoria               |
-------------------------------------------------

-valorAnterior:int

-------------------------------------------------

+NumeroComMemoria(valor:int)
+desfzer()
+obterAnterior():int
+alterarValor(valor:int)

--------------------------------------------------


*/
public Class NumeroComMemoria extends Numero{

    private int _valorAnterior;

    public NumeroComMemoria (int valor){
        super(valor);
        _valorAnterior = valor;
    }

    public void alterarValor(int valor){
        _valorAnterior = obterValor();
        super.alterarValor(valor);
    }
}