package com.nttdata.examen.web.rest;

import com.nttdata.examen.repository.CobGestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CobGestorController {

    @Autowired
    private CobGestorRepository cobGestorRepository;

    @GetMapping("/allconcatnames")
    public List<String> getAllConcatNames(){
        return cobGestorRepository.findByAllConcatNames();
    }

    @GetMapping("/concatname/{usuarioId}")
    public List<String> getOneConcatName(@PathVariable String usuarioId){
        return cobGestorRepository.findByConcatNameWhereUserId(usuarioId);
    }
}
