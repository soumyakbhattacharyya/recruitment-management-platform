.LOG
version 1.0

key objectives
 a. document API specification using RAML 1.0
 b. use JGiven to write document scenario that captures behavior
 c. build persistence module : spring data jpa, querydsl, liquibase and mysql
 d. build persistence module test cases using h2
 e. publish the event  

technical specification
 - maven as build tool
 - cucumber as behavior driven development framework
 
   https://medium.com/@bcarunmail/set-up-and-run-cucumber-tests-in-spring-boot-application-d0c149d26220
   https://github.com/bcarun/cucumber-samples/tree/master/hello-springboot-cucumber		 

 - spring data jpa
 - spring rest controllers
 - spring state machine
 - spring oauth2
 - keycloak for security management

scenarios (MVP)
 > opening-creation - as business owner I am able to register new opening that needs to be fulfilled
   (refer Career Site Management here https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally)

 > selection-committee-formulation - as human resource I am able to set up an interview board who can conduct recruitment
   (refer Collaborative Recruiting here https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally)
	
 > resume-harvesting - as human resource I am able to create a repository of candidates so that the position can be fulfilled
   (refer : resume management section here https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally)

 > interviewing - as human resource I want to conduct interview of candidates by selection committee to gather insight about the candidate
   (refer Collaborative Recruiting here https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally)

 > candidate-evaluation - as human resource I want to collect review from interviewers to compile the report to be used by selection committee
   (refer Interviews here https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally)



resource - https://recruiterbox.com/recruitment-software-features/share-notes-evaluations-internally