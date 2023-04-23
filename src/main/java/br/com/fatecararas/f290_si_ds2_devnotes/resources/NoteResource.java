package br.com.fatecararas.f290_si_ds2_devnotes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecararas.f290_si_ds2_devnotes.domain.Note;
import br.com.fatecararas.f290_si_ds2_devnotes.repositories.NoteRepository;

@RestController
@RequestMapping("/note")
public class NoteResource {

    @Autowired
    private NoteRepository repository;
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Note create(@RequestBody Note note) {
        return repository.save(note);
    }

    @GetMapping("/all")
    public List<Note> getAll() {
        return repository.findAll();
    }
}
