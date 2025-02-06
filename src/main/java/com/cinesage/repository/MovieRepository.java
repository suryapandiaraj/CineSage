package com.cinesage.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Movie;

@Repository
public interface MovieRepository extends CouchbaseRepository<Movie, String> {

}
