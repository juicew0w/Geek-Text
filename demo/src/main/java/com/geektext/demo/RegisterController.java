package com.geektext.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class RegisterController {
    @Autowired
    private ProfileRepository profileRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String registerForm(Model model)
    {
        model.addAttribute("profile", new ProfileDto());
        return "register";
    }


    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute @Valid ProfileDto profileDto)
    {
        Profile newProfile = new Profile();

        newProfile.setEmail(profileDto.getEmail());
        newProfile.setPassword(passwordEncoder.encode(profileDto.getPassword()));
        newProfile.setFname(profile.getFname());
        newProfile.setLname(profile.getLname());
        newProfile.setAddress(profile.getAddress());
        newProfile.setPhone(profile.getPhone());
        profileRepo.save(newProfile);
        return "registrationResult";

    }
}
