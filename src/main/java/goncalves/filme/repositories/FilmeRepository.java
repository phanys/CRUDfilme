package goncalves.filme.repositories;

import goncalves.filme.models.FilmeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<FilmeModel, Long> {

}
