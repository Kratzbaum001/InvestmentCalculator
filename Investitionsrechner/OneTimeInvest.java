/** Class to calculate the return of a one time invest
 * @author Marcel Horn
 * @version 1.0
 */
public class OneTimeInvest {

    private double investReturn;

    public OneTimeInvest() {
    this.investReturn = 0;
    }

    /** Method calculating the return of the investment
     * @param initCapit initial capital of investment
     * @param interestRate interest rate of investment
     * @param time time of the investment in days or years
     * @param timeVersion parameter giving user decision if time is in days or years
     * @return returns investments return
     */
    public double CalculateReturn(double initCapit, double interestRate, int time, String timeVersion) {
        if (timeVersion == "days") {
            InvestForDays(initCapit, interestRate, time);
        } else if (timeVersion == "years") {
            InvestForYears(initCapit, interestRate, time);
        }
        return this.investReturn;
    }

    /** Method calculating the return if time is in days
     * @param initCapit initial capital of investment
     * @param interestRate interest rate of investment
     * @param time time of investment in days
     */
    private void InvestForDays(double initCapit, double interestRate, int time) {
        this.investReturn = initCapit * interestRate * (time / 36500);
    }

    /** Mthod calculating the return if time is in years
     * @param initCapit initial capital of investment
     * @param interestRate initerestRate of investment
     * @param time time of investment in years
     */
    private void InvestForYears(double initCapit, double interestRate, int time) {
        double tmp = initCapit * (1 + interestRate / time);
        this.investReturn = Math.pow(tmp, time);
    }
    
}
