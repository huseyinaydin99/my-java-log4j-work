package com.proje;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging1 {
	public void loggingMethod1() {
		Logger logger = LogManager.getLogger();
		logger.info("Logging1 başarılı.!");
	}
}
