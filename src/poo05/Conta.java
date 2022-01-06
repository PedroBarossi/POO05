package poo05;

public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public float getSaldo(){
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
        }
    }
    
    public void depositar(float deposito){
        if (this.status = true) {
            this.setSaldo(getSaldo()+deposito);
        } else {
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(float saque){
        if (this.status = true) {
            if (getSaldo()>0) {
                this.setSaldo(getSaldo()-saque);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar");
        }
    }
    
    public void pagarMensal(){
        float mensalidade = 0;
        if (getTipo().equals("CC")) {
            mensalidade = 12f;
        } else if (getTipo().equals("CP")) {
            mensalidade = 20f;
        }
        if (this.status == true) {
            if (this.getSaldo() > mensalidade) {
                this.setSaldo(getSaldo()-mensalidade);
            } else {
                System.out.println("Saldo insuficiente");
                }
        } else {
            System.out.println("Impossível pagar");
        }
    }
}
