package com.sprintgether.vaadinstarter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class VaadinStarterApplicationTests {

	@Test
	void contextLoads() {
		boolean isContextLoaded = true;
		assertThat(isContextLoaded).isTrue();
	}

}
