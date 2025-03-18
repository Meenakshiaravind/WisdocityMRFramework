package hooks;

import com.Wisdocity.pages.base.BaseTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	 @Before
	 public void initializeTest() {
	     BaseTest.setup();
	 }

//	 @After
//	 public void tearDownTest() {
//	     BaseTest.tearDown();
//	 }

}
