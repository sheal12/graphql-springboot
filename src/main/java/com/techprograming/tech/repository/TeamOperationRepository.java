package com.techprograming.tech.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techprograming.tech.entity.Team;

// jpa repositor is a best option for get data from data base rather than crud repo 
@Repository
public interface TeamOperationRepository extends JpaRepository<Team, Integer> {
	
	
	@Query(value ="select * from team",nativeQuery = true)
	Collection<Team> getTeamData();
	
	@Query(value ="select * from team t where t.team_id = :id ",nativeQuery = true)
	Team getSingleTeamData(int id );
	
}
