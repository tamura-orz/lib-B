/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'root' at '16/12/19 10:54' with Gradle 2.4
 *
 * @author root, @date 16/12/19 10:54
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
