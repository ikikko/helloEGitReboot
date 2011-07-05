import groovy.transform.Field



@Field String text = 'hello'

def hello() {
	println text
}

hello()
hello()