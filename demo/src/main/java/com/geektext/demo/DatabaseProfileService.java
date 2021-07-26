package com.geektext.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DatabaseProfileDetailsService implements UserDetailsService {

    private final ProfileRepository profileRepository;

    private final ProfileDetailsMapper profileDetailsMapper;

    public DatabaseProfileDetailsService(
            ProfileRepository profileRepository, ProfileDetailsMapper profileDetailsMapper) {
        this.profileRepository = profileRepository;
        this.profileDetailsMapper = profileDetailsMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Profile profileCredentials = profileRepository.findById(username);
        return profileDetailsMapper.toProfileDetails(profileCredentials);
    }
}