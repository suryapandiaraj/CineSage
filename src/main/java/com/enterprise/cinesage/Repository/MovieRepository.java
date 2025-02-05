package com.enterprise.cinesage.Repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.cinesage.Model.Movie;

@Repository
public interface MovieRepository extends CouchbaseRepository<Movie, String> {

}
