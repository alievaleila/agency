package az.edu.itbrains.agency.services.impl;

import az.edu.itbrains.agency.dtos.TeamDto;
import az.edu.itbrains.agency.repository.TeamRepository;
import az.edu.itbrains.agency.services.TeamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<TeamDto> getAllTeam() {
        List<TeamDto> teamDtoList = teamRepository.findAll().stream().limit(3).
                map(team -> modelMapper
                        .map(team, TeamDto.class)).collect(Collectors.toList());
        return teamDtoList;
    }
}
