package com.geektext.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/register")

public class RegisterController {
    @Autowired
    private ProfileRepository profileRepo;

    @PostMapping(path="/new")
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

    }
}
