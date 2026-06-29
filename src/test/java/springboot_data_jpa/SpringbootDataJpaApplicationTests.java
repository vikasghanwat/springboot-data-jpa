package springboot_data_jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springboot_data_jpa.entities.ProductEntity;
import springboot_data_jpa.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SpringbootDataJpaApplicationTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

/*    @Test
    void testRepository() {
        ProductEntity build = ProductEntity.builder()
                .sku("nestlay123")
                .title("nestlay chocolate")
                .price(BigDecimal.valueOf(13.45))
                .quantity(12)
                .build();

        ProductEntity save = productRepository.save(build);
        System.out.println(save);

    }*/

    @Test
    void getRepository() {
        // List<ProductEntity> entities = productRepository.findAll();

        // List<ProductEntity> entities = productRepository.findByTitle("nestlay chocolate");

        // List<ProductEntity> entities = productRepository.findByCreatedAtAfter(LocalDateTime.of(2025, 1, 1, 0, 0, 0));

        // List<ProductEntity> entities = productRepository.findByQuantityAndPrice(12,BigDecimal.valueOf(13.45));
        //List<ProductEntity> entities = productRepository.findByQuantityGreaterThanAndPriceLessThan(4,BigDecimal.valueOf(33.45));
        //List<ProductEntity> entities = productRepository.findByQuantityGreaterThanOrPriceLessThan(4, BigDecimal.valueOf(33.45));

        //List<ProductEntity> entities = productRepository.findByTitleLike("%choco%");
        // List<ProductEntity> entities = productRepository.findByTitleContains("choco");
        List<ProductEntity> entities = productRepository.findByTitleContainingIgnoreCase("choCO");
        System.out.println(entities);

    }

/*    @Test
    void getSingleEntityFromRepository() {
        Optional<ProductEntity> entity = productRepository.findByTitleAndPrice("Pepsi", BigDecimal.valueOf(14.4));
        entity.ifPresent(System.out::println);
    }*/

    @Test
    void getSingleEntityFromRepositoryByQuery() {
        Optional<ProductEntity> entity = productRepository.findByTitleAndPrice("Pepsi", BigDecimal.valueOf(14.4));
        entity.ifPresent(System.out::println);
    }
}
