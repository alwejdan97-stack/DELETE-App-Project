package ProductApp.Demo.Controllers;

import ProductApp.Demo.Services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    ProductService productService=new ProductService();

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProductById(id);
    }
}
