package org.gradle.sample

import groovy.transform.TupleConstructor

@TupleConstructor
class ProjectVersion {
    final Integer major
    final Integer minor
    final String build

    @Override
    String toString() {
        String fullVersion = "$major.$minor"

        if(build) {
            fullVersion += ".$build"
        }

        fullVersion
    }
}