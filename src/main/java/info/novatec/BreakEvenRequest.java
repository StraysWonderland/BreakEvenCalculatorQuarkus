package info.novatec;

import java.util.Objects;

public class BreakEvenRequest {

    private double price;
    private double fixedCosts;
    private double unitCosts;

    public BreakEvenRequest() {
    }

    public BreakEvenRequest(double price, double fixedCosts, double unitCosts) {
        this.price = price;
        this.fixedCosts = fixedCosts;
        this.unitCosts = unitCosts;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof BreakEvenRequest)) {
            return false;
        }

        BreakEvenRequest other = (BreakEvenRequest) obj;

        return Objects.equals(other.price, this.price) &&
                Objects.equals(other.fixedCosts, this.fixedCosts) &&
                Objects.equals(other.unitCosts, this.unitCosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.price);
    }
}