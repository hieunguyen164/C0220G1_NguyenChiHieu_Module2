package general.service;

import general.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService{
    private static Map<Integer,Product> products = new HashMap<>();
    static {
        products.put(1,new Product(1, "iPhone 8","Apple",1000000));
        products.put(2,new Product(2, "iPhone X","Apple",3000000));
        products.put(3,new Product(3, "iPhone 11","Apple",5000000));
        products.put(4,new Product(4, "Galaxy S20","SamSung",4000000));
        products.put(5,new Product(5, "Galaxy Note 10","SamSung",6000000));
        products.put(6,new Product(6, "Galaxy A50","SamSung",2000000));
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
    public Product findByName(String name) {
        for(Product product: products.values()){
            if (name.equals(product.getName())){
                return product;
            }
        }
        return null;
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
