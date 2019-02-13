/**
 * Welcome to https://waylau.com
 */
package com.waylau.lite.spring.boot.starter.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.waylau.lite.spring.boot.starter.domain.User;
import com.waylau.lite.spring.boot.starter.mapper.UserMapper;

/**
 * UserMapper Tests.
 * 
 * @since 1.0.0 2019年2月14日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserMapperTests {

	static final Logger logger = LoggerFactory.getLogger(UserMapperTests.class);

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testCreatetUser() {
		User user = new User();
		user.setUsername("waylau");
		user.setPassword("123456");
		user.setEmail("waylau521@gmail.com");
		userMapper.createUser(user);
		logger.info(user.toString());
	}

	@Test
	public void testDeleteUser() {
		userMapper.deleteUser(1L);

		User userNew = userMapper.getUser(1L);
		assertNull(userNew);
	}

	@Test
	public void testUpdateUser() {
		User user = userMapper.getUser(1L);
		user.setPassword("12345678");
		user.setEmail("waylau521@gmail.com");
		userMapper.updateUser(user);

		User userNew = userMapper.getUser(1L);
		assertEquals(user.getPassword(), userNew.getPassword());
	}

	@Test
	public void testGetUser() {
		User user = userMapper.getUser(1L);
		assertEquals("waylau", user.getUsername());
	}

	@Test
	public void testGetUserByUsername() {
		User user = userMapper.getUserByUsername("waylau");
		assertEquals("waylau", user.getUsername());
	}
}
