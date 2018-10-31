package org.wecancodeit.citiesandstates;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(CityController.class)

public class CityControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CityRepository cityRepo;

	@Test
	public void shouldBeOkWhenAccessingCities() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

	@Test
	public void shouldGetHome() throws Exception {
		mockMvc.perform(get("/")).andExpect(view().name("state"));
	}

}
