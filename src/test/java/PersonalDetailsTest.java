import org.junit.Test;

/**
 * Created by rakeshnbr on 27/04/2017.
 */
public class PersonalDetailsTest {
    @Test
    public void addressCheck() throws Exception {
        try{
            PersonalDetails personalDetails = new PersonalDetails();
            personalDetails.printAddress();
        }catch (Exception e){
            throw new Exception("ERROR: While Testing the Address method");
        }
    }
}
