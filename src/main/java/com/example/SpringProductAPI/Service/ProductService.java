package com.example.SpringProductAPI.Service;

import com.example.SpringProductAPI.Model.ProductModel;
import java.util.List;

public interface ProductService {

    ProductModel getProductById(long id);
    void saveProduct(ProductModel productModel);
    void updateProduct(ProductModel productModel);
    void deleteProduct(long id);
    List<ProductModel> getAllProducts();

}
