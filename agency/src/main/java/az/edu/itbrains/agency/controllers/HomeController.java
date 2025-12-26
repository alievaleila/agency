package az.edu.itbrains.agency.controllers;

import az.edu.itbrains.agency.dtos.AboutDto;
import az.edu.itbrains.agency.dtos.HeaderDto;
import az.edu.itbrains.agency.dtos.PortfolioDto;
import az.edu.itbrains.agency.dtos.ServicesDto;
import az.edu.itbrains.agency.dtos.TeamDto;
import az.edu.itbrains.agency.services.AboutService;
import az.edu.itbrains.agency.services.HeaderService;
import az.edu.itbrains.agency.services.PortfolioService;
import az.edu.itbrains.agency.services.ServicesService;
import az.edu.itbrains.agency.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HeaderService headerService;
    private final ServicesService servicesService;
    private final PortfolioService portfolioService;
    private final TeamService teamService;
    private final AboutService aboutService;

    @GetMapping("/")
    public String index(Model model) {
        HeaderDto headerDto=headerService.getAllHeaders();
        model.addAttribute("headers",headerDto);

        List<ServicesDto> servicesDtoList=servicesService.getAllServices();
        model.addAttribute("services",servicesDtoList);

        List<PortfolioDto> portfolioDtoList=portfolioService.getAllServices();
        model.addAttribute("ports",portfolioDtoList);

        List<TeamDto> teamDtoList=teamService.getAllTeam();
        model.addAttribute("teams",teamDtoList);

        List<AboutDto> aboutDtoList=aboutService.getAllAbout();
        model.addAttribute("abouts",aboutDtoList);

        return "index.html";
    }
}
