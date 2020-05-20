package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1, new Product(1,"iphone 8","Apple",15000000));
        products.put(2, new Product(2,"iphone X","Apple",22000000));
        products.put(3, new Product(3,"iphone 11","Apple",28000000));
        products.put(4, new Product(4,"Galaxy S20","SamSung",20000000));
        products.put(5, new Product(5,"Galaxy Note 10","SamSung",25000000));
        products.put(6, new Product(6,"Galaxy A50","SamSung",8000000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);

    }
}