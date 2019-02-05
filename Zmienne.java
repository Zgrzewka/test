public class Zmienne {
    public static void main (String args []) {
        String firstName = "Ola";
        String lastName = "Rzewu";
        final String pesel = "1234567890";
        int age =35;
        double height = 167.5;
        
        System.out.print ("Czesc ");
        System.out.print (firstName);
        System.out.print (" ");
        System.out.println (lastName);
		

        System.out.println ("Ponizej jest kilka informacji o Tobie");
        System.out.print ("Twoj PESEL to: ");
        System.out.println (pesel);
        System.out.print ("Masz ");
        System.out.print (age);
        System.out.println (" lat");

        System.out.print ("Twoj wzrost to ");
        System.out.print (height);
        System.out.println (" cm");
        
    }
}