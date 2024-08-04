package com.example.kadai07.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.kadai07.entity.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{
	
	public List<Artist> findAll();

}
