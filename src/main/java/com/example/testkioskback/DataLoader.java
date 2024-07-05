package com.example.testkioskback;

import com.example.testkioskback.model.Product;
import com.example.testkioskback.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository productRepository;

    public DataLoader(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // 더미 데이터 생성
        productRepository.save(new Product("골드망고 스무디", 4000, "Hot brewed coffee", "seasonal"));
        productRepository.save(new Product("코코넛 커피 스무디", 4000, "Green tea", "seasonal"));
        productRepository.save(new Product("망고 코코넛 주스", 3800, "Ham and cheese sandwich", "seasonal"));
        productRepository.save(new Product("망고 허니블랙 티소다", 5800, "Fresh orange juice", "seasonal"));
        productRepository.save(new Product("딸기 쿠키 프라페", 4900, "Hot brewed coffee", "hotcoffee"));
        productRepository.save(new Product("흑당 버블 라떼", 4800, "Green tea", "hotcoffee"));
        productRepository.save(new Product("흑당 라떼", 5000, "Ham and cheese sandwich", "coolcoffee"));
    }
}
