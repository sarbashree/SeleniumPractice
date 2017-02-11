package helper;

import org.apache.log4j.Logger;

public class Log {

	private static Logger Log=Logger.getLogger(Log.class.getName());
	private static void startTestCase(String sTestCaseName)
	{
	Log.info("Started Test Cases");
}
	private static void endTestCase(String sTestCaseName)
	{
	Log.info("Ended Test Cases");
	}
	
		
	}
