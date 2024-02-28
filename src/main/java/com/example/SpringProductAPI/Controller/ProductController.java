package com.example.SpringProductAPI.Controller;

import java.util.List;
import com.example.SpringProductAPI.Model.ProductModel;
import com.example.SpringProductAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ProductModel getProductById(@PathVariable long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<ProductModel> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public void addProduct(@RequestBody ProductModel productModel) {
        productService.saveProduct(productModel);
    }

    @PutMapping
    public void updateProduct(@PathVariable long id,  @RequestBody ProductModel productModel) {
        ProductModel existingProduct = productService.getProductById(id);
        if(existingProduct != null) {
            productModel.setId(id);
            productService.saveProduct(productModel);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }

}
