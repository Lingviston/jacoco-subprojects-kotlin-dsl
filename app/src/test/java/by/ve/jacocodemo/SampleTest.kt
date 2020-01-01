package by.ve.jacocodemo

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object SampleTest : Spek({

    Feature("test") {

        Scenario("test") {

            Then("test") {
                assertThat(Sample.methodToTest()).isEqualTo(4)
            }
        }
    }
})