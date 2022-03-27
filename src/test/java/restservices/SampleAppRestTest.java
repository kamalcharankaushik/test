package restservices;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import restservices.helloworld.SampleAppApplication;
import restservices.helloworld.SampleAppRest;
import restservices.helloworld.test.SampleTest;

@RunWith(MockitoJUnitRunner.Silent.class)
public class SampleAppRestTest {
@InjectMocks
SampleAppRest sampleapp;


@Mock
SampleTest sample;

@Test
public void test() {
assertNotNull(sampleapp.helloworld());
}

@Test
public void helloimportTest() {
	//Mockito.when(sampleTest.method()).thenReturn("kamal");
	assertEquals("kamal",sampleapp.helloimport());
 	
}
}
