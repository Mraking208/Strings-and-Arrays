import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSalesInMonth(sale);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSalesInMonth(sale);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void averageSalesPerMonth() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedPerMonth = 15;
        int actualPerMonth = service.salesPerMonth(sale);

        Assertions.assertEquals(expectedPerMonth, actualPerMonth);
    }

    @Test
    public void TheSumOfAllSales() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllSales = 180;
        int actualAllSales = service.allSales(sale);

        Assertions.assertEquals(expectedAllSales, actualAllSales);
    }


    @Test
    public void numberOfMonthsInWhichSalesWereBelowAverage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.monthsInWhichSalesWereBelowAverage(sale);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }


    @Test
    public void numberOfMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();

        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.monthInWhichSalesWereAboveAverage(sale);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
