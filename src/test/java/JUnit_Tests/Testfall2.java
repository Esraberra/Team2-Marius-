package JUnit_Tests;

import leisureCalculator.LeisureCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testfall2 {

    @Test
    public void AeqiuvalenzklassenTest1() {
        assertEquals ("Picknick", new LeisureCalculator("Relax", "Sonne", "5").calculateLeisure());
        //assertEquals ("Kino", new LeisureCalculator("Relax", "Sonne", "5").calculateLeisure());
    }
}
