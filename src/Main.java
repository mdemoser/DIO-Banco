
public class Main {

	public static void main(String[] args) {
		
		Cliente marcos = new Cliente("marcos");
	
		Conta cc = new ContaCorrente(marcos);
		Conta poupanca = new ContaPoupanca(marcos);
	
		cc.depositar(100);
		cc.transferir(50, poupanca);
		poupanca.investir(20.0);
		cc.investir(30);
		
		
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
	}

}
