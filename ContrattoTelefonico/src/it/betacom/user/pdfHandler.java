package it.betacom.user;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import com.itextpdf.*;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfHandler {
	private static final String filePath = "C:\\Workspace_102023\\ContrattoTelefonico\\Bollette";
	
	public void createPDF(/*ContrattoTelefonico contratto*/) {
		String nomeFile = "Bolletta_" + LocalDate.now().toString();
		Document file = new Document();
		try {
			OutputStream outputStream = new FileOutputStream(new File(filePath + "\\" + nomeFile + ".pdf"));
			PdfWriter.getInstance(file, outputStream);
			file.open();
			file.add(new Paragraph("hello word"));
			file.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
