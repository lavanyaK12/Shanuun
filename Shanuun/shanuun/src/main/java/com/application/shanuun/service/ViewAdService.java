package com.application.shanuun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.shanuun.model.SetLocation;
import com.application.shanuun.model.ViewAd;
import com.application.shanuun.repository.ViewAdRepository;

@Service
public class ViewAdService {

	@Autowired
	private ViewAdRepository repo;
	public List<ViewAd> listAll() {
        return repo.findAll();
    }
    
    public void save(ViewAd vad ) {
        repo.save(vad);
    }
    
    public ViewAd get(Long adidid) {
        return repo.findById(adidid).get();
    }
    

}
