package model;
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        Banco.addConta(this);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("""
                Cliente: %s
                Agencia: %d
                Conta: %d
                Saldo: %.2f
                """, this.cliente.getNome(), this.agencia, this.numero, this.saldo));
    }

    @Override
    public String toString() {
        return (String.format("""
            *--* *--* *--* *--*
            Cliente: %s
            Agencia: %d
            Conta: %d
            """, this.cliente.getNome(), this.agencia, this.numero));
    }
}
