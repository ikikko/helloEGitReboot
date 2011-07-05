import groovy.transform.Field

String b1 = 'master'

@Field String text = 'hello world'

def hello() {
	println text
}

hello()
hello()
hello()

String b2 = 'master'