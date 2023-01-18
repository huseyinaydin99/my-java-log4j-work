package com.huseyinaydin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Logger logger = LogManager.getLogger();
		while(true) {
			logger.info("Selamlar ben log.!");
			Thread.sleep(50);
			System.out.println("Loglandı.!");
		}
		

	}

}
