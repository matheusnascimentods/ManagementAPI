package br.com.manegement.api.mapper;

import br.com.manegement.api.dto.ProductDTO;
import br.com.manegement.api.model.Product;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-08T18:21:51-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.7 (Azul Systems, Inc.)"
)
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toModel(ProductDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( dto.getId() );
        product.setName( dto.getName() );
        product.setPrice( dto.getPrice() );
        product.setStock( dto.getStock() );

        return product;
    }

    @Override
    public ProductDTO toDTO(Product model) {
        if ( model == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setId( model.getId() );
        productDTO.setName( model.getName() );
        productDTO.setPrice( model.getPrice() );
        productDTO.setStock( model.getStock() );

        return productDTO;
    }
}
