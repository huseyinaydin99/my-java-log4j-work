package com.proje.test;

import com.proje.Logging1;
import com.proje.logger.Logging2;
import com.proje.util.Logging3;

public class Main {

	public static void main(String[] args) {
		Logging1 logging1 = new Logging1();
		Logging2 logging2 = new Logging2();
		Logging3 logging3 = new Logging3();
		
		logging1.loggingMethod1();
		logging2.loggingMethod2();
		logging3.loggingMethod3();
		
	}

}
