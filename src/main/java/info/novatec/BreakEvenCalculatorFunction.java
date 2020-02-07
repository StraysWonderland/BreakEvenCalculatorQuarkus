package info.novatec;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/run")
public class BreakEvenCalculatorFunction {

    @Inject
    BreakEvenResponse response;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Timed(name = "breakEvenTimer", description = "execution time of breakEvenFunction",
            unit = MetricUnits.MILLISECONDS)
    public BreakEvenResponse calculate(@QueryParam double price, @QueryParam double fixedCost, @QueryParam double unitCost) {
        response.breakEvenPoint = (int) Math.ceil(fixedCost / (price - unitCost));
        return response;
    }

}