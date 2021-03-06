package trycatchfinally;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {


    @Test
    void division() {
        Assertions.assertThat(Arithmetic.divide(6, 3)).isEqualTo(2);
        Assertions.assertThat(Arithmetic.divide(3, 3)).isEqualTo(1);
    }

    @Test
    void divisionByZero() {
        try {
            Arithmetic.divide(6, 0);
            fail("My method didn't throw when I expected it to");
        } catch (InvalidInputParamException expectedException) {
        }
    }

    @Test
    public void testException() {
        assertThatExceptionOfType(InvalidInputParamException.class).isThrownBy(() ->
        { throw new InvalidInputParamException("Denominator can't be zero"); })
                .withMessage("Denominator can't be zero");
    }
}