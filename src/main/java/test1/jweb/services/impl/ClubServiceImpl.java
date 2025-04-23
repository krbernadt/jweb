package test1.jweb.services.impl;

import test1.jweb.dto.ClubDto;
import test1.jweb.models.Club;
import test1.jweb.repository.ClubRepository;
import test1.jweb.services.ClubService;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {

    private ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }
    @Override
    public List<ClubDto> findAlClubs() {
        List<Club> clubs = clubRepository.findAll();
        return clubs.stream().map((club ) -> mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .name(club.getName())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return clubDto;
    }
}
