import model.mansrimi.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class RimiPurchaseProcess {
    @Test
    public void purchaseProcessExample() {
        User nikita = new User("Nikita", "Tester", "112-11223", "112");

        Card nikitasCard = new Card(12345678L, nikita, new BigDecimal(0));

        Purchase purchase = new Purchase(new Shop("Rimi 21", "Origo 2", "8-22"));
        purchase.addProduct(new Product("Hlebushek", null, new BigDecimal("1.49")));
        purchase.addProduct(new Product("Kolbaska", null, new BigDecimal("7.80")));
        purchase.addProduct(new Product("Viskarik", null, new BigDecimal("49.99")));

        purchase.identifyUser(nikitasCard);

        purchase.printReceipt();
    }
}
