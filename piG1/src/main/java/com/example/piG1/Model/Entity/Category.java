package com.example.piG1.Model.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="description", columnDefinition = "text")
    private String description;
    @Column(name="urlImage")
    private String urlImage;
}
