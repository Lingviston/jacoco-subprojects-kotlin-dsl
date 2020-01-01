plugins {
    jacoco
}

afterEvaluate {

    tasks.withType<JacocoReport> {
        reports {
            xml.isEnabled = false
            csv.isEnabled = false
            html.isEnabled = true
        }
    }
}