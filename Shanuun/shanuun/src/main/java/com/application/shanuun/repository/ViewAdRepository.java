package com.application.shanuun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.shanuun.model.ViewAd;

@Repository
public interface ViewAdRepository extends JpaRepository <ViewAd, Long>{

}
