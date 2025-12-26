package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.ContactDto;
import az.edu.itbrains.agency.model.Contact;
import az.edu.itbrains.agency.repository.ContactRepository;
import az.edu.itbrains.agency.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private  final ContactRepository contactRepository;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact=new Contact();
        contact.setEmail(contactDto.getEmail());
        contact.setName(contactDto.getName());
        contact.setPhoneNumber(contactDto.getPhoneNumber());
        contact.setMessage(contactDto.getMessage());
        contactRepository.save(contact);
    }
}
