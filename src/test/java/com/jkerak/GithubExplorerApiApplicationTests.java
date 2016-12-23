package com.jkerak;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.sql2o.Sql2o;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GithubExplorerApiApplicationTests {

	@MockBean
	private Sql2o sql2o;


	@Test
	public void contextLoads() {
	}

}
