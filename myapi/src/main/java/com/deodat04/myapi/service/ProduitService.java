package com.deodat04.myapi.service;

import java.util.List;

import com.deodat04.myapi.model.Produit;

public interface ProduitService {
    Produit create(Produit produit);

    List<Produit> list();

    Produit update(Long id, Produit produit);

    String delete(Long id);

}