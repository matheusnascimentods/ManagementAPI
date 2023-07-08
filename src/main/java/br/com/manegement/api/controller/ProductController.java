package br.com.manegement.api.controller;

import br.com.manegement.api.dto.ProductDTO;
import br.com.manegement.api.exception.exceptions.ProductNotFoundException;
import br.com.manegement.api.mapper.ProductMapper;
import br.com.manegement.api.model.Product;
import br.com.manegement.api.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController @RequestMapping("manegement")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    private final static ProductMapper mapper = ProductMapper.INSTANCE;

    @GetMapping
    public List<ProductDTO> get() {

        List<ProductDTO> products = repository.findAll().stream().map(mapper::toDTO).collect(Collectors.toList());
        return  products;
    }
    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable long id) {

        if (!repository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }

        Product product = repository.findById(id).get();
        return mapper.toDTO(product);
    }
    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO post(@RequestBody @Valid ProductDTO dto) {

        Product product = repository.save(mapper.toModel(dto));
        return mapper.toDTO(product);
    }

    @DeleteMapping("/{id}") @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {

        if (!repository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }

        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ProductDTO put(@PathVariable long id, @RequestBody ProductDTO dto) {

        if (!repository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }

        Product product = repository.findById(id).get();

        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setStock(dto.getStock());

        Product updatedProduct = repository.save(product);

        return mapper.toDTO(updatedProduct);
    }
}
