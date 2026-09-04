package goncalves.filme.controllers;


import goncalves.filme.models.FilmeModel;
import goncalves.filme.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/filme")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    private ResponseEntity<List<FilmeModel>> findAll(){
        List<FilmeModel> response = filmeService.findAll();
        return ResponseEntity.ok().body(response);

    }

    @GetMapping("/{id}")
    public FilmeModel buscarPorId(@PathVariable Long id){
        return filmeService.buscarPorId(id);
    }

    @PostMapping
    public FilmeModel criarFilme(@RequestBody FilmeModel filmeModel){
        return filmeService.criarFilme(filmeModel);
    }

    @DeleteMapping("/{id}")
    public void deletarFilme(@PathVariable Long id){
        filmeService.deletarFilme(id);
    }

    @PutMapping("/{id}")
    public FilmeModel atualizarFilme(@PathVariable Long id, @RequestBody FilmeModel filmeModel){
        return filmeService.atualizarFilme(id, filmeModel);
    }


}
