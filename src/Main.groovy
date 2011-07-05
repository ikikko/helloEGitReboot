import groovy.transform.Field



@Field String text = 'hello world'

def hello() {
	println text
}

hello()
hello()
hello()
