import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ormRequestsTest
{
    private static final ormRequests Queries=new ormRequests();

    @Test
    public void countByYearTest()
    {
        flywayWork.initialize();
        Integer count = Queries.countByYear(2017);
        assertEquals(count, (Integer)2);
        flywayWork.clean();
    }
    @Test
    public void sumAfterYearTest()
    {
        flywayWork.initialize();
        String sum = Queries.sumAfterYear(2015);
        assertEquals(sum, "$29,000.00");
        flywayWork.clean();
    }
    @Test
    public void minMaxByCostTest()
    {
        flywayWork.initialize();
        String[] output = Queries.minMaxByCost();
        assertEquals(output.length,2);
        flywayWork.clean();
    }
    @Test
    public void carAvtoownersTest()
    {
        flywayWork.initialize();
        List<Object[]> output = Queries.carAvtoowners("Audi");
        assertEquals(output.size(),1);
        flywayWork.clean();
    }
    @Test
    public void ormFirstTwoVendorTest()
    {
        flywayWork.initialize();
        List<Object[]> output = Queries.ormFirstTwoVendor();
        assertEquals(output.size(),2);
        flywayWork.clean();
    }
    @Test
    public void infoFromTwoTablesTest()
    {
        flywayWork.initialize();
        List<Object[]> output = Queries.infoFromTwoTables();
        assertEquals(output.size(),5);
        flywayWork.clean();
    }
}