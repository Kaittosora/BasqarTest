# BasqarTest
In our project, we are using BDD Framework by using Page Object Model design pattern with Page Factory.<br/>
As per the Page Object Model, we have maintained a class for every web page. Each web page has a separate class and that class holds the functionality and members of that web page.<br/>
Using Maven for build, execution, and dependency purpose. Integrating the TestNG dependency in the POM.xml file and running this POM.xml file using Jenkins.
Using TestNG for Assertions, Grouping, and Parallel execution.<br/>
All the historical test data will be kept in an excel sheet. By using that excel sheet, we pass test data and handle data-driven testing. We use Apache POI to handle excel sheets.
We use Git as a repository to store our test scripts.<br/>
By using Jenkins CI (Continuous Integration) Tool, we execute test cases on a daily basis and also for nightly execution based on the schedule. Test Results will be sent to the peers using Jenkins.<br/>
For the reporting purpose, we are using Extent Reports. It generates beautiful HTML reports. We use the extent reports for maintaining logs and also to include the screenshots of failed test cases in the Extent Report.
