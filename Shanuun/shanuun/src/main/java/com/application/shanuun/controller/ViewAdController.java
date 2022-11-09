package com.application.shanuun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.shanuun.model.SetLocation;
import com.application.shanuun.model.ViewAd;
import com.application.shanuun.service.SetLocationService;
import com.application.shanuun.service.ViewAdService;

@RestController
@RequestMapping(value ="/v1/sell")
public class ViewAdController {
	
	@Autowired
	private ViewAdService service;
	
@GetMapping("/viewAdDetails")
	public List<ViewAd> listAll()
	{
		return service.listAll();
	}
	@PostMapping("/viewAdDetails")
	public void addDetails(@RequestBody ViewAd vad)
	{
		service.save(vad);
	}



}
