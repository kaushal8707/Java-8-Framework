package modules;

public class ValueMapper {
    public static Product convertToProduct(InventoryProducts inventoryProducts){
        Product product=new Product();
        product.setId(inventoryProducts.id);
        product.setName(inventoryProducts.name);
        product.setProductType(inventoryProducts.productType);
        product.setPrice(inventoryProducts.price);
        product.setQuantity(inventoryProducts.quantity);
        product.setSupplierName(inventoryProducts.supplierName);
        return product;
    }
}
