package layeredApp.core.logging;

public class DatabaseLoggger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına loglandı" + data);

	}

}
