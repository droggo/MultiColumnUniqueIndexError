package error

class DomainOne {

	String controller
	String action

    static constraints = {
    	action unique: 'controller'
    }
}
