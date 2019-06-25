/**
 * =====Methods with reference variables as parameters.=====

A reference variable is a variable that points to, or refers to, an object or array. 
Internally, a reference variable stores a reference, or the memory location, of the object to which it refers. 
A programmer can only access the data or functionality provided by objects through the use of reference variables.
Because reference variables store object locations and not the object data itself, passing a reference variable as
a method argument assigns the argument's stored reference to the corresponding method parameter. 
Similarly, returning a reference variable returns an object reference.
 * @author Cosmopus
 *
 */


public class TimeTravelingAstronaut {
   public static Double calcTimeElapsed(Double speedRatio, Integer time) {
          // Lorentz factor (source: Wikipedia.org)
          Double lorentzFactor = 1.0 / Math.sqrt(1 - (Math.pow(speedRatio, 2)));
          Double timeElapsed = time * lorentzFactor;
          
          return timeElapsed;
   }
   
   public static void main(String[] args) {
          Double astronautSpeed = 0.9; // % of the speed of light
          Integer travelTime = 10; // In years
          Double earthTime = 0.0; // In years
          
          earthTime = calcTimeElapsed(astronautSpeed, travelTime);
          
          System.out.println(earthTime +
                             " years have passed on Earth!");
          
          return;
   }
}