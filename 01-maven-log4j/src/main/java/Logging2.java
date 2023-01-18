import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
	private static Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		insertPersonel("Pempe");
	}
	
	public static void insertPersonel(String personel) {
		logger.info("Personel eklendi.! :-)");
	}
}
