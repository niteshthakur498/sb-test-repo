package com.nitesh.test.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void testTESTEndpoint() throws Exception {
		mockMvc.perform(get("/test-service/api/test")).andExpect(status().isOk());
	}

	@Test
	void testTEST2Endpoint() throws Exception {
		mockMvc.perform(get("/test-service/api/test1")).andExpect(status().isOk()).andExpect(content().string("Yes I am also working..."));
	}
}
