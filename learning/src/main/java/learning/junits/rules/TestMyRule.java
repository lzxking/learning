package learning.junits.rules;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;

public class TestMyRule {

	@Rule
	public MyRule rule = new MyRule(new File("C:/lzx/test"));

	@Test
	public void testA() throws IOException {
		File a = new File("a");
		System.out.println(TimeUnit.SECONDS.convert(1L, TimeUnit.MINUTES));
		
		rule.newFile("testFile");

	}

}
