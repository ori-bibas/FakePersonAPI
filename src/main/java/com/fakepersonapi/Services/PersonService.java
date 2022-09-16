package com.fakepersonapi.Services;

import com.fakepersonapi.Entities.Person;
import com.fakepersonapi.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private String firstName, lastName;
    private final Random random = new Random();

    public Person createPerson() {
        long size = personRepository.count();

        int randomFirstNamePK = random.nextInt((int) size) + 1;
        int randomLastNamePK = random.nextInt((int) size) + 1;

        firstName = personRepository.getReferenceById((long) randomFirstNamePK).getFirstName();
        lastName = personRepository.getReferenceById((long) randomLastNamePK).getLastName();

        String emailAddress = createRandomEmail(firstName, lastName);
        String phoneNumber = createRandomPhoneNumber();
        String age = createRandomAge();

        Person randomPerson = new Person();
        randomPerson.setFirstName(firstName);
        randomPerson.setLastName(lastName);
        randomPerson.setEmailAddress(emailAddress);
        randomPerson.setPhoneNumber(phoneNumber);
        randomPerson.setAge(age);

        return randomPerson;
    }

    public String createRandomEmail(String firstName, String lastName) {
        StringBuilder email = new StringBuilder();

        char[] emailCharacters = {'_', '.', '-'};
        String[] domains = {"@outlook.com", "@gmail.com", "@hotmail.com", "@yahoo.com", "@icloud.com"};

        email.append(firstName.toLowerCase());
        email.append(emailCharacters[random.nextInt(emailCharacters.length)]);
        email.append(lastName.toLowerCase());
        email.append(domains[random.nextInt(domains.length)]);

        return email.toString();
    }

    public String createRandomPhoneNumber() {
        StringBuilder phoneNumber = new StringBuilder();

        phoneNumber.append(random.nextInt(9) + 1); // Phone numbers first digit cannot start with 0.
        for(int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(1, 9));
        }

        return phoneNumber.toString();
    }

    public String createRandomAge() {
        return String.valueOf(random.nextInt(85) + 16);
    }

}
