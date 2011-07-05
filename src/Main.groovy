import groovy.transform.Field



@Field String text = 'hello rebase world'

def hello() {
	println text
}

hello()
hello()
hello()
