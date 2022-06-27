package com.example.piG1.Model.DTO.ProductDTO;

import com.example.piG1.Model.DTO.CategoryDTO.CategoryDTO;
import com.example.piG1.Model.DTO.CityDTO.CityDTO;
import com.example.piG1.Model.DTO.FeatureDTO.FeatureDTO;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GetAllProductsDTO {
    private Integer id;
    private String name;
    private String description;
    private CityDTO city;
    private CategoryDTO category;
    private String imageUrl;
    private List<FeatureDTO> features;
}
