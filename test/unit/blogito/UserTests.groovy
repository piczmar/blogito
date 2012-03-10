package blogito
import grails.test.*
import static org.hamcrest.Matchers.*
import static org.hamcrest.MatcherAssert.assertThat

class UserTests extends GrailsUnitTestCase {

	def User user;
	protected void setUp() {
		super.setUp()
		mockDomain(User)
	}

	protected void tearDown() {
		super.tearDown()
	}
	void testShouldHaveSetAllProperties(){
		user = new User();
		assertThat user.validate(), is(false)
		println user.errors
		assertTrue("Should not allow User null properties", user.errors.hasErrors())
	}

	void testShouldAllowUserWithAllProperties(){
		user = new User(login: "login", name: "Test User",password: "password");
		assertThat user.validate(), is(true)
		println user.errors
		assertTrue("Should allow User with all properties", !user.errors.hasErrors())
	}
}
