package Tests;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTests {

    Employer myEmployer = new Employer("Launch Code");
    Location myLocation = new Location("tampa");
    PositionType myPositionType = new PositionType("Developer");
    CoreCompetency myCoreCompetency = new CoreCompetency("java");
    Job myJob = new Job ("Product tester",myEmployer,myLocation,myPositionType,myCoreCompetency);
    Employer myEmployer1 = new Employer("Microsoft");
    Location myLocation1 = new Location("tampa");
    PositionType myPositionType1 = new PositionType("Sr.Developer");
    CoreCompetency myCoreCompetency1 = new CoreCompetency("javaScript");
    Job myJob1 = new Job ("First job",myEmployer1,myLocation1,myPositionType1,myCoreCompetency1);

   @Test
    public void testSettingJobId(){
       //Job myJob = new Job ("Product tester",myEmployer,myLocation,myPositionType,myCoreCompetency);
       //Job myJob1 = new Job ("First job",myEmployer1,myLocation1,myPositionType1,myCoreCompetency1);


       //System.out.println(myJob.getId());
       //System.out.println(myJob1.getId());
       int i = 0;
       while(i >=10 ){
           assertEquals(i, myJob.getId(), 0.01);
           assertEquals(i, myJob1.getId(), 0.01);
           assertEquals(1, myJob1.getId() - myJob.getId(), 0.001);
       }
    }

    @Test
    public void testConstructorSetsAllFields(){

        Job job3=new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality control"),new CoreCompetency("Persistence"));
        assertEquals("Product tester" ,job3.getName());
        assertEquals("ACME",job3.getEmployer().getValue());
        assertEquals("Desert" ,job3.getLocation().getValue());
        assertEquals("Quality control" ,job3.getPositionType().getValue());
        assertEquals("Persistence" ,job3.getCoreCompetency().getValue());

    }

     @Test
    public void testJobsForEquality(){
        Job job4 =new Job("Business Analyst",new Employer("Microsoft"), new Location ("Tampa"),new PositionType("Senior"),new CoreCompetency("Persistance"));
        Job job5=new Job("Business Analyst",new Employer("Microsoft"), new Location ("Tampa"),new PositionType("Senior"),new CoreCompetency("Persistance"));
        assertEquals(false,job4==job5);
    }
}
