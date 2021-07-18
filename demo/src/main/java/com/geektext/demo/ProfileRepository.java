package com.geektext.demo;

import org.springframework.data.repository.CrudRepository;


public interface ProfileRepository extends CrudRepository<Profile, String> {

    //Profile findByEmail(String email);

}
