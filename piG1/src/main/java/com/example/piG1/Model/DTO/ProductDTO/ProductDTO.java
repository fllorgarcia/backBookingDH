package com.example.piG1.Model.DTO.ProductDTO;
import com.example.piG1.Model.Entity.Feature;
import com.example.piG1.Model.Entity.Image;
import com.example.piG1.Model.Entity.Policy;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private Integer id;
    private String name;
    private String description;
    private List<Image> images;
    private List<Policy> policies;
    private Integer city_id;
    private Integer category_id;
    private List<Feature> features;
}
