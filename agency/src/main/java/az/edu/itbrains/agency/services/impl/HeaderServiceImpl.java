package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.HeaderDto;
import az.edu.itbrains.agency.model.Header;
import az.edu.itbrains.agency.repository.HeaderRepository;
import az.edu.itbrains.agency.services.HeaderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeaderServiceImpl implements HeaderService {

    private final HeaderRepository headerRepository;
    private final ModelMapper modelMapper;

    @Override
    public HeaderDto getAllHeaders() {
        Header header=headerRepository.findById(2L).orElseThrow();
        HeaderDto headerDto=modelMapper.map(header,HeaderDto.class);
        return headerDto;
    }
}
