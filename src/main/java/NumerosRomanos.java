public enum NumerosRomanos {

    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int valor;

    NumerosRomanos(int num){
        this.valor=num;
    }

    public int valor(){
        return this.valor;}
}

    
