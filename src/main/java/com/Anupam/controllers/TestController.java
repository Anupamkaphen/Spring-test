package com.Anupam.controllers;

import com.Anupam.models.AccountDetails;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController("/v1")
public class TestController {
    private List<AccountDetails> list = new ArrayList<>();

    @GetMapping("/accountDetails")
    public List<AccountDetails> getAllAccounrtDetails(){
        return list;
    }
@PostMapping("/accountDetails")
    public void saveAccount(@RequestBody AccountDetails accountDetails){

        list.add(accountDetails);
    }
    @GetMapping("/accountDetails/{id}")
    public AccountDetails getAccount(@PathVariable int id) {
        return new AccountDetails("Sohan", true, "01/03/1993", 45679, 890, "patna");
    }
}
