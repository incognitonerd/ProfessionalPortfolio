package junit.com.professionalportfolio.services.impl;
import com.professionalportfolio.services.impl.ProjectsServiceImpl;
import junit.framework.TestCase;

public class ProjectsServiceImplTest extends TestCase {
	public void testGetProjects(){
		ProjectsServiceImpl prjcts = new ProjectsServiceImpl();
		assertFalse(prjcts.getProjects().isEmpty());
	}
}
