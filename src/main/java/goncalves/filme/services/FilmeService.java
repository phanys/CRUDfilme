package goncalves.filme.services;

import goncalves.filme.models.FilmeModel;
import goncalves.filme.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<FilmeModel> findAll(){
        return filmeRepository.findAll();
    }

    public FilmeModel buscarPorId(Long id){
        return filmeRepository.findById(id).get();
    }

    public FilmeModel criarFilme(FilmeModel filmeModel) {
        return filmeRepository.save(filmeModel);
    }

    public void deletarFilme(Long id){
        filmeRepository.deleteAllById(id);
    }

    public FilmeModel atualizarFilme(Long id, FilmeModel filmeModel){
        FilmeModel filme = filmeRepository.findAllById(id).get();
        filme.setNome(filmeModel.getNome());
        filme.setGenero(filmeModel.getGenero());
        filme.setDiretor(filmeModel.getDiretor());
        filme.setEstudio(filmeModel.getEstudio());
        return filmeRepository.save(filme);
    }
}
