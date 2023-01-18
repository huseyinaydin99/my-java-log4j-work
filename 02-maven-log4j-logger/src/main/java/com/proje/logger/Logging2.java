package com.proje.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging2 {
	public void loggingMethod2() {
		Logger logger = LogManager.getLogger();
		logger.warn("Logging1 başarılı.!");
	}
}
