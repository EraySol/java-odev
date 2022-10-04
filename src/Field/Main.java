package Field;

public class Main {

    public static void main(String[] args) {

        Product product=new Product();
        product.ıd=1;
        product.productName="Laptop";
        product.description="Lenovo Laptop";
        product.price=8500;
        product.stockAmount=100;

        System.out.println(product.ıd);
        System.out.println(product.productName);
        System.out.println(product.description);
        System.out.println(product.price);
        System.out.println(product.stockAmount);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        productManager.Update(product);
        productManager.Delete(product);
    }
}
