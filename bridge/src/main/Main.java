package main;

import java.io.File;
import java.io.IOException;

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
			try(FileLoggerImplementor implementor =  new FileLoggerImplementor(new File("log.txt"))) {
				Logger logger = new ImmediateLogger(implementor);
				logger.log("almafa");
				logger.log("korte");
				logger.log("dinnye");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		{
			try(FileLoggerImplementor implementor = new FileLoggerImplementor(new File("log.txt"))) {
				BufferedLogger logger = new BufferedLogger(implementor);
				logger.log("almafa");
				logger.log("korte");
				logger.log("dinnye");

				Thread.sleep(500);

				logger.flush();
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}
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
