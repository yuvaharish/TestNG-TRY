package failedRerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int filedCount=0;
	int limit=4;
	
	@Override
	public boolean retry(ITestResult result) {
		if(filedCount<limit) {
			
			filedCount++;
			return true;
		}
		
		return false;
	}

}
