package com.example.SpringProductAPI.Service;

import java.util.List;
import java.util.Optional;

import com.example.SpringProductAPI.Model.ProductModel;
import com.example.SpringProductAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductModel getProductById(long id) {
        Optional<ProductModel> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElse(null);
    }

    @Override
    public void saveProduct(ProductModel productModel) {
        productRepository.save(productModel);
    }

    @Override
    public void updateProduct(ProductModel productModel) {
        productRepository.save(productModel);
    }

    @Override
    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

}
