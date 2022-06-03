//package br.com.digisystem.controllers;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.ResultActions;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import br.com.digisystem.dtos.UsuarioDTO;
//
//@ExtendWith(SpringExtension.class)
//@AutoConfigureMockMvc
//@SpringBootTest
//public class ProfessorControllerTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	private ObjectMapper mapper = new ObjectMapper();
//	
//	@Test
//	void getAllTest() throws Exception {
//		
//		ResultActions response = mockMvc.perform(
//				get("/usuarios")
//				.contentType("application/json")
//		);
//		
//		MvcResult result = response.andReturn();
//		String resultStr = result.getResponse().getContentAsString();
//		//System.out.println(resultStr);
//		
//		UsuarioDTO[] lista = mapper.readValue(resultStr, UsuarioDTO[].class);
//		
//		assertThat(lista).isNotEmpty();
//		assertThat( result.getResponse().getStatus() ).isEqualTo( HttpStatus.OK.value() );
//	}
//	
//	@Test
//	void getOneTest() throws Exception {
//		
//		int id = 3;
//		
//		ResultActions response = mockMvc.perform(
//				get("/usuarios/" + id)
//				.contentType("application/json")
//		);
//		
//		MvcResult result = response.andReturn();
//		String resultStr = result.getResponse().getContentAsString();
//		
//		UsuarioDTO usuario = mapper.readValue(resultStr, UsuarioDTO.class);
//		
//		assertThat( usuario.getId() ).isEqualTo(id);
//		assertThat( result.getResponse().getStatus() ).isEqualTo( HttpStatus.OK.value() );
//		
//	}
//	
//	@Test
//	void createTest() throws Exception {
//		
//		// criar um usuarioDTO para enviar no corp da requisição
//		
//		UsuarioDTO usuario = new UsuarioDTO();
//		
//		usuario.setNome("Fabrizio JUNIT");
//		usuario.setEmail("junit@fabrizio.com");
//		
//		ResultActions response = mockMvc.perform(
//				post("/usuarios")
//				.contentType("application/json")
//				.content( mapper.writeValueAsString(usuario) )
//		);
//		
//		MvcResult result = response.andReturn();
//		String resultStr = result.getResponse().getContentAsString();
//		
//		UsuarioDTO usuarioSalvo = mapper.readValue(resultStr, UsuarioDTO.class);
//		
//		assertThat( usuarioSalvo.getId() ).isPositive();
//		assertThat( usuarioSalvo.getNome() ).isEqualTo( usuario.getNome() );
//		assertThat( usuarioSalvo.getEmail() ).isEqualTo( usuario.getEmail() );
//		assertThat( result.getResponse().getStatus() ).isEqualTo( HttpStatus.OK.value() );
//		
//	}
//	
//	
//}
