package com.deodat04.myapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.deodat04.myapi.model.Produit;
import com.deodat04.myapi.repository.ProduitRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService {
    private final ProduitRepository produitRepository;

    @Override
    public Produit create(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public String delete(Long id) {
        produitRepository.deleteById(id);
        return "produit deleted!";
    }

    @Override
    public List<Produit> list() {
        return produitRepository.findAll();
    }

    @Override
    public Produit update(Long id, Produit produit) {
        Produit produitInstance = produitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("produit id " + id + " not found !!!"));

        produitInstance.setCategorie(produit.getCategorie());
        produitInstance.setName(produit.getName());
        produitInstance.setQuantity(produit.getQuantity());
        produitInstance.setInformations(produit.getInformations());

        return produitRepository.save(produitInstance);
    }

}