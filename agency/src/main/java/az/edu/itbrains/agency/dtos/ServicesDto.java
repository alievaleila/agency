package az.edu.itbrains.agency.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServicesDto {

    private  String name;
    private  String description;
    private  String icon;
}
