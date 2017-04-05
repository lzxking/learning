package learning.junits.rules;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;

public class TestMyRule {
	@Rule
	public MyRule rule= new MyRule(new File("C:/lzx/test"));
	@Test
	public void testA() throws IOException{
		File a =new File("a");
		
		rule.newFile("testFile");
		
		
	}

}
