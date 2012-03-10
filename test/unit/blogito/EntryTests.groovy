package blogito

import grails.test.*
import static org.hamcrest.Matchers.*
import static org.hamcrest.MatcherAssert.assertThat

class EntryTests extends GrailsUnitTestCase {
	
	def entry = null;
	protected void setUp() {
		super.setUp()
		mockDomain(Entry)
		entry = new Entry(title: "An Entry" )
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testShallNotCreateEntryWithEmptyTitle(){
		entry = new Entry()
		assertThat entry.validate(), is(false)
		assertNotNull entry.errors.getFieldError('title')
	}
	
	void testShallNotCreateEntryWithSummaryTooLong() {
		def tooLongText = getLongText()
		println(tooLongText)
		entry.summary = tooLongText

		assertThat entry.validate(), is(false)
		assertThat entry.errors.getFieldError('title'), is(null)
	}
	
	
	
	private String getLongText(){
		def tooLongText = ""
		for ( i in 0..1000 ) {
			tooLongText += 'x'
		}
		return tooLongText
	}
}
