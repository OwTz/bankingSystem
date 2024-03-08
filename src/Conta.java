import javax.swing.JOptionPane;

public class Conta {
    // * Parametros */
    public String numConta;
    protected String tipoC;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.status = true;
        this.saldo = 0.0f;
        this.setDono(null);
    
    }   
    // *métodos Getter e Setters */

    public String setDono(String n1) {
        n1 = JOptionPane.showInputDialog("digite seu nome: ");
        this.dono = n1 ;
        this.abrirConta();
        return this.dono;
    }

    public String getDono() {
        return this.dono;
    }
 
    public float getSaldo(){
        return this.saldo;
    }

    // * métodos para criação de conta */
    public void abrirConta() {
        if (this.status == false) {

            System.out.println("não é possívei abrir a conta! ");

        } else {

            System.out.println(" a conta está a ser criada");
            this.tipoC = JOptionPane.showInputDialog("digite o tipo de conta que você quer criar");
            System.out.printf("o tipo de conta foi %s " ,this.tipoC);

            switch (this.tipoC) {
                case "cc":
                    this.saldo += 50.0f;
                    break;
                case "cp":
                    this.saldo += 150.0f;
                    break;
                default:
                    System.out.println("a conta não ganha brinde ");
                    break;
            }

            /*  if(this.tipoC == "cc"){
                this.saldo += 50.0f;
                System.out.println(this.saldo);
                System.out.println("pelo tipo de Conta corrente, bonus foi dado de 50 R$ ");
            }
             else if(this.tipoC == "cp") {
                this.saldo += 150.0f;
                System.out.println(this.saldo);
                System.out.println("a conta ganhou um bonus de 150 R$");
            } else{
                System.out.print("inválido! ");
            }*/
        } 
    }

    public void fecharconta() {
        if (status == false) {
            System.out.println("a conta não pode ser pausada");
        } else {
            this.status = false;
            System.out.println(" a conta foi fehcada");
        }
    }

    // * métodos de açõees para depositar */
    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (this.saldo <= 0.0f ) {
            System.out.println("você não pode sacar dinheiro, pois sua conta não há dinheiro debitado: ");
        } else {
            System.out.println("ok, você passou do Check-in para sacar");
            this.saldo -= valor;

        }
    }
    protected void status(){
    
        System.out.println("os status da conta são ");
        System.out.printf("nome do usuário "+this.dono+ " Saldo da conta: "+this.saldo+ " o estado da mesma é: "+this.status);
    }
}
