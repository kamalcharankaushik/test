package restservices.helloworld;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import restservices.helloworld.test.SampleTest;

@Path("/sampleapp")
public class SampleAppRest {

@Inject
SampleTest sampletest; 

    @GET
    @Path("/hello")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String helloworld() {
        return sampletest.fun();
    }
    @GET
    @Path("/hello-import")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String helloimport() {
        return sampletest.method();
    }
}