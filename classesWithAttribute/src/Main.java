public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.set_name("Laptop");
        product.setId(1);
        product.setDescription("Huawei Lapotop");
        product.setPrice(13500.00);
        product.set_currency('₺');
        product.set_stockAmount(5);
        productManager.Add(product);

        System.out.println(product.getCode());

    }
}