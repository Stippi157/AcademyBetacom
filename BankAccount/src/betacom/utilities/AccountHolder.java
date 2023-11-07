package betacom.utilities;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import it.betacom.model.Persona;

public class AccountHolder extends Persona {
	
	private List <AccountBalance> bankingMovement = new ArrayList<AccountBalance>();
	private DateFormat dateFormat;
	private LocalDate birthDay;
	private LocalDate today;
	
	public AccountHolder() {
		super();
		initialiseDate();
		setBirthDay();
	}
	
	public void initialiseDate() {
		this.today = LocalDate.now();
		this.dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
	}
	
	public void readDate() throws Exception{
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Inserire la data di nascita: ");
	    String inputDate = scanner.nextLine();
	    this.birthDay = LocalDate.parse(inputDate);
	    scanner.close();
	}
	
	public int getAge() {
		LocalDate startDate = LocalDate.now();
		LocalDate finalDate = LocalDate.parse(getDateF());
		int difference = Period.between(startDate, finalDate).getYears();				
		return difference;
	}
	
	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay() {
		try {
			readDate();
		} catch (Exception e) {
			System.out.println("ERRORE: formato data errato!");
			e.printStackTrace();
		}
	}
	
	public String getToday() {
		String s = dateFormat.format(today);
		return s;
	}
	
	public void setToday(Date today) {
		this.today = today;
	}
	
	public String getDateF() {
		String s = dateFormat.format(birthDay);
		return s;
	}
	public void setDateF(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public List<AccountBalance> getBankingMovement() {
		return bankingMovement;
	}

	public void setBankingMovement(List<AccountBalance> bankingMovement) {
		this.bankingMovement = bankingMovement;
	}
}
