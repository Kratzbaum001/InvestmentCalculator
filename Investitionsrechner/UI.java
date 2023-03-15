import java.util.Scanner;

/** UI class of investment calculator
 * @author Marcel Horn
 * @version 1.0
 */
public class UI {
    
    private Scanner sc; 
    public double initCapit;
    public double interestRate;
    public int time;
    public String timeVersion;

    /** Constructor of UI class */
    public UI() {
        this.sc = new Scanner(System.in);
    }

    /** Method setting all parameters for calculation */
    public void SetAllParams() {
        SetInitCapit();
        SetInterestRate();
        SetTimeVersion();
        SetTime();
    }

    /** Method setting the initial capital */
    private void SetInitCapit() {
        System.out.print("Please enter your initial capital: ");
        this.initCapit = sc.nextDouble();
    }

    /** Method setting the interest rate */
    private void SetInterestRate() {
        System.out.print("Please enter your interest rate in percent: ");
        this.interestRate = sc.nextDouble();
    }

    /** Method setting the time of the investment in days or years */
    private void SetTime() {
        System.out.print("Please enter the time you want to invest in days or years: ");
        this.time = sc.nextInt();
    }

    /** Method setting the time versio of the investment to days or years */
    private void SetTimeVersion() {
        System.out.print("Please enter your selected time version as [days] or [years]: ");
        String tmp = sc.nextLine();
        this.timeVersion = tmp;
    }
}
