package it.betacom.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class MyLogger {
	 	 private String filePath ;
	     private String level ;
	     private String handler ;
	    
	   /*  
	    public void logger(String messaggio) {
	      MyLogger log= new MyLogger();
	    	String message = messaggio;
	    	if(level.contains("info")) {
				this.warning(message);
				this.info(message);
				this.error(message);
			}else if(level.contains("warning")) {
				this.warning(message);
				this.error(message);
			}else if(level.contains("error")) {
				this.error(message);
			}
	    }
	    */
	    
	    
	    public MyLogger() {
	    	String configPath ="./properties/config.properties" ;
			try {
				InputStream inputStream = new FileInputStream(configPath);
				Properties properties = new Properties();
				properties.load(inputStream);
				this.level= properties.getProperty("logger.level");
				this.filePath= properties.getProperty("logger.file");
				this.handler= properties.getProperty("logger.handler");
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    private void logWriter(String messaggio){
			
			String message = messaggio;
			
			try {
				File file =new File(filePath);
				FileWriter fileWriter= new FileWriter(file,true);
				BufferedWriter writer = new BufferedWriter(fileWriter);
				writer.append(message);;
				writer.newLine();
				writer.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	    
	    public void warning(String messaggio) {
	    	 if(level.contains("warning") || level.contains("info") ) {
			  if(handler.contains("CONSOLE") || handler.contains("FILE") || handler.contains("ALL") ) {
			  String warningMessaggio =dataFormatter()+"WARNING  " + messaggio;
				if(handler.contains("CONSOLE")){
					System.out.println(warningMessaggio);
				}else if(handler.contains("FILE")){
					this.logWriter(warningMessaggio);
				}else if(handler.contains("ALL")) {
					System.out.println(warningMessaggio);
					this.logWriter(warningMessaggio);
				}
			   }
			  }
	    	}
		
		  public void error(String messaggio) {
			  if(level.contains("info") || level.contains("warning") || level.contains("error")) {
			  if(handler.contains("CONSOLE") || handler.contains("FILE") || handler.contains("ALL") ) {
				  String errorMessaggio =dataFormatter()+"ERRORE "+ messaggio;
					if(handler.contains("CONSOLE")){
						System.out.println(errorMessaggio);
					}else if(handler.contains("FILE")){
						this.logWriter(errorMessaggio);
					}else if(handler.contains("ALL")) {
						System.out.println(errorMessaggio);
						this.logWriter(errorMessaggio);
					}
			     }
			   }
			}
		  
		  public void info(String messaggio) {
			 if(level.contains("info")) {
			  if(handler.contains("CONSOLE") || handler.contains("FILE") || handler.contains("ALL") ) {
				  String infoMessaggio = dataFormatter() +"INFO  " +messaggio;
					if(handler.contains("CONSOLE")){
						System.out.println(infoMessaggio);
					}else if(handler.contains("FILE")){
						this.logWriter(infoMessaggio);
					}else if(handler.contains("ALL")) {
						System.out.println(infoMessaggio);
						this.logWriter(infoMessaggio);
					}
				  }else {
					  System.out.println("handler deve essere CONSOLE|FILE|ALL");
				  }
			  }
			}
		  
		  private String dataFormatter() {
			  LocalDateTime data = LocalDateTime.now();
			  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			  String dataFormattata = formatter.format(data);
			  String dataMessaggio = "["+dataFormattata+"]";
			return dataMessaggio;
		  }

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getHandler() {
			return handler;
		}

		public void setHandler(String handler) {
			this.handler = handler;
		}

		
}
