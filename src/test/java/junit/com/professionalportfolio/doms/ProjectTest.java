package junit.com.professionalportfolio.doms;
import org.junit.Test;
import com.professionalportfolio.doms.Project;
import com.professionalportfolio.utils.Constants;
import junit.framework.TestCase;

public class ProjectTest extends TestCase {
	Project p = new Project();
	
	@Test
	public void testSetName(){
		p.setName(Constants.STRING_TESTER.getStr());
		assertEquals(Constants.STRING_TESTER.getStr(), p.getName());
	}
	
	@Test
	public void testSetDescription(){
		p.setDescription(Constants.STRING_TESTER.getStr());
		assertEquals(Constants.STRING_TESTER.getStr(), p.getDescription());
	}
	
	@Test
	public void testSetTechnologies(){
		p.setTechnologies(Constants.STRING_TESTER.getStr());
		assertEquals(Constants.STRING_TESTER.getStr(), p.getTechnologies());
	}
	
	@Test
	public void testSetAppUrl(){
		p.setAppUrl(Constants.STRING_TESTER.getStr());
		assertEquals(Constants.STRING_TESTER.getStr(), p.getAppUrl());
	}
	
	@Test
	public void testSetGithubUrl(){
		p.setGithubUrl(Constants.STRING_TESTER.getStr());
		assertEquals(Constants.STRING_TESTER.getStr(), p.getGithubUrl());
	}
}
