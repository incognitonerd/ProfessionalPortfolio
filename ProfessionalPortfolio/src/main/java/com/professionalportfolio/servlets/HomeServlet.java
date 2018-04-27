package com.professionalportfolio.servlets;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.professionalportfolio.doms.Project;
import com.professionalportfolio.services.ProjectsService;
import com.professionalportfolio.utils.Constants;

@WebServlet(urlPatterns = "/home.do")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{ // req.setAttribute("activities", activities.getActivities()); //
		LOGGER.info("entered - " + Thread.currentThread().getStackTrace()[1].getMethodName());
		try{
			ProjectsService prjcts = new ProjectsService();
			List<Project> myProjects = prjcts.getProjects();;
			req.setAttribute("projects", myProjects);
		} catch(Exception e){
			LOGGER.info("africa - " + e.getMessage());
		}
		req.getRequestDispatcher(Constants.HOME_JSP_PATH.getStr()).forward(req, resp);
	}
}
