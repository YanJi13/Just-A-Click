
public class MainCaller {

    public static void main(String[] args) {
            
        new MainGUI(); // calls MainGUI

        RecordsHandling.addHeadersIfNotExist(); // creates the CSV file that records data and adds a header to it
    }
}
