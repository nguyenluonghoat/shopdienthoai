package com.example.webbandienthoai.repository;

import com.example.webbandienthoai.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {



    // danh sách sản phẩm
    @Query(value = "select p.id as'idProduct',p.name as 'name',p.brand as 'brand',p.capacity as 'capacity',p.cost as 'cost'," +
            "p.id_properties_id as'idProper',p.id_specifications_id as'idSpe', pr.picture as 'picture' from product p inner join properties pr on pr.id = p.id_properties_id ", nativeQuery = true)
    List<Map<String,Object>> getListProduct();



    //danh sách sản phẩm có điều kiện theo id
    //@Query(value = "select p.id as'idProduct',p.name as 'name',p.brand as 'brand',p.cost as 'cost', p.id_properties_id as'idProper',p.id_specifications_id as'idSpe', pr.picture as 'picture' from product p inner join properties pr on pr.id = p.id_properties_id where p.id = ?", nativeQuery = true)
    //List<Map<String,Object>> getListById();
}
