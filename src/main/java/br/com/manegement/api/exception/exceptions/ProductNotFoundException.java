package br.com.manegement.api.exception.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class ProductNotFoundException extends EntityNotFoundException {

    public ProductNotFoundException (Long id) {

        super(String.format("Não existe nenhum produto com id %s", id));
    }
}
