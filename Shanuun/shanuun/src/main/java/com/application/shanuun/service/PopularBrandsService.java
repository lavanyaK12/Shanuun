package com.application.shanuun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.shanuun.model.PopularBrands;
import com.application.shanuun.model.ViewAd;
import com.application.shanuun.repository.PopularBrandsRepository;
import com.application.shanuun.repository.ViewAdRepository;

@Service

public class PopularBrandsService {
	
	@Autowired
	private PopularBrandsRepository repo;
	public List<PopularBrands> listAll() {
        return repo.findAll();
    }
    
    public void save(PopularBrands popularbrands ) {
        repo.save(popularbrands);
    }
    
    public PopularBrands get(Long brandid) {
        return repo.findById(brandid).get();
    }
}
