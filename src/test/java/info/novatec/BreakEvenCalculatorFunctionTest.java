package info.novatec;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BreakEvenCalculatorFunctionTest {

    @ParameterizedTest
    @CsvSource({
            "20.00, 100.00, 10.00, 10",
            "6.00, 1000.00, 4.00, 500",
            "2.30, 333.33, 2.10, 1667",
            "3.00, 8000.00, 1.50, 5334"}
    )
    public void testBreakEvenFunction(double price, double fixedCost, double unitCost, String breakEvenPoint) {
        given()
                .queryParam("price", price)
                .queryParam("fixedCost", fixedCost)
                .queryParam("unitCost", unitCost)
                .when().get("/run")
                .then()
                .statusCode(200)
                .body(is(breakEvenPoint));
    }
}