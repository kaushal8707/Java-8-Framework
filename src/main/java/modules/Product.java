package modules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    int id;
    String name;
    String productType;
    int quantity;
    double price;
    String supplierName;
}
