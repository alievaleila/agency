package az.edu.itbrains.agency.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDto {

    private String name;
    private String email;
    private String phoneNumber;
    private String message;
}
