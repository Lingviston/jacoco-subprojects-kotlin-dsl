# jacoco-subprojects-kotlin-dsl

## Target
To have Jacoco test coverage reports configured in a single place for all modules within the project. Enabled only HTML report.

## Solutions

Not working solutions (all types of reports are generated):

https://github.com/Lingviston/jacoco-subprojects-kotlin-dsl/commit/91aa33f22d344ad2aca67fa3121f62e3b8b53594

https://github.com/Lingviston/jacoco-subprojects-kotlin-dsl/commit/249ff86ea63da182152ccd06fd701e960fbe0976

Working solution (only HTML report is generated):

https://github.com/Lingviston/jacoco-subprojects-kotlin-dsl/commit/4a18b6cd16c977d05d224b89c64c6efd6d3ac3ab

## Questions

1. Why does it require two afterEvaluate blocks (within subprojects module and within precompiled script)?
2. Is it a correct approach to achieve the goal?

## Notices

1. This project is a minimal scope of the real project, which demonstrated the issue;
2. Real project has several modules. One module left for this demo, cause it is enough to demonstrate the issue with csv and xml reports being generated even though they were disabled. Please, keep in mind that the target is to have it working properly in multimodule environment;
3. JUnit 5 plugin required to make Jacoco generate default tasks.
