package enums;

/**
 * @author Ale Funes
 */
public enum Numero {
    UNO(1),
    DOS(2),
    TRES(3),
    CUATRO(4),
    CINCO(5),
    SEIS(6),
    SIETE(7),
    DIEZ(10),
    ONCE(11),
    DOCE(12);

    private int valor;

    Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
