package blogito

class Entry {

	public Entry(){
		if(!properties["createTimestamp"]){
			createTimestamp = new Date();
		}
		if(!properties["modifyTimestamp"]){
			modifyTimestamp = new Date();
		}
	}
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
