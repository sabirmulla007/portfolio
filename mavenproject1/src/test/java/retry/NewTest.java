package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	@Test(retryAnalyzer = retry.RetryAnalyzer.class)
	public void f() {

		Assert.assertEquals(false, true);

	}
}
