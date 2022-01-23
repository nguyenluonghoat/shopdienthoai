package com.example.webbandienthoai.service.ServiceImpl;

import com.example.webbandienthoai.model.entity.ProductEntity;
import com.example.webbandienthoai.model.respone.ProductResponse;
import com.example.webbandienthoai.repository.ProductRepository;
import com.example.webbandienthoai.service.IProductService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class IProductServiceImpl implements IProductService {
    private final ProductRepository productRepository;

    private ProductResponse productResponse;

    public IProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;

        this.modelMapper = modelMapper;
    }

    private final ModelMapper modelMapper;

    @Override
    public List<ProductResponse> getAll() {

        List<ProductEntity> entities = productRepository.findAll();
        List<ProductResponse> responses = new ArrayList<>();

        for (ProductEntity entity:entities) {
            responses.add(convertEntityToResponse(entity));
        }
        return responses;
    }




    @Override
    public List<ProductResponse> findPicture() {

        List<Map<String,Object>> listProduct = productRepository.getListProduct();

            List<ProductResponse> responses = new ArrayList<>();

            for(Map<String,Object> product :listProduct){
                ProductResponse productResponse1 = new ProductResponse();
                productResponse1.setId( (Integer) product.get("idProduct"));
                productResponse1.setName((String)product.get("name") );
                productResponse1.setBrand((String)product.get("brand") );
                productResponse1.setCapacity((String)product.get("capacity"));
                productResponse1.setCost((Float) product.get("cost"));
                productResponse1.setIdPropertie((Integer)product.get("idProper"));
                productResponse1.setIdSpecification((Integer)product.get("idSpe"));
                productResponse1.setPicture((String) product.get("picture"));
                responses.add(productResponse1);
            }

            return responses;
    }


    //phan trang
    @Override
    public Page<ProductResponse> page(Integer indexPage, Integer size) {
        return null;
    }

    private ProductResponse convertEntityToResponse(ProductEntity entity) {
        ProductResponse productResponse = modelMapper.map(entity,ProductResponse.class);
        productResponse.setIdPropertie(entity.getIdProperties().getId());
        productResponse.setIdSpecification(entity.getIdSpecifications().getId());

        return productResponse;
    }

}
