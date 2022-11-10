package com.application.shanuun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.shanuun.model.PopularBrands;
import com.application.shanuun.model.ViewAd;
import com.application.shanuun.service.PopularBrandsService;
import com.application.shanuun.service.ViewAdService;

@RestController
@RequestMapping("/v1/dashboard")
public class PopularBrandsController {

	@Autowired
	private PopularBrandsService service;
	
@GetMapping("/popularBrands")
	public List<PopularBrands> listAll()
	{
		return service.listAll();
	}
	@PostMapping("/popularBrands")
	public void addDetails(@RequestBody PopularBrands popularbrands)
	{
		service.save(popularbrands);
	}
}
