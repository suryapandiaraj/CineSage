package com.enterprise.cinesage.Service;

import org.springframework.stereotype.Service;

import com.enterprise.cinesage.Model.Celebrity;
import com.enterprise.cinesage.Repository.CelebrityRepository;

@Service
public class CelebrityService {

    private CelebrityRepository celebrityRepository;

    public String addCelebrity(Celebrity celebrity) {
        celebrityRepository.save(celebrity);
        return "Celebrity saved!";
    }

    public Celebrity getCelebrity(String celebrityId) {
        return celebrityRepository.findById(celebrityId).get();
    }

}
