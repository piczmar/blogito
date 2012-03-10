package blogito

class Entry {

	static constraints = {
		title()
		summary(maxSize:1000)
		dateCreated()
		lastUpdated()
	}

	String title
	String summary
	Date dateCreated
	Date lastUpdated
}
