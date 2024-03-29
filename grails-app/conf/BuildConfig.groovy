grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
	// inherit Grails' default dependencies
	inherits("global") {
		// uncomment to disable ehcache
		// excludes 'ehcache'
	}
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		// uncomment the below to enable remote dependency resolution
		// from public Maven repositories
		//mavenLocal()
		mavenCentral()
		//mavenRepo "http://snapshots.repository.codehaus.org"
		//mavenRepo "http://repository.codehaus.org"
		//mavenRepo "http://download.java.net/maven/2/"
		//mavenRepo "http://repository.jboss.com/maven2/"
		mavenRepo "http://repository.codehaus.org"
	}
	dependencies {
		// specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
		test 'org.hamcrest:hamcrest-all:1.1'
		// runtime 'mysql:mysql-connector-java:5.1.5'
		// this is a synonim for XML config:
		// <groupId>mysql</groupId>
		// <artifactId>mysql-connector-java</artifactId>
		// <version>5.1.5</version>
	}
}


codenarc.reports = {
	// Each report definition is of the form:
	//	    REPORT-NAME(REPORT-TYPE) {
	//        PROPERTY-NAME = PROPERTY-VALUE
	//        PROPERTY-NAME = PROPERTY-VALUE
	//    }

	MyXmlReport('xml') {
		// The report name "MyXmlReport" is user-defined; Report type is 'xml'
		outputFile = 'target/codenarc-reports/CodeNarcReport.xml'  	// Set the 'outputFile' property of the (XML) Report
		title = 'Code Narc Report'             		// Set the 'title' property of the (XML) Report
	}
	MyHtmlReport('html') {
		// Report type is 'html'
		outputFile =  'target/codenarc-reports/CodeNarcReport.html'
		title = 'Code Narc Report'
	}
}

grails.server.port.http = 8090