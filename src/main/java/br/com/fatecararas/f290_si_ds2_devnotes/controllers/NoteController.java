package br.com.fatecararas.f290_si_ds2_devnotes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NoteController {
    
    @GetMapping("/listar")
    public String notes() {
        return "notes/listar";
    }
}
