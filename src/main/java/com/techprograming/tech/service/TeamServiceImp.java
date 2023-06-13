package com.techprograming.tech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.techprograming.tech.entity.Team;
import com.techprograming.tech.repository.TeamOperationRepository;

@Service
public class TeamServiceImp implements TeamService{
	
	@Autowired TeamOperationRepository operationRepository;
	
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public List<Team> getTeamData(){
		
		 List<Team> teams = (List<Team>) operationRepository.getTeamData();
		 
		 return teams;
		
	}



	@Override
	@Transactional()
	public Team saveTeamData(Team team) throws Exception {
	    
		Team teamDetails1= operationRepository.save(team);
	
//		if(teamDetails.getLastName().equals("mittal")) {
//			throw new Exception();
//
//		}
		return teamDetails1;
	}



	@Override
	public Team getSinglePlayerData(int id) {
     Team team = (Team) operationRepository.getSingleTeamData(id);
		 
		 return team;
	}

}
