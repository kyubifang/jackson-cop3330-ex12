package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_years_rate_and_investment() {
        App myApp = new App();
        int prince = 1500;
        double rate = 4.3;
        double percent = (rate / 100);
        double interest = prince * percent;
        int years = 4;
        double calc = Math.round((interest * years) + prince);
        String invest = Double.toString(calc);
        if(calc % 1 == 0) {
            invest = String.format("%.0f", calc);
        }
        String expectedOutput = "After 4 years at 4.3%, the investment will be worth $1758.";
        String actualOutput = myApp.generateOutputString(rate, years, invest);

        assertEquals(expectedOutput, actualOutput);
    }
}