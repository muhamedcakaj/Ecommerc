package user.ServicesImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import user.Entity.ProductEntity;
import user.Repository.ProductRepository;
import user.Service.ProductService;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public ProductEntity findById(int id) {
        Optional<ProductEntity> optionalProduct = productRepository.findById(id);
        return optionalProduct.orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
    }
    @Override
    public ProductEntity save(ProductEntity productEntity) {
        try {
            ProductEntity savedProduct = productRepository.save(productEntity);
            return savedProduct;
        } catch (DataIntegrityViolationException e) {
            throw new RuntimeException("Error saving the new product", e);
        }
    }

    @Override
    public List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        if (productRepository.existsById(id)) {
            ProductEntity product=this.productRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));

            System.out.println(id);

            product.setCategory("false");
            product.setIs_deleted("True");

            productRepository.save(product);

        } else {
            throw new RuntimeException("User not found with ID: " + id);
        }
    }

    @Override
    public List<ProductEntity> findProductsWithCategory(String category) {
        List<ProductEntity> allProducts = productRepository.findAll();

        List<ProductEntity> ShoppingCarts = allProducts.stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());

        return ShoppingCarts;
    }
}
