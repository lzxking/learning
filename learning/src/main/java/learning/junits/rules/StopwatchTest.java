package learning.junits.rules;

import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.junit.AssumptionViolatedException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Description;

public class StopwatchTest {
     private static final Logger logger = Logger.getLogger("");

     private static void logInfo(Description description, String status, long nanos) {
         String testName = description.getMethodName();
         Collection<Annotation> aa=description.getAnnotations();
        ArrayList<Description> desc= description.getChildren();
        for(Description d :desc){
        	boolean a =d.isTest();
        
        	System.out.println(a);
        }
         Iterator <Annotation> it=aa.iterator();
         
         while(it.hasNext()){
        	 Annotation a=it.next();
        	 System.out.println(a.annotationType());
        	 System.out.println(a.toString());
         }
         logger.info(String.format("Test %s %s, spent %d microseconds",
                                   testName, status, TimeUnit.NANOSECONDS.toMicros(nanos)));
     }

    @Rule
     public Stopwatch stopwatch = new Stopwatch() {
        @Override
         protected void succeeded(long nanos, Description description) {
        	System.out.println("test succeed");
             logInfo(description, "succeeded", nanos);
         }

        @Override
         protected void failed(long nanos, Throwable e, Description description) {
             logInfo(description, "failed", nanos);
         }

        @Override
         protected void skipped(long nanos, AssumptionViolatedException e, Description description) {
             logInfo(description, "skipped", nanos);
         }

        @Override
         protected void finished(long nanos, Description description) {
             logInfo(description, "finished", nanos);
         }
     };

    @Test
     public void succeeds() {
     }

    @Test
     public void fails() {
         fail();
     }

    @Test
     public void skips() {
//         assumeTrue(false);
     }
 }