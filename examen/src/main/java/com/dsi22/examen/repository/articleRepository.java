package com.dsi22.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dsi22.examen.models.articleModel;

public interface articleRepository  extends JpaRepository<articleModel , Long>{
    
}