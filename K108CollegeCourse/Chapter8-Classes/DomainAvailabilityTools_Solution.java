public class DomainAvailabilityTools_Solution {               

   private String [ ] validGtld = { ".com", ".net", ".org", ".info", ".biz"  };
   private String [ ] noSimilarNamesPermitted = { ".org", ".biz" };
   private String [ ] registeredDomain = { 
                                           "apple.com",
                                           "oracle.com",
                                           "comcast.com",
                                           "comcast.net",
                                           "comcast.info",
                                           "comcast.org",
                                           "comcast.biz",
                                           "nonprofit.org",
                                           "home.biz",
                                           "intel.com",
                                           "information.info",
                                           "RunningYourOwn.net"
                                         };
   private int numRegisteredDomains = registeredDomain.length;

   // **********************************************************************
   /**
      Default constructor sets all entries that involve domains to lower case
      to be compatible with searches which are all done in lower case
   */

   public DomainAvailabilityTools_Solution() {
         changeStringsToLowerCase(registeredDomain);
   }

   // **********************************************************************
   /**
      changeStringsToLowerCase - Change a string array's entries to lower case
      @param array      - A string array whose entries will be changed to lower case
      @return None

      This method is necessary to ensure that an array being searched for a
      gTLD or a registered domain name has the array's entries set to lower
      case. The reason is that all searches or validations are done using
      the lower case value of whatever the user entered.
   */

   public void changeStringsToLowerCase(String [ ] array) {
      int i = 0;
      for (i = 0; i < array.length; ++i) {
         array[i] = array[i].toLowerCase();
      }
   }

   // **********************************************************************

   /**
      checkIfDomainNameIsValid - Checks if a domain name is valid
      @param domainName  - The name of the domain to validate
      @return  0, the domain name is valid
               < 0, the domain name is not valid and indicates why:
                     -1, there are no periods, or >= 2 periods
                     -2, the period is the first or last character
                     -3, the second-level domain name is invalid
                     -4, the top-level domain name is invalid

      Note: This method returns an invalid indicator as soon as the
            method finds one, rather than have one return statement
            at the end of the method.
   */

   public int checkIfDomainNameIsValid(String domainName) {
      final char PERIOD   = '.';
      String searchName   = "";   // The domain name in lower case
      String secondLevel  = "";   // The aaa in aaa.bbb
      String theTld       = "";   // The bbb in aaa.bbb
      int periodPosition  = 0;
      
      boolean isDomainValid         = false;
      boolean isPeriodPositionValid = false;
      
      searchName = domainName.toLowerCase();
      periodPosition = getPeriodPosition(searchName);

      // The domain name might be valid if there is exactly one period in the
      // domain name (at location periodPosition) and the domain name does
      // not start or end with a period. Note that a period position of 0 means
      // the first character is a period, rendering the domain name invalid
      if (periodPosition <= 0) {
         return -1;
      }

      // At this point, there is exactly one period in the string, so
      // the string is not the empty string
      if ((searchName.charAt(0) == PERIOD) ||
          (searchName.charAt(searchName.length() - 1) == PERIOD)) {
         return -2;
      }
 
      // Extract the second-level domain and the top-level domain to
      // check for domain name validity
      secondLevel = searchName.substring(0, periodPosition);
      if (!hasValidSecondLevel(secondLevel)) {
         return -3;
      }
      theTld = searchName.substring(periodPosition);
      if (!checkIfTldIsValid(theTld)) {
         return -4;
      }
      
      return 0;
   }
   
   // **********************************************************************

   /**   
      getPeriodPosition - Get the position of a single period in a string
      @param   stringToSearch - The string to search for periods
      @return  N >=0, the position of the single period in the string
               N < 0, there were no periods, or two or more periods
   */
   public int getPeriodPosition(String stringToSearch) {
      int stringLength   = stringToSearch.length();
      int periodCounter  =  0;
      int periodPosition = -1;
      int i = 0;
      
      for (i = 0; i < stringLength; ++i) {
         if (stringToSearch.charAt(i) == '.') {
            ++periodCounter;
            periodPosition = i;
         }
      }

      // If there is more than one period or the domain name ends with
      // a period, indicate an incorrect domain name by setting variable
      // periodPosition to -1
      if (periodCounter != 1) {
         periodPosition = -1;
      }
      return periodPosition;
   }

   // ***********************************************************************

   /**   
      hasValidSecondLevel  - Checks if the second level domain part is valid
      @param   secondLevel - The candidate second-level domain
      @return  true  - The second-level domain is valid
               false - The second-level domain is not valid

      A valid second-level domain:
      
      1. Is between 1 and 63 characters long
      2. Contains only upper- and lower-case letters, digits 0-9 and the dash
      3. Cannot begin or end with a dash
   */
   
   public boolean hasValidSecondLevel(String secondLevel) {
      final int MAX_SECONDLEVEL_LENGTH = 63;
      final char DASH = '-';
      
      boolean isValidSecondLevel = true;    // Assume valid second-level domain
      int secondLevelLength      = secondLevel.length();
      char nextChar              = '?';
      int i = 0;
      
      // Disqualify the second-level domain if it is too short or too long, or
      // if it begins or ends with a dash
      if ((secondLevelLength >= 1) &&
          (secondLevelLength <= MAX_SECONDLEVEL_LENGTH)) {
         if ((secondLevel.charAt(0) == DASH) ||
             (secondLevel.charAt(secondLevelLength - 1) == DASH)) {
            isValidSecondLevel = false;
         }
      }
      else {
         isValidSecondLevel = false;
      }
      
      // Disqualify the second-level domain if any character is not a letter, 
      // digit, or a dash
      i = 0;
      while ((i < secondLevelLength) && (isValidSecondLevel)) {
         nextChar = secondLevel.charAt(i);
         if ((!Character.isLetterOrDigit(nextChar)) &&
             (nextChar != DASH)) {
            isValidSecondLevel = false;
         }
         ++i;
      }
      
      return isValidSecondLevel;
   }

   // ***********************************************************************

   /**   
      checkIfTldIsValid - Checks if the top-level domain part is valid
      @param   theTld - The candidate top-level domain
      @return  true   - The top-level domain is valid
               false  - The top-level domain is not valid

      A valid top-level domain begins with a period and then contains only
      upper- and lower-case letters, or digits 0-9.
   */
   
   public boolean checkIfTldIsValid(String theTld) {
      
      boolean isValidTopLevel = true;    // Assume valid top-level domain
      int topLevelLength      = theTld.length();
      char nextChar           = '?';
      int i = 0;
      
      // Disqualify the top-level domain if it is the empty string or
      // the first character is not a period

      if ((topLevelLength <= 0) ||
          (theTld.charAt(0) != '.')) {
         isValidTopLevel = false;
      }

      // Disqualify the top-level domain if any character is not a letter
      // or a digit
      i = 1;
      while ((i < topLevelLength) && (isValidTopLevel)) {
         nextChar = theTld.charAt(i);
         if (!Character.isLetterOrDigit(nextChar)) {
            isValidTopLevel = false;
         }
         ++i;
      }
      
      return isValidTopLevel;
   }

   // ***********************************************************************

   /**   
      hasAvailableDomainName - Checks if a domain name is available (not an entry
                            in the registeredDomain table)
      @param   domainName - A domain name to check for availability. Note that
                            the domain name might not be a valid domain name
      @return  true  - The domain name is available
               false - The domain name is already registered and not available
   */

   public boolean hasAvailableDomainName(String domainName) {
      String checkDomainName = "";
      boolean isAvailable    = true;
      int i = 0;
      
      checkDomainName = domainName.toLowerCase();
      i = 0;
      while ((i < numRegisteredDomains) && (isAvailable)) {
         if (checkDomainName.equals(registeredDomain[i])) {
            isAvailable = false;
         }
         else {
            ++i;
         }
      }
      
      return isAvailable;
   }
   
   // ***********************************************************************

   /**   
      getSimilarDomainNames - Get a list of domain names similar to the parameter
      @param   domainName - A VALID domain name for which to find similar domain names
      @return  "", there are no similar domain names available
               A string of domain names separated by commas of similar domain names

      The method extracts the TLD of the domain name and builds a list of
      domain names that have alternate TLDs. The method uses the validGtld
      table as the source of possible domain names. Each possible domain name
      is checked to see if it is available. If yes, it is added to the string
      of similar domain names. If not, it is ignored.

      If a TLD is one of the entries in the table noSimilarNamesPermitted,
      then no similar names are permitted and the method returns ""
   */

   public String getSimilarDomainNames(String domainName) {
      String secondLevel         = "";     // The aaa in an aaa.bbb domain name
      String theTld              = "";     // The bbb in an aaa.bbb domain name
      String similarDomainNames  = "";
      String candidateDomainName = "";
      int periodPosition         = 0;

      boolean isAvailable        = true;
      boolean isSimilarPermitted = true;
      int i = 0;
      
      // Extract the second level name. Because the domain name is assumed 
      // to be valid, there will definitely be one and only one period in 
      // the domain name.
      periodPosition = getPeriodPosition(domainName);
      secondLevel    = domainName.substring(0, periodPosition);
      theTld         = domainName.substring(periodPosition);

      // If the TLD is one for which no similar domain names are permitted,
      // do not check for similar domain names.
      
      i = 0;
      while ((i < noSimilarNamesPermitted.length) && (isSimilarPermitted)) {
         if (theTld.equals(noSimilarNamesPermitted[i])) {
            isSimilarPermitted = false;
         }
         else {
            ++i;
         }
      }
      
      if (isSimilarPermitted) {
         for (i = 0; i < validGtld.length; ++i) {
            candidateDomainName = secondLevel + validGtld[i];
            if (hasAvailableDomainName(candidateDomainName)) {
               if (similarDomainNames.length() > 0) {
                  similarDomainNames += ", ";
               }
               similarDomainNames += candidateDomainName;
            }
         }
      }
      return similarDomainNames;
   }
}