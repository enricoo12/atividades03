public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private Double saldo= 0.0;

    public ContaBancaria(int numeroConta, String titular, Double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public int getNumeroConta(){  
      return numeroConta;
    }
    public void  setNumeroConta(int numeroConta){
        this.numeroConta= numeroConta;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
         this.titular= titular;
    }    
     public Double getSaldo(){
    return saldo; 
}
public void depositar(double valor){
if (valor < 0 ){
    System.out.println("nao pode depositar numero negativo!");
} else {
  saldo += valor;
}
}
public boolean sacar(double valor) {
    if (valor > saldo) { // Corrigida a lógica
        System.out.println("Não pode sacar um valor maior que o saldo!");
        return false;
    } else {
        saldo -= valor;
        return true;
    }
 }  
}