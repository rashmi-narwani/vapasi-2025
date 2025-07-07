import com.tw.spliwise.Expense;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import com.tw.spliwise.BalanceCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalanceCalculatorTest {

    @Test
    void testCalculateBalances() {

        List<Expense> expenses = List.of(
                new Expense("A", 100, "Snacks", List.of("A", "B"), Map.of("A", 50.0, "B", 50.0)),
                new Expense("B", 200, "Taxi", List.of("A", "B"), Map.of("A", 100.0, "B", 100.0))
        );

        Map<String, Double> balances = BalanceCalculator.calculateBalances(expenses);

        assertEquals(50.0, balances.get("A"), 0.01);
        assertEquals(-50.0, balances.get("B"), 0.01);
    }

    @Test
    void testNoExpenses() {
        List<Expense> expenses = List.of();

        Map<String, Double> balances = BalanceCalculator.calculateBalances(expenses);

        assertTrue(balances.isEmpty());
    }
}