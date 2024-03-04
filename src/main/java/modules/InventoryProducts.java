package modules;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class InventoryProducts {
    int id;
    String name;
    String productType;
    int quantity;
    double price;
    String supplierName;
}