package pruebaingeneo.cliente;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.google.gson.Gson;

import pruebaingeneo.controllers.ClienteController;
import pruebaingeneo.entidades.Cliente;
import pruebaingeneo.servicios.ClienteService;

/**
 * La anotacion @SpringBootTest arranca el contenedor de spring boot, lo cual permite realizar pruebas de integracion<br />
 * La anotacion @WithMockUser method to emulate running with a mocked user<br />
 * La anotacion @WebMvcTest testea un contexto web sin levantar un servidor Http completo<br />
 * 
 * @author willi
 *
 */
@WebMvcTest(ClienteController.class)
@WithMockUser
public class ClienteControllerTest {

	@MockBean
	ClienteService clienteService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testGetMapping() throws Exception {
		List<Cliente> lstClientesMock = new ArrayList<>();
		lstClientesMock.add(new Cliente((long) 1, (long) 123, "Nombres", "Apellidos"));

		when(clienteService.consultar(null)).thenReturn(lstClientesMock);

		MvcResult result = this.mockMvc.perform(get("/api/v1/cliente")).andExpect(status().isOk()).andReturn();

		@SuppressWarnings("unchecked")
		List<Cliente> lstClientesResponse = new Gson().fromJson(result.getResponse().getContentAsString(), lstClientesMock.getClass());

		boolean existeAlMenosUnCliente = lstClientesResponse != null && !lstClientesResponse.isEmpty();

		assertTrue(existeAlMenosUnCliente);

	}
}
