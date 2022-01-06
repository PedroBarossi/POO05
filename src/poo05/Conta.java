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
    
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
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
        System.out.println("Conta aberta com sucesso");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(float deposito){
        if (this.status = true) {
            this.setSaldo(getSaldo()+deposito);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar, conta fechada");
        }
    }
    
    public void sacar(float saque){
        if (this.status = true) {
            if (getSaldo()>=saque) {
                this.setSaldo(getSaldo()-saque);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossível sacar, conta fechada");
        }
    }
    
    public void pagarMensal(){
        float mensal = 0;
        if (getTipo().equals("CC")) {
            mensal = 12f;
        } else if (getTipo().equals("CP")) {
            mensal = 20f;
        }
        if (this.status == true) {
            if (this.getSaldo() > mensal) {
                this.setSaldo(getSaldo()-mensal);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
                }
        } else {
            System.out.println("Impossível pagar");
        }
    }
}
