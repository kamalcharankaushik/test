package restservices;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.InjectMocks;

import restservices.helloworld.SampleAppApplication;

public class SampleAppApplicationTest {
@InjectMocks
SampleAppApplication sampleAppApplication = new SampleAppApplication();
	
	@Test
	public void testSampleAppApplication() {
		assertNotNull(sampleAppApplication.getSingletons());
	}

	/*@Test
	public void testGetSingletons() {
		fail("Not yet implemented");
	}*/

}
