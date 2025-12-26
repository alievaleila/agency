package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.ServicesDto;
import az.edu.itbrains.agency.repository.ServicesRepository;
import az.edu.itbrains.agency.services.ServicesService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicesServiceImpl implements ServicesService {

    private final ServicesRepository servicesRepository;
    private final ModelMapper modelMapper;

    public ServicesServiceImpl(ServicesRepository servicesRepository, ModelMapper modelMapper) {
        this.servicesRepository = servicesRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ServicesDto> getAllServices() {
        List<ServicesDto> servicesDtoList=servicesRepository.findAll()
                .stream().map(services -> modelMapper.map(services,ServicesDto.class))
                .collect(Collectors.toList());
        return servicesDtoList;
    }
}
