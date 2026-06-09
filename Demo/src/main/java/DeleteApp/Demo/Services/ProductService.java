package DeleteApp.Demo.Services;

import DeleteApp.Demo.Entities.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    HashMap<Integer, Product> productMap=new HashMap<>();

    public void loadSampleProducts(){
        productMap.put(1, new Product("P1-01", "Laptop", 500.0));
        productMap.put(2, new Product("P2-02", "Phone", 300.0));
        productMap.put(3, new Product("P3-03", "Tablet", 200.0));
    }

    public String deleteProductById(int productId){
        if(!productMap.containsKey(productId)){
            return productId+" NOT Found, NO Deletion Performed...";
        }

        Product productoToDelete=productMap.get(productId);
        String deletedName=productoToDelete.getProductName();
        productMap.remove(productId);
        return "Product Deleted SUCCESSFULLY...\n"+
                "Product ID: "+productId+"\n"+
                "Product Name: "+deletedName;
    }

}
