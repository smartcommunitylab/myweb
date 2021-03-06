package eu.trentorise.smartcampus.citizenportal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserClassificationProvRepositoryDao extends CrudRepository<UserClassificationProv, String>{

	// All method of spring CrudRepository
	// Save, findOne, findAll, count, delete, exists

	List<UserClassificationProv> findByFinancialEdCode(String code);
	
	List<UserClassificationProv> findByFinancialEdCodeOrderByPositionAsc(String code);
	
	public UserClassificationProv findByPracticeId(String practiceId);
	
}
