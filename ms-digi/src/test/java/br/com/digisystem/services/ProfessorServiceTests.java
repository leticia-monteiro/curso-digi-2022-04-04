/*package br.com.digisystem.services;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.digisystem.entities.ProfessorEntity;
import br.com.digisystem.exceptions.ObjNotFoundException;
import br.com.digisystem.repositories.ProfessorRepository;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class ProfessorServiceTests {
	
	@Autowired
	 private ProfessorService professorService; 
	@MockBean
	private ProfessorRepository professorRepository;
	
	@Test
	void getAllTest() {
		
		List<ProfessorEntity> professorSimulado = new ArrayList<>();
		ProfessorEntity professor = new ProfessorEntity();
		professor.setCpf("12344433212");
		professor.setEmail("Email@email.com");
		professor.setNome("Nome Teste");
		professor.setTelefone("87654322");
		
		professorSimulado.add(professor);
		
		when ( professorRepository.findAll() ).thenReturn( professorSimulado );
		
		List<ProfessorEntity> lista = professorService.getAll();
		
		assertThat( professorSimulado.get(0).getCpf() )
	        .isEqualTo(lista.get(0).getCpf());
		
		assertThat( professorSimulado.get(0).getNome() )
			.isEqualTo(lista.get(0).getNome());
		
		assertThat( professorSimulado.get(0).getEmail() )
			.isEqualTo(lista.get(0).getEmail());
		
		assertThat( professorSimulado.get(0).getTelefone() )
	    .isEqualTo(lista.get(0).getTelefone());
		
	}
} */

