package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.AboutDto;
import az.edu.itbrains.agency.repository.AboutRepository;
import az.edu.itbrains.agency.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AboutServiceImpl implements AboutService {

    private final AboutRepository aboutRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<AboutDto> getAllAbout() {
        List<AboutDto> aboutDtoList=aboutRepository.findAll().stream().
                map(about -> modelMapper.map(about,AboutDto.class)).collect(Collectors.toList());
        return aboutDtoList;
    }
}
