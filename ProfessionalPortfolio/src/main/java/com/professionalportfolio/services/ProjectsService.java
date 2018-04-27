package com.professionalportfolio.services;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.professionalportfolio.doms.Project;
import com.professionalportfolio.utils.Utils;

@Repository
public class ProjectsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProjectsService.class);
	
	public List<Project> getProjects(){
		LOGGER.info("entered - " + Thread.currentThread().getStackTrace()[1].getMethodName());
		List<Project> prjcts = new ArrayList<>();
		try{
			prjcts = Utils.fetchProjects();
			if(prjcts != null){
				LOGGER.info("projects size - " + prjcts.size());
				return prjcts;
			} else{
				return null;
			}
		} catch(Exception e){
			LOGGER.info("australia - " + e.getMessage());
			return null;
		}
	}
}
