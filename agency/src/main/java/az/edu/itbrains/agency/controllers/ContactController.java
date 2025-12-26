package az.edu.itbrains.agency.controllers;

import az.edu.itbrains.agency.dtos.ContactDto;
import az.edu.itbrains.agency.services.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping("/")
    public String addContact(@ModelAttribute("contact")ContactDto contactDto){
        contactService.addContact(contactDto);
        return "redirect:/";
    }
}
