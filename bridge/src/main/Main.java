package main;

import java.io.File;

import logger.Logger;
import logger.implementor.BufferedLogger;
import logger.implementor.FileLoggerImplementor;
import logger.implementor.ImmediateLogger;
import logger.implementor.StdOutLoggerImplementor;

public class Main {

	public static void main(String[] args) {
		{
			Logger logger = new ImmediateLogger(new StdOutLoggerImplementor());
			logger.log("almafa");
			logger.log("korte");
			logger.log("dinnye");
		}
		
		{
			Logger logger = new ImmediateLogger(new FileLoggerImplementor(new File("log.txt")));
			logger.log("almafa");
			logger.log("korte");
			logger.log("dinnye");
		}
		
		{
			BufferedLogger logger = new BufferedLogger(new FileLoggerImplementor(new File("log.txt")));
			logger.log("almafa");
			logger.log("korte");
			logger.log("dinnye");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			logger.flush();
		}
		
		{
			BufferedLogger logger = new BufferedLogger(new StdOutLoggerImplementor());
			logger.log("almafa");
			logger.log("korte");
			logger.log("dinnye");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			logger.flush();
		}
	}

}
