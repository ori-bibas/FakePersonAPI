package com.fakepersonapi.Controllers;

import com.fakepersonapi.Entities.Address;
import com.fakepersonapi.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    public Address address() {
        return addressService.createAddress();
    }

}
