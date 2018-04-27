package com.professionalportfolio.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import com.professionalportfolio.doms.Project;

public class Utils {
	private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	
	public static List<Project> fetchProjects() throws IOException{
		LOGGER.info("entered - " + Thread.currentThread().getStackTrace()[1].getMethodName());
		List<Project> prjctList = new ArrayList<>();
		try{
			String r = null;
			String url = getEndpoint();
			RestTemplate rt = new RestTemplate();
			Boolean lock = true;
			int attmpts = 1;
			while(lock && attmpts < 4){
				r = rt.getForObject(url, String.class);
				if(r == null){
					Thread.sleep(5);
				} else{
					lock = false;
				}
				attmpts++;
			}
			LOGGER.info(r.toString());
			JSONArray jsonArr = new JSONArray(r);
			for(int i = 0; i < jsonArr.length(); i++){
				JSONObject j = jsonArr.getJSONObject(i);
				LOGGER.info("name - " + j.getString("name") + " - description - " + j.getString("description")
						+ "- technologies - " + j.getString("technologies") + "- appUrl - " + j.getString("appUrl")
						+ "- githubUrl - " + j.getString("githubUrl"));
				prjctList.add(new Project(j.getString("name"), j.getString("description"), j.getString("technologies"),
						j.getString("appUrl"), j.getString("githubUrl")));
			}
			return prjctList;
		} catch(Exception e){
			LOGGER.info("Europe - " + prjctList.size());
			return null;
		}
	}
	
	@SuppressWarnings({"unused"})
	public static String getEndpoint() throws IOException{
		LOGGER.info("entered - " + Thread.currentThread().getStackTrace()[1].getMethodName());
		String restfulEndpoint = "";
		InputStream configFile = null;
		try{
			Properties prop = new Properties();
			configFile = new FileInputStream(Constants.LOCAL_PROPERTIES_FILE_.getStr());
			if(configFile != null){
				prop.load(configFile);
			} else{
				throw new FileNotFoundException("property file '" + configFile + "' not found in the classpath");
			}
			restfulEndpoint = prop.getProperty("restfulEndpoint");
			LOGGER.info("restfulEndpoint - " + restfulEndpoint);
		} catch(Exception e){
			LOGGER.info("Exception: " + e);
		} finally{
			if(configFile != null){
				configFile.close();
			}
		}
		return restfulEndpoint;
	}
}
