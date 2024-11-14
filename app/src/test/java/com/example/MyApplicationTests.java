package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void applicationContextTest() {
        MyApplication.main(new String[] {});
    }

}
