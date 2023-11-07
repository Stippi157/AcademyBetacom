package betacom.utilities;
import java.util.Scanner;


public class BankAccount {
	
	
	private AccountHolder client;
	private double balance;
	Scanner sc = new Scanner(System.in);
	
	public BankAccount() {
		int a = client.getAge();
		System.out.println(a);
		this.balance = bonus(a);;
	}
	
	public void mainMenu() {
		System.out.println("Benvenuto in ****** Bank");
		System.out.println("Seleziona un'operazione tramite il tastierino numerico: ");
		System.out.println("R - Registrazione | P - Prelievo | V - Versamento | E - Esci");
		char input = sc.next().charAt(0);
		double balance = 0;
		switch(input){
			case 'R':
				this.client = new AccountHolder();
				break;
			case 'P':
				balance = subMenu();
				transaction(input, balance);
				break;
			case 'V':
				balance = subMenu();
				transaction(input, balance);
				break;
			case 'E': 
				System.exit(0);
				break;
			default:
				System.out.println("ERRORE: scegli un'opzione dal tastierino numerico ");
				System.out.println("Riprova: ");
				break;
		}
	}
	
	private  double bankWithdrawal() {
		System.out.println("PRELIEVO");
		return this.balance += (subMenu()*(-1));		
	}
	
	private double bankDeposit() {
		System.out.println("VERSAMENTO");
		return this.balance += subMenu();
	}
	
	private double bonus(int age) {
		
		double bonus = 0;
		if(age >= 18 && age < 30) {
			bonus = 100;
		}
		else if(age >=30  && age < 50){
			bonus = 150;
		}
		else if(age >= 50) {
			bonus = 200;
		}
		else {
			System.out.println("Non hai diritto al bonus :(");
		}
		return this.balance += bonus;
	}

	
	private double subMenu() { 
		
		double withdrawal = 0;
		String answer = "";
		int value = 0;
		
		do {	
		System.out.println("Seleziona l'importo desiderato oppure digita l'importo manualmente: ");
		System.out.println("1 - 20€ | 2 - 50€ | 3 - 100€ | 4 - 200€ | 5 - Altro importo" );
		value = sc.nextInt();
		System.out.println("Desideri continuare?");
		answer = sc.next();
		
		} while (answer.equalsIgnoreCase("no"));
		
			switch (value) {
				case 1:
					System.out.println("Hai selezionato 20€, attendi...");
					withdrawal = 20;
					break;
				case 2:
					System.out.println("Hai selezionato 50€, attendi...");
					withdrawal = 50;
					break;
				case 3:
					System.out.println("Hai selezionato 100€, attendi...");
					withdrawal = 100;
					break;
				case 4:
					System.out.println("Hai selezionato 200€, attendi...");
					withdrawal = 200;
					break;
				case 5:
					System.out.println("Digita l'importo da tastierino numerico: ");
					withdrawal = sc.nextDouble();
					if(withdrawal>1000) {
						System.out.println("Importo massimo superato!");
					}
					else {
						System.out.println("Hai selezionato " + withdrawal + " €, attendi...");
					}
					break;
				default:
					System.out.println("Valore non valido!");
					break;
			}
			return withdrawal;
	}
	
	public void transaction(char input, double balance ) {
		
		AccountBalance accountBalance = new AccountBalance();
		accountBalance.setAmount(balance);
		accountBalance.setType(TransactionType.bonus);
		
		if(input == 'P') {
			accountBalance.setType(TransactionType.bankWithdrawal);
			bankWithdrawal();
		}
		else if (input == 'V') {
			accountBalance.setType(TransactionType.bankDeposit);
			bankDeposit();
		}
		accountBalance.setBalanceAfterTransaction(this.balance);
		this.client.getBankingMovement().add(accountBalance);
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	

}
