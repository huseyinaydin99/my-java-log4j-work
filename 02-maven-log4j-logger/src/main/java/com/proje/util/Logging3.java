package com.proje.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging3 {
	public void loggingMethod3() {
		Logger logger = LogManager.getLogger();
		logger.fatal("Logging1 başarılı.!");
	}
}
