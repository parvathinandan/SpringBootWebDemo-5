package info.inetsolv.web.repo;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class CustomSimpleJpaRepository extends SimpleJpaRepository<Topic, Integer> {

	public CustomSimpleJpaRepository(JpaEntityInformation<Topic, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
			
			
	}

}
