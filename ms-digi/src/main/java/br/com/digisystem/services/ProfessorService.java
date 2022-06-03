package br.com.digisystem.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.digisystem.entities.ProfessorEntity;
import br.com.digisystem.repositories.ProfessorRepository;

@Service
public class ProfessorService {

	private ProfessorRepository professorRepository;
	
	public List<ProfessorEntity> getAll(){
		return this.professorRepository.findAll();
	}
	
	public ProfessorEntity getOne(int id) {
		return this.professorRepository.findById(id).orElseThrow();
	}
	
	public ProfessorEntity save(ProfessorEntity professor) {
		return this.professorRepository.save(professor);
	}
	
	public ProfessorEntity update(int id, ProfessorEntity professor) {
		
		ProfessorEntity professorUpdate = this.professorRepository.
				findById(id).orElseThrow();
		
		professorUpdate.setCpf( professor.getCpf() );
		professorUpdate.setEmail( professor.getEmail() );
		professorUpdate.setNome( professor.getNome() );
		professorUpdate.setTelefone(professor.getTelefone() );
		
		return this.professorRepository.save(professorUpdate);
	}
	
	public void delete(int id) {
		try {
			this.professorRepository.deleteById(id);
		}
		catch (Exception e) {
			System.out.println("Erro ao deletar o registro");
		}
		
	}
} 