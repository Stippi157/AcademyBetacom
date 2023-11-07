package it.betacom.contoBancario;

import java.time.LocalDate;
import java.util.Random;

public class UtilsConto {
	public static LocalDate generaData() {
        Random random = new Random();
        int anno = 2021;
        int mese = random.nextInt(12) + 1;
        int giorno = random.nextInt(LocalDate.of(anno, mese, 1).lengthOfMonth()) + 1;
        LocalDate randomData = LocalDate.of(anno, mese, giorno);
        return randomData;
    }
}
