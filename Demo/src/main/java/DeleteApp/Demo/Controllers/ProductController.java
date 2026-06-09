package DeleteApp.Demo.Controllers;

import DeleteApp.Demo.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProductById(id);
    }
}
