package org.java8.framework.Stream.API;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import modules.InventoryProducts;
import modules.Product;
import modules.ValueMapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAllListedProductsBasedOnProductTypes {
    public static void main(String[] args) throws JsonProcessingException {
       List<InventoryProducts> listOfProducts= Stream.of(new InventoryProducts(1,"Mixer Grinder","Kitchen & Home",1,6654.11,"SUPS"),
                  new InventoryProducts(2,"Mobile","Electronics",2,99126,"KUISP"),
                  new InventoryProducts(3,"Fruits","Groceries",2,88712.12,"MNPS"),
                  new InventoryProducts(4,"Juicer","Kitchen & Home",1,6654.11,"APSD"),
                  new InventoryProducts(5,"Laptop","Electronics",3,142126,"NNBAV"),
                  new InventoryProducts(7,"Charger","Electronics",5,992126,"OOAYT"),
                  new InventoryProducts(6,"Vegetables","Groceries",4,32712.12,"OIUA"))
               .collect(Collectors.toList());

       Map<String, List<Product>> fetchOnProductTypes=listOfProducts
               .stream()
               .map(ValueMapper::convertToProduct)
               .filter(product -> product.getProductType() != null)
               .collect(Collectors.groupingBy(Product::getProductType));

       String result = new ObjectMapper().writeValueAsString(fetchOnProductTypes);

       System.out.println("Fetch all Products list based on product types : "+result);




    }
}
