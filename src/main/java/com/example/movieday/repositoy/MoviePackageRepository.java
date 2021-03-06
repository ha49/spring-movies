package com.example.movieday.repositoy;

import com.example.movieday.domain.Movie;
import com.example.movieday.domain.MoviePackage;
import com.example.movieday.domain.MovieRating;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MoviePackageRepository extends CrudRepository<MoviePackage, String> {

  Optional<MoviePackage> findByName(@Param("name") String name);
  Optional<MoviePackage> findById(String id);

  Iterable<MoviePackage> findAll();

  Iterable<MoviePackage> findAllById(Iterable<String> iterable);

  long count();

  MoviePackage save(MoviePackage moviePackage);


  void deleteByName(String name);


  void delete(MoviePackage moviePackage);


  void deleteAll();




}