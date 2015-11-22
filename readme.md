This is a project for CEN4072.  
This project is for the System TESTING portion of the Course project.
The most recent changes in the read me file at the top

Burke: 11/22/2015
1) Found and fixed some verification points in several scripts is time stamped causing the verification
point to expire.
2) One or two verification points may still need to be updated
3) All data pool headers now start with caps
4) All names now start with caps so that some test will produce several results
5) STC01 - STC09 modified and retested for verification point error.
6) STC10 still beeds rainy day code written. 

Burke: 11/20/2015
STC01 complete and tested
STC02 complete and tested
STC03 complete and tested
STC04 complete and tested
STC05 complete and tested
STC06 complete and tested
STC07 complete and tested
STC08 need Sunny 1 verification point 2 redone
STC09 complete and tested
STC10 needs to be done 

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

Burke: 11/19/2015 12:30pm
Finished STC07 still need to test
Fixed server crash from bad database input by add a new method in setDB and adding
credentials to the new method RestDB(). I am thinking about adding a mode control 
to make less code 
