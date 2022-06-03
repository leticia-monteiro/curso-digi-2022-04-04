package br.com.digisystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.digisystem.entities.ProfessorEntity;
import br.com.digisystem.services.ProfessorService;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("professores")
	public List<ProfessorEntity> getAll(){
		return this.professorService.getAll();
	}
	
	@GetMapping("professores/{id}")
	public ProfessorEntity getOne(@PathVariable int id) {
		return this.professorService.getOne(id);
	}
	
	@PostMapping("professores")
	public ProfessorEntity create(@RequestBody ProfessorEntity professor) {
		return this.professorService.save(professor);
	}
	
	@PatchMapping("professores/{id}")
	public ProfessorEntity update(@PathVariable int id, 
			@RequestBody ProfessorEntity professor) {
		return this.professorService.update(id, professor);
	}
	
	@DeleteMapping("professores/{id}")
	public void delete(@PathVariable int id) {
		this.professorService.delete(id);
	}
}