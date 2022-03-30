package JUnit_Tests;


import leisureCalculator.LeisureCalculator;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class Testfall1 {




    //Äquivalenzklassentests
    @Test
    public void AeqiuvalenzklassenTest1() {
        assertEquals ("Picknick", new LeisureCalculator("Relax", "Sonne", "5").calculateLeisure());
    }
    @Test
    public void AeqiuvalenzklassenTest2() {
        assertEquals("Hallenbad", new LeisureCalculator("Sport", "Regen", "11").calculateLeisure());
    }
    @Test
    public void AeqiuvalenzklassenTest3() {
        assertEquals("Theater", new LeisureCalculator("Entertainment", "Schnee", "25").calculateLeisure());
    }
    @Test
    public void AeqiuvalenzklassenTest4() {
        assertEquals("Besuch 5 Sterne Restaurant", new LeisureCalculator("Relax", "Schnee", "112").calculateLeisure());
    }


    //Grenzwert-Bildung
    @Test
    public void GrenzwertTest1() {
        assertEquals ("Picknick", new LeisureCalculator("Relax", "Sonne", "9").calculateLeisure());
    }
    @Test
    public void GrenzwertTest2() {
        assertEquals("Netflix und Lieferando", new LeisureCalculator("Relax", "Regen", "10").calculateLeisure());
    }
    @Test
    public void GrenzwertTest3() {
        assertEquals("Glühwein trinken", new LeisureCalculator("Relax", "Schnee", "19").calculateLeisure());
    }
    @Test
    public void GrenzwertTest4() {
        assertEquals("Biergarten 2.0", new LeisureCalculator("Relax", "Sonne", "20").calculateLeisure());
    }
    @Test
    public void GrenzwertTest5() {
        assertEquals ("Biergarten 2.0", new LeisureCalculator("Relax", "Sonne", "99").calculateLeisure());
    }
    @Test
    public void GrenzwertTest6() {
        assertEquals("Besuch 5 Sterne Restaurant", new LeisureCalculator("Relax", "Sonne", "100").calculateLeisure());
    }


    //Grenzwert Äquivalenzklassen kombiniert
    @Test
    public void GrenzwertAequiTest1() {
        assertEquals ("Wandern", new LeisureCalculator("Sport", "Sonne", "5").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest2() {
        assertEquals("Picknick", new LeisureCalculator("Relax", "Sonne", "9").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest3() {
        assertEquals("Biergarten", new LeisureCalculator("Relax", "Sonne", "10").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest4() {
        assertEquals("Biergarten", new LeisureCalculator("Sport", "Schnee", "15").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest5() {
        assertEquals ("Biergarten", new LeisureCalculator("Relax", "Sonne", "19").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest6() {
        assertEquals("Biergarten 2.0", new LeisureCalculator("Relax", "Sonne", "20").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest7() {
        assertEquals("Biergarten 2.0", new LeisureCalculator("Relax", "Sonne", "50").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest8() {
        assertEquals("Biergarten 2.0", new LeisureCalculator("Relax", "Sonne", "99").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest9() {
        assertEquals("Besuch 5 Sterne Restaurant", new LeisureCalculator("Relax", "Sonne", "100").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTest10() {
        assertEquals("Besuch 5 Sterne Restaurant", new LeisureCalculator("Relax", "Sonne", "200").calculateLeisure());
    }
   // @Test
   // public void GrenzwertAequiTestKeineEIngabe() {
     //   assertEquals("Komm gib dir Mühe!", new LeisureCalculator("", "", "").calculateLeisure());
    //}
    @Test
    public void GrenzwertAequiTestFalschesFormat() {
        assertEquals("Sorry Bro, viel Glück beim nächsten Mal", new LeisureCalculator("", "", "dsgjsahdl").calculateLeisure());
    }
    @Test
    public void GrenzwertAequiTestNegativeZahl() {
        assertEquals("Fehler, leider können wir dir für deine Bedürfnisse keine Vorschläge machen :(", new LeisureCalculator("", "", "-1500").calculateLeisure());
    }

}
//Test