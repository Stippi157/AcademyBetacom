package betacom.main.bankaccount;

import java.util.Scanner;
import betacom.utilities.AccountHolder;
import betacom.utilities.BankAccount;

public class MainBankAccount {

	public static void main(String[] args) {
		AccountHolder client = new AccountHolder();
		System.out.println(client.getDateF());
		System.out.println(client.getToday());
		
		BankAccount bank = new BankAccount();
		System.out.println(bank.getBalance());
//		System.out.println(client.getBirthDay().toString());
//		System.out.println(client.toString());
//		
//		BankAccount bank = new BankAccount();
//		bank.mainMenu();
//		System.out.println("Il tuo saldo è di: " + bank.getBalance());
	}

}
