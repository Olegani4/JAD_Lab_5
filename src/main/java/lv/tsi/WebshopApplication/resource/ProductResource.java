package lv.tsi.WebshopApplication.resource;

import lv.tsi.WebshopApplication.models.Product;
import lv.tsi.WebshopApplication.service.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductResource {
    private final ProductRepository prodRep;

    @Autowired
    public ProductResource(ProductRepository prodRep) {
        this.prodRep = prodRep;
    }

    @GetMapping("/getProducts")
    ResponseEntity<Iterable<Product>> findBooks() {
        return ResponseEntity.ok(prodRep.findAll());
    }

    @GetMapping("/getProduct")
    ResponseEntity<Optional<Product>> findBook(@RequestParam(value = "id") Long id) {
        return ResponseEntity.ok(prodRep.findById(id));
    }
}
