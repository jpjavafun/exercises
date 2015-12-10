/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jpaisley
 */
import com.packtpub.spring.ws.javaconfig.config.HibernateConfig;
import com.packtpub.spring.ws.javaconfig.config.MyApplicationContextConfig;
import org.junit.Before;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyApplicationContextConfig.class, HibernateConfig.class})
@WebAppConfiguration
//@ContextConfiguration(loader = WebContextLoader.class, locations = {"classpath:exampleApplicationContext.xml"})
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
 
    @Autowired
    private WebApplicationContext webApplicationContext;
 
    private MockMvc mockMvc;
 
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
    
    @Test
    public void person() throws Exception {
            this.mockMvc.perform(get("/person/5").accept(MediaType.APPLICATION_JSON))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(content().string("{\"name\":\"Joe\",\"someDouble\":0.0,\"someBoolean\":false}"));
    }
 
    //Add tests here
}