package blogito

class User {
	static constraints = {
		login(unique:true)
		password(password:true)
		name()
	}

	static hasMany = [entries:Entry]

	String login
	String password
	String name

	String toString(){
		name
	}
}
