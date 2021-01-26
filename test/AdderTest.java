import adder.Adder;
import org.junit.Assert;
import org.junit.Test;

public class AdderTest {
    @Test
    public void guttest1() throws Exception {
        Adder addertest = new Adderclass();
        int summe = addertest.add(1, 1);
        Assert.assertEquals(2, summe);
    }
    @Test
    public void guttest2() throws Exception {
        Adder addertest = new Adderclass();
        int summe = addertest.add(40, 2);
        Assert.assertEquals(42, summe);
    }
    @Test
    public void wandtest1() throws Exception {
        Adder addertest = new Adderclass();
        int summe = addertest.add(Integer.MAX_VALUE, 0);
        Assert.assertEquals(Integer.MAX_VALUE, summe);
    }

    @Test
    public void wandtest2() throws Exception {
        Adder addertest = new Adderclass();
        int summe = addertest.add(Integer.MIN_VALUE, 0);
        Assert.assertEquals(Integer.MIN_VALUE, summe);
    }
    @Test(expected = Exception.class)
    public void schlechttest1() throws Exception {
        Adder addertest = new Adderclass();
        int summe = addertest.add(Integer.MAX_VALUE, 3);
    }

    @Test
    public void schlechttest2() {
        Adder addertest = new Adderclass();
        int summe = 0;
        try {
            summe = addertest.add(Integer.MIN_VALUE, -5);
            Assert.fail();
        } catch (Exception e) {

        }

    }

}
