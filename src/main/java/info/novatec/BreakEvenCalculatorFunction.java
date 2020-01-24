package info.novatec;

import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/run")
public class BreakEvenCalculatorFunction {

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String calculate(@QueryParam double price, @QueryParam double fixedCost, @QueryParam double unitCost) {
        int breakEvenPoint = (int) Math.ceil(fixedCost / (price - unitCost));
        return String.valueOf(breakEvenPoint);
    }
}