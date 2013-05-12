package db1

class Test1Controller {

	def index(){
		String out = "<form method='post' action='http://localhost:8080/db1/test1/getP'>"
		out += "<input type='text' name='testInput' value='ddd'><input type='submit' value='sumbit'>"
		out += "</form>"
		render out
	}

	def getP(){
		// def bp = Test1Controller.get(params.testInput)
		def bp = params.testInput
		render bp
	}

    def newAuthor() { 
    	def a = new Author(name: "Stephen King")
             .addToFiction(title: "IT")
             .addToFiction(title: "The Thinner")
             .save(1)

        render "working"
    }

    def getInfo(){
    	def b = Author.get(1)
    	String titles = ""
    	for (book in b.fiction) {
    		titles += book.title+"<br />"
		}

		render titles
    }
}
