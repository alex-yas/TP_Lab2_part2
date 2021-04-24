import junit.framework.TestCase;

public class LombokTest extends TestCase {

    public void testConstructor() {
        Avtoowners owner=new Avtoowners(1,"Чехов","Антон","Павлович",
                "+375293333333","Каштанкина 4","Audi","1860Ab-7",
                "AICI27437823423877563","15000$",2017,4);
        assertEquals("Каштанкина 4", owner.getAddress());
    }

    public void testSetMethod() {
        Avtoowners owner = new Avtoowners();
        owner.setAvtoCost("1200$");
        assertEquals("1200$",owner.getAvtoCost());
    }
}
