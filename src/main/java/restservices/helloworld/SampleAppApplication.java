package restservices.helloworld;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/sa")
	public class SampleAppApplication  extends Application {

	    private Set<Object> singletons = new HashSet<Object>();

	    public SampleAppApplication() {
	        singletons.add(new SampleAppRest());
	    }

	    @Override
	    public Set<Object> getSingletons() {
	        return singletons;
	    }
	}
