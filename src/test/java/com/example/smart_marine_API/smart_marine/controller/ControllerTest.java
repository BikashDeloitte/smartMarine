package com.example.smart_marine_API.smart_marine.controller;

import com.example.smart_marine_API.smart_marine.entity.Ports;
import com.example.smart_marine_API.smart_marine.service.PortsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc
@SpringBootTest
class ControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private PortsService portsService;

    @Test
    public void getAllPortsTest() throws Exception {
        List<Ports> result = Arrays.asList(
                new Ports(1L,"Port Of Fernandina",30.6765, -81.4625),
                new Ports(2L,"Red Hook Terminal", 40.6840, -74.0062));
        Mockito.when(portsService.getAllPorts()).thenReturn(result);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("http://localhost:8081/ports")
                .accept(MediaType.APPLICATION_JSON);

        MockHttpServletResponse result1 = mockMvc.perform(requestBuilder).andReturn().getResponse();
        assertEquals(200,result1.getStatus());

    }
}