This is a project for CEN4072.  
This project is for the System TESTING portion of the Course project.

Burke: 11/19/2015 1:00am
Finished STC07 still need to test
Fixed server crash from bad database input by add a new method in setDB and adding
credentials to the new method RestDB(). I am thinking about adding a mode control 
to make less code 

Burke: 11/19/2015 9:45am - 
setDb: Boolean mode has been implemented set to true iff the database crashes 
Ex. STC02 rainy 3
Result two methods have been reduced to one in the setDB and every script had to be updated
Create new data pool for STC08 and STC09
Still need verification point in STC08 
STC09 is completed
probable need to look back at some of the other test scripts and add additional
verification points where each have two. 
In addition try to make all test scripts rainy day less ambiguous, there should be true 
or false for some things. test for admin and panelist are good to show they do not have 
rights to certain things but I feel closing a page is not truly valid and will short 
change us on the code coverage. 