package com.deodat04.myapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deodat04.myapi.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
    
}