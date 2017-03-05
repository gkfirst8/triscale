/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.first8.test.triscale;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author gkok
 */
@Path("/dummy")
public class DummyRESTController {
    @GET
    public String dummyGet() {
        return "dummy";
    }
}
