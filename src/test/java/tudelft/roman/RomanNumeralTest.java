package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {


    @Test
    public void singleNumbero() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigitse() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotationf() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotationff() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotationn() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("LXXXX");
        Assertions.assertEquals(90, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotationeg() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XIIX");
        Assertions.assertEquals(18, result);
    }
}
