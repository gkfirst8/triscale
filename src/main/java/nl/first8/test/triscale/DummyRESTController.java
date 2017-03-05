package nl.first8.test.triscale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/dummy")
public class DummyRESTController {
    @GET
    public String dummyGet() {
        return "dummy";
    }
}
