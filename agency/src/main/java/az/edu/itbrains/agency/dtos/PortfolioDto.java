package az.edu.itbrains.agency.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDto {

    private String title;
    private String subtitle;
    private String imageUrl;

}
