package org.gradle.sample

import spock.lang.Specification

class ProjectVersionTest extends Specification {
    def "Can create project version with major and minor attributes"() {
        when:
        ProjectVersion projectVersion = new ProjectVersion(1, 5)

        then:
        projectVersion.toString() == '1.5'
    }

    def "Can create project version with major and minor attributes"() {
        when:
        String timestamp = Long.toString(new Date().time)
        ProjectVersion projectVersion = new ProjectVersion(1, 5, timestamp)

        then:
        projectVersion.toString() == "1.5.${timestamp}"
    }
}