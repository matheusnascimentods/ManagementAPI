package br.com.manegement.api.mapper;

import br.com.manegement.api.dto.ProductDTO;
import br.com.manegement.api.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    public Product toModel(ProductDTO dto);
    public ProductDTO toDTO(Product model);

}
