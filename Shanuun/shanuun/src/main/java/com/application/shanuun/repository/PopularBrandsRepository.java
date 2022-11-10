package com.application.shanuun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.shanuun.model.PopularBrands;

@Repository
public interface PopularBrandsRepository extends JpaRepository<PopularBrands, Long> {

}
