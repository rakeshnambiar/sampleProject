/**
 * Created by rakeshnbr on 27/04/2017.
 */
public class PersonalDetails {
    private static String fullName;

    public void main(String[] args) throws Exception {
        printAddress();
        printOfficeAddress();
    }

    public String getFullName(String first, String last) throws Exception {
        try{
            return first + " " + last;
        }catch (Exception e){
            throw new Exception("ERROR: While Getting the Full Name");
        }
    }

    public void printAddress() throws Exception {
        try{
            fullName = getFullName("RAKESH", "NAMBIAR");
            System.out.println("**********************************************************************************");
            System.out.println("        "+fullName);
            System.out.println("        "+"CAMBRIDGE");
            System.out.println("        "+"CAMBRIDGESHIRE");
            System.out.println("        "+"UNITED KINGDOM");
            System.out.println("**********************************************************************************");
        } catch (Exception e){
            throw new Exception("ERROR: While Print the Address");
        }
    }

    public void printOfficeAddress(){
        try{
            System.out.println("No Office Address Found!");
        }catch (Exception e){

        }
    }
}
