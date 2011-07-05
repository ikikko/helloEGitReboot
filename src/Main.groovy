import groovy.transform.Field

String b1 = 'master'

@Field String text = 'hello rebase world'

def hello() {
	println text
}

hello()
hello()
hello()
