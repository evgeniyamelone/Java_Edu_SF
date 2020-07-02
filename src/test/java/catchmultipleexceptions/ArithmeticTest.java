package catchmultipleexceptions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    @Test
    void division() throws InvalidInputParamException, ResultZeroException, EqualNumbersException {
        Assertions.assertThat(Arithmetic.divide(6, 3)).isEqualTo(2);
    }

    @Test
    void divisionByZero() {
        try {
            Arithmetic.divide(6, 0);
            fail("My method didn't throw when I expected it to");
        } catch (InvalidInputParamException | EqualNumbersException | ResultZeroException expectedException) {
        }
    }

    @Test
    void divisionByGreater() {
        try {
            Arithmetic.divide(3, 6);
            fail("My method didn't throw when I expected it to");
        } catch (InvalidInputParamException | EqualNumbersException | ResultZeroException expectedException) {
        }
    }

    @Test
    void divisionByEqual() {
        try {
            Arithmetic.divide(7, 7);
            fail("My method didn't throw when I expected it to");
        } catch (InvalidInputParamException | EqualNumbersException | ResultZeroException expectedException) {
        }
    }
}