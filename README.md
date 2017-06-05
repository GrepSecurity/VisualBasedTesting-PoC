# VisualBasedTesting-PoC
Automated Visual Based Testing with Katalon Studio and Sentinela API

<b>What is Visual Based Testing</b><br>
In simple terms, It's nothing but testing GUI of an application. Question for you, How will you test the GUI of an application? 
Let's say you've an application which has a good design. In process of regression tests we need to verify whether the design of the 
application wasn't disturbed due to iterative builds. Do this manually would be tedious isn't it? So what if Automation helps you in finding the design issues? Well Sentinela along with Webdriver helps us

<b>What is Katalon Studio</b><br>
Katalon Studio is a Free powerful test automation toolset for testers & developers solving many challenges we face in Test 
Automation. This tool can be used for Functional Testing (Web & Mobile), Webservices Testing as well. Katalon Studio hides all 
technical complexities and provides us powerful & friendly UI with the manual mode.
Source: https://www.katalon.com/

<b>What is Sentinela</b><br>
Sentinela compare the captured image with the baseline image. If we don't have baseline image, then Run Sentinela to capture the 
first baseline image. From the next run, it will compare the images with baseline and generates a report (Extent Report) showing the 
difference within the image

Sentinela Source: https://github.com/saraivaugioni/sentinela
Documentation: https://sentinel-a.github.io/

<b>PoC Explanation</b><br>
For the PoC purpose, I've automated demo site owned by Katalon Studio team. You may need to execute the testcases 'Demo GUI 
Testcase01 & 02' or the Testsuite 'VBT suite'. Before executing you need to delete the folders 'VBTImages' and 'VisualBasedReports' 
present in the workspace if exists.  

The First testcase Demo GUI Testcase01 would lanuch application and capture the baseline image which would be stored in 
'VBTImages' folder. Since it's a first run there are no images to compare so there will no report generated.
When you execute the second testcase Demo GUI Testcase002, Katalon would capture the image and Sentinela compares the 
image with baseline image. And also Sentinela shows the diff in the report. After the execution, you may view the report generated 
in the working directory of the project <br> 

Reports Folder: 'VisualBasedReports' <br>
Reports Location: Current Working Directory <br>
Required External Jars:<br> 
extentreports-2.41.0.jar<br> 
freemarker-2.3.23.jar<br> 
sentinela.jar<br> 
