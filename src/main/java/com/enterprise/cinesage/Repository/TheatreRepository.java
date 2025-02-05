package com.enterprise.cinesage.Repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.cinesage.Model.Theatre;

@Repository
public interface TheatreRepository extends CouchbaseRepository<Theatre, String>{
    
}
