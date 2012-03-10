http://www.ibm.com/developerworks/java/library/j-grails01209/

- create application from shell:
grails create-app blogito

- import app. as Existing Eclipse Project in Spring STS IDE

- download Hudson http://java.net/projects/hudson/

- configure Hudson with Grails project according to: http://today.java.net/pub/a/today/2009/06/23/Grails-and-Continuous-Integration.html
* install Grails plugin
* install Cobertura plugin



- configure maven repositories in BuildConfig.groovy: http://grails.org/1.3-M1+Release+Notes
then in STS right-click on project, choose form menu Grails Tools > Refresh Dependencies

run unit tests: grails test-app -unit

- install code coverage plugin for Cobertura
grails install-plugin code-coverage

generate Cobertura HTML reports in /target/test-reports/cobertura with command:
grails test-app -coverage 

alternatively XML reports for Hudson with: 
grails test-app -coverage -xml

- install functional-tests plugin