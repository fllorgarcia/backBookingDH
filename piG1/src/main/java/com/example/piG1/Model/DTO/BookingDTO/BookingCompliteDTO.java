package com.example.piG1.Model.DTO.BookingDTO;

import com.example.piG1.Model.DTO.ProductDTO.ProductDTO;
import com.example.piG1.Model.DTO.ProductDTO.ProductFullDTO;
import lombok.*;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookingCompliteDTO {
    private Integer id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Time hour;
    private ProductFullDTO product;
}
