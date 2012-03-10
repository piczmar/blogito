package blogito

import grails.test.*
import java.text.SimpleDateFormat

class DateTagLibTests extends TagLibUnitTestCase {
	protected void setUp() {
		super.setUp()
		mockTagLib(DateTagLib)
	}

	protected void tearDown() {
		super.tearDown()
	}

	void testShouldDisplayDefaultIfNoFormat() {
		def formatter = new SimpleDateFormat("EEEE, MMM d, yyyy");
		def date = new Date()
		def expectedDateString = formatter.format(date);
		def taglib = new DateTagLib();
		taglib.longDate value:date,{}
		println taglib.out
		println taglib.longDate.toString()
		assertEquals(expectedDateString, taglib.out.toString());
    }
	
	void testShouldDisplayWithFormatFormat() {
		def format = "MMM d yyyy"
		def formatter = new SimpleDateFormat(format);
		def date = new Date()
		def expectedDateString = formatter.format(date);
		def taglib = new DateTagLib();
		taglib.longDate format: format,value:date, {}
		println taglib.out
		println taglib.longDate.toString()
		assertEquals(expectedDateString, taglib.out.toString());
	}
}
