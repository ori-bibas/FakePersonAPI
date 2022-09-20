package com.fakepersonapi.Services;

import com.fakepersonapi.Entities.Address;
import com.fakepersonapi.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress() {
        long count = addressRepository.count();

        Random random = new Random();
        int randomStreetAddressPk = random.nextInt((int) count) + 1;
        int randomCityAndStatePk = random.nextInt((int) count) + 1;
        int randomZipCodePk = random.nextInt((int) count) + 1;

        Address address = new Address();
        address.setStreetAddress(addressRepository.getReferenceById((long) randomStreetAddressPk).getStreetAddress());
        address.setCity(addressRepository.getReferenceById((long) randomCityAndStatePk).getCity());
        address.setState(addressRepository.getReferenceById((long) randomCityAndStatePk).getState());
        address.setZipCode(addressRepository.getReferenceById((long) randomZipCodePk).getZipCode());

        return address;
    }

}
