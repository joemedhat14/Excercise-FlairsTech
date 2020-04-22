package com.example.excersise;
import static org.mockito.Mockito.when;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.excersise.dao.CountryDao;
import com.example.excersise.dao.WorldDataAccess;

@RunWith(SpringRunner.class)
@SpringBootTest
class ExcersiseApplicationTests {
	private char[] fakeCode = {'A','B','C'};
@Autowired
private WorldDataAccess worldService;

@MockBean
private CountryDao countryDao;

public void getUserTest() {
}
}
