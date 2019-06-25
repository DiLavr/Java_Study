import java.util.Scanner;

public class DomainAvailabilityMain {

  // ***********************************************************************

   /**   
      getString - Prompts for an input string from the user
      @param   input  - the source of the input (a Scanner object)
      @param   prompt - the prompt to show the user
      @return  The string entered by the user (which could be empty)
   */
 
   public static String getString(Scanner input, String prompt) {
      String userInput;
      
      System.out.println(prompt);
      userInput = input.nextLine();

      return userInput;
   } 

  // ***********************************************************************

  public static void main (String [ ] args) { 
      final String PROMPT_DOMAIN_NAME = 
            "\nEnter a domain name to check availability (Enter to exit): ";
      Scanner scnr = new Scanner(System.in);
      DomainAvailabilityTools_Solution dvTools = new DomainAvailabilityTools_Solution();

      String inputName    = "";
      String similarDomainNames     = "";   // Alternatives to a registered domain name
      boolean isDomainNameValid     = false;
      boolean isDomainNameAvailable = false;

      // Get the first domain name to process
      inputName = getString(scnr, PROMPT_DOMAIN_NAME);

      while (inputName.length() > 0) {

         isDomainNameValid = (dvTools.checkIfDomainNameIsValid(inputName) == 0);
  
         // Display the results
         System.out.print("\"" + inputName + "\" ");
         if (isDomainNameValid) {
            System.out.print("is ");
            // If the domain name is available, say so. If not, say so but
            // include similar domain names, if any.
            isDomainNameAvailable = dvTools.hasAvailableDomainName(inputName);
            if (isDomainNameAvailable) {
               System.out.println("available.");
            }
            else {
               System.out.println("not available.");
               similarDomainNames = dvTools.getSimilarDomainNames(inputName);
               if (similarDomainNames.length() > 0) {
                  System.out.println(
                        "The following similar names are available: \n" + 
                        similarDomainNames);
               }
               else {
                  System.out.println(
                        "No available similar domain names were found.");
               }
            }
         }
         else {
            System.out.println("is not a valid domain name.");
         }

         // Get the next domain name to process
         inputName = getString(scnr, PROMPT_DOMAIN_NAME);
       }     
       return;
   } 
}