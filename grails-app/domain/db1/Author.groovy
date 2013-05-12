package db1

class Author {
	String name
	static hasMany = [fiction: Book]
    static constraints = {
    }
}
