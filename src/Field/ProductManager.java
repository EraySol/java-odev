package Field;

public class ProductManager {

public void Add(Product product)
{
    System.out.println("Ürün Eklendi"+product.productName);
}
public void Update(Product product)
{
    System.out.println("Ürün fiyatı güncellendi"+product.price);
}
public void Delete(Product product)
{
    System.out.println("Ürün Stoku Silinmiştir"+product.stockAmount);
}
}

