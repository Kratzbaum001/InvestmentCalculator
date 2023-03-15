
/** Main class of investment calculator
 * @author Marcel Horn
 * @version 1.0
 */
public class Main {

    /** Main method of investment calculator
     * @param args array of Strings (can be empty)
     */
    public static void main (String[] args) {
        UI ui = new UI();
        OneTimeInvest oti = new OneTimeInvest();
        
        ui.SetAllParams();
        if (ui.timeVersion == "days") {

        } else if (ui.timeVersion == "years") {

        }
    }
}
