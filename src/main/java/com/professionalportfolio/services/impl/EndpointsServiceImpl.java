package com.professionalportfolio.services.impl;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.professionalportfolio.doms.Endpoint;
import com.professionalportfolio.services.EndpointsService;
import com.professionalportfolio.utils.Utils;

@Repository
public class EndpointsServiceImpl implements EndpointsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EndpointsServiceImpl.class);
	
	@Override
	public List<Endpoint> getEndpoints(){
		LOGGER.info("entered - " + Thread.currentThread().getStackTrace()[1].getMethodName());
		List<Endpoint> results = new ArrayList<>();
		try{
			results = Utils.fetchEndpoints();
			if(results != null){
				LOGGER.info("projects size - " + results.size());
				return results;
			} else{
				return null;
			}
		} catch(Exception e){
			LOGGER.info("australia - " + e.getMessage());
			return null;
		}
	}
}
