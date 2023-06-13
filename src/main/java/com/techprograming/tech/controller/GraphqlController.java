package com.techprograming.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techprograming.tech.entity.Team;
import com.techprograming.tech.service.TeamService;

@Controller
public class GraphqlController {
	
	
	@Autowired TeamService  teamService;	
	
	@QueryMapping("allTeam")
	public List<Team> getTeamList(){
		
		List<Team> teamList = teamService.getTeamData();
		return teamList;
	}
	
	@QueryMapping("getTeam")
	@ResponseBody
	public ResponseEntity<Team> getSinglePlayer(@Argument int teamId ){
		
		Team singlePlayerData = teamService.getSinglePlayerData(teamId);
	
		return ResponseEntity.accepted().body(singlePlayerData);
	}
	
	
//	@PostMapping("/saveteam")
//	public ResponseEntity<Team> saveTeam(@RequestBody Team team) throws Exception{
//		
//		Team teamData = teamService.saveTeamData(team);
//		
//		return ResponseEntity.accepted().body(teamData);
//	}
	

}
