package test1.jweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test1.jweb.models.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {

}
