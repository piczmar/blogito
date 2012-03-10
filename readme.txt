http://www.ibm.com/developerworks/java/library/j-grails01209/

- create application from shell:
grails create-app blogito

- import app. as Existing Eclipse Project in Spring STS IDE

- download Hudson http://java.net/projects/hudson/

- configure Hudson with Grails project according to: http://today.java.net/pub/a/today/2009/06/23/Grails-and-Continuous-Integration.html
* install Grails plugin
* install Cobertura plugin
* install Violations plugin



- configure maven repositories in BuildConfig.groovy: http://grails.org/1.3-M1+Release+Notes
then in STS right-click on project, choose form menu Grails Tools > Refresh Dependencies

- create domain class Entry
grails create-domain-class blogito.Entry

NOTE: Interestingly if you specify properties dateCreated, lastUpdated in domain class they are managed by default by grails GORM, so whenever you modify or create entity they are populated, see this http://aftershox.com/2011/10/17/grails-datecreated-and-lastupdated-properties/


run unit tests: grails test-app -unit

- install code coverage plugin for Cobertura
grails install-plugin code-coverage

generate Cobertura HTML reports in /target/test-reports/cobertura with command:
grails test-app -coverage 

alternatively XML reports for Hudson with: 
grails test-app -coverage -xml

- install CodeNarc plugin (kind of check-style plugin ofr Grails) http://www.grails.org/plugin/codenarc/
grails install-plugin codenarc

generate check-style reports in /target/test-reports/ with command:
grails codenarc

this should work as described: http://leanjavaengineering.wordpress.com/2010/08/25/grails-codenarc-hudson/
but I could not make it work with Violations Hudson plugin

- install functional-tests plugin

- create controller for domain class Entry
grails create-controller blogito.Entry

- install scaffolding templates  src/templates/scaffolding
grails install-templates

==============================================================================================

http://www.ibm.com/developerworks/java/library/j-grails03109/

