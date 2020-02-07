package info.novatec;

import javax.enterprise.context.RequestScoped;
import java.util.Objects;

@RequestScoped
public class BreakEvenResponse {

    public BreakEvenResponse() {

    }

    public BreakEvenResponse(int breakEvenPoint) {
        this.breakEvenPoint = breakEvenPoint;
    }

    public Integer breakEvenPoint;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BreakEvenResponse)) {
            return false;
        }

        BreakEvenResponse other = (BreakEvenResponse) obj;

        return Objects.equals(other.breakEvenPoint, this.breakEvenPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.breakEvenPoint);
    }

}
