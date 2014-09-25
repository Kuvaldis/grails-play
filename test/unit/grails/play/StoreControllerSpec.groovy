package grails.play

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(StoreController)
class StoreControllerSpec extends Specification {

    def "test something"() {
        controller.index()
        expect:
        'Welcome to the gTunes store!' == response.text
    }
}
