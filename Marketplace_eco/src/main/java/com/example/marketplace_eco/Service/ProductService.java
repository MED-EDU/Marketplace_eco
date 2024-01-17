package com.example.marketplace_eco.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.web.multipart.MultipartFile;
import com.example.marketplace_eco.exception.NoProductExistInRepository;
import com.example.marketplace_eco.exception.ProvideProperFileDetailException;
import com.example.marketplace_eco.Models.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAll() throws NoProductExistInRepository;

    Product getById(Long pid) throws NoProductExistInRepository;

    Product add1(Product product);
}
