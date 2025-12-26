package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.PortfolioDto;
import az.edu.itbrains.agency.repository.PortfolioRepository;
import az.edu.itbrains.agency.services.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PortfolioServiceImpl implements PortfolioService {

    private final PortfolioRepository portfolioRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<PortfolioDto> getAllServices() {
        List<PortfolioDto>portfolioDtoList=portfolioRepository.findAll().stream().limit(6).
                map(portfolio -> modelMapper
                .map(portfolio,PortfolioDto.class)).collect(Collectors.toList());

        return portfolioDtoList;
    }
}
