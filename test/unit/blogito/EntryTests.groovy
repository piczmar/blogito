package blogito

import grails.test.*
import static org.hamcrest.Matchers.*
import static org.hamcrest.MatcherAssert.assertThat

class EntryTests extends GrailsUnitTestCase {

	def entry = null;
	protected void setUp() {
		super.setUp()
		mockDomain(Entry)
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testShallNotCreateEntryWithNullTitle(){
		entry = new Entry(createTimestamp: new Date(),modifyTimestamp: new Date(), summary: "Test")
		assertThat entry.validate(), is(false)
		println entry.errors
		assertTrue("Shall not allow Entry with null title", entry.errors.hasErrors())
	}

	void testShallNotCreateEntryWithEmptyTitle(){
		entry = new Entry(title: "", createTimestamp: new Date(),modifyTimestamp: new Date(), summary: "Test")
		assertThat entry.validate(), is(false)
		println entry.errors
		assertTrue("Shall not allow Entry with blank title", entry.errors.hasErrors())
	}

	void testShallNotCreateEntryWithSummaryTooLong() {
		def maxLength=1000
		entry = new Entry(title: "An Entry" , createTimestamp: new Date(),modifyTimestamp: new Date(), summary: getLongText(maxLength))
		assertThat entry.validate(), is(false)
		println entry.errors
		assertTrue("Shall not allow Entry with summary longer than "+maxLength, entry.errors.hasErrors())
		assertThat entry.errors.getFieldError('summary').toString(), containsString("exceeds the maximum size")
	}

	void testShallGenerateTimestamps() {
		entry = new Entry(title: "An Entry",summary: "Summary")
		assertThat entry.validate(), is(true)
		println entry.errors
		assertTrue("Shall generate timestamps if not given for Entry", !entry.errors.hasErrors())
	}



	private String getLongText(int maxLength){
		def tooLongText = ""
		for ( i in 0..maxLength ) {
			tooLongText += 'x'
		}
		return tooLongText
	}
}
