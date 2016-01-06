import error.DomainOne

class BootStrap {

    def init = { servletContext ->
    	new DomainOne(controller: 'project', action: 'update').save()
    	new DomainOne(controller: 'project', action: 'delete').save()
    	new DomainOne(controller: 'projectTask', action: 'update').save() //this will fail!
    }
    def destroy = {
    }
}
