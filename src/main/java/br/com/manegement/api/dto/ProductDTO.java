package br.com.manegement.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor
public class ProductDTO {

    private Long id;

    @NotBlank
    private String name;

    @Positive
    private BigDecimal price;

    @Min(value = 0, message = "The stock must be greater than or equal to zero.")
    private int stock;
}
