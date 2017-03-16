package io.jianxun.repository.user;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import io.jianxun.domain.business.user.User;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTest {

	private static final String USERNAME = "Dune";

	@Autowired
	private UserRepository userRepository;

	@Autowired
	TestEntityManager entityManager;

	@Test
	public void userRepositoryNotNull() {
		assertThat(userRepository).isNotNull();
	}

	@Test
	public void should_find_a_user_by_name() {
		User user = new User();
		user.setUsername(USERNAME);
		user.setDeleted(true);
		entityManager.persist(user);
		User findUser = userRepository.findByUsername(USERNAME).get();
		assertThat(findUser).isNotNull();
		assertThat(findUser.getUsername()).isEqualTo(USERNAME);
		assertThat(findUser.isDeleted()).isEqualTo(true);
	}

}
