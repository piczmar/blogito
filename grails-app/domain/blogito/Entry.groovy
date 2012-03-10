package blogito

class Entry {

	static constraints = {
		title(nullable: false, blank: false)
		summary(maxSize:1000)
		createTimestamp()
		modifyTimestamp()
	}

	String title
	String summary
	Date createTimestamp
	Date modifyTimestamp
}
