package az.edu.itbrains.agency.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AboutDto {

    private String title;
    private String yearRange;
    private String description;
    private String imageUrl;
}
