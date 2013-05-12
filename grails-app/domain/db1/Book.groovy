package db1

class Book {
	String title
	static belongsTo = [author: Author]

    static constraints = {
    }
}
