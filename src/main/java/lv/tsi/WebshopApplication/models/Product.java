package lv.tsi.WebshopApplication.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @JsonProperty
    long id;
    @JsonProperty
    String name;
    @JsonProperty
    String description;
    @JsonProperty
    float price;
    @JsonProperty
    String picture_url;
    @JsonProperty
    ProductCategory product_category;
}
