package com.cinesage.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Theatre;

@Repository
public interface TheatreRepository extends CouchbaseRepository<Theatre, String>{
    
}
