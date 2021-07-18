package com.geektext.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/register")

public class RegisterController {
    @Autowired
    private ProfileRepository profileRepo;

    /*@GetMapping(path="/register")
    public @ResponseBody String registerForm()
    {

        return "register";
    }

    @PostMapping(path="/register")
    public String registerSubmit(@ModelAttribute Profile profile, Model model)
    {
        model.addAttribute("register", profile);
        return "registrationResult";
    } */


    public @ResponseBody String addNewProfile (@RequestParam String fname, @RequestParam String lname, @RequestParam
                                               String email, @RequestParam String address, @RequestParam String phone,
                                               @RequestParam String password)
    {
        Profile user = new Profile();
        user.setFirstName(fname);
        user.setLastName(lname);
        user.setEmail(email);
        user.setAddress(address);
        user.setPhone(phone);
        user.setPassword(password);
        profileRepo.save(user);
        return "register";

    }
}
