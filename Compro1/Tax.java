import java.util.Scanner;
public class Tax {
    public static void main(String[] args){
        //PROBLEM 3.
        //PRINT HEADER
        System.out.println("Taxable        Single         Married Joint       Married        Head of");
        System.out.println("Income                        or Qualifying       Separate       House hold");
        System.out.println("                              Widow(er)");
        System.out.println("************************************************************************");

        //tabale income with intervals of $50 for all the following status
        for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {

            //round the tax into integers
            long taxSingle = Math.round(computeTax(0, taxableIncome));
            long taxJoint = Math.round(computeTax(1, taxableIncome));
            long taxSeparate = Math.round(computeTax(2, taxableIncome));
            long taxHead = Math.round(computeTax(3, taxableIncome));

            //PRINT NUMBERS
            System.out.printf("%-15.0f%-15d%-20d%-15d%-15d\n", taxableIncome, taxSingle, taxJoint, taxSeparate, taxHead);

        }
    }

    //PROBLEM 3.
    public static double computeTax(int status, double taxableIncome) {

        //COMPUTE TAX
        double tax = 0;

        //STATUS 0: SINGLE
        if (status == 0) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10; //TAX AT 10%
            } else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15; //TAX AT 15%
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25; //TAX AT 25%
            }
        }
        // STATUS 1: MARRIED JOINT OR QUALIFYING WIDOW(ER)
        if (status == 1) {
            if (taxableIncome <= 16700) {
                tax = taxableIncome * 0.10; //TAX AT 10%
            } else if (taxableIncome <= 67900) {
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15; // TAX AT 15%
            } else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (taxableIncome - 67900) * 0.25; //TAX AT 25%
            }
        }

        //STATUS 2: MARRIED SEPARATE
        if (status == 2) {
            if (taxableIncome <= 8350) {
                tax = taxableIncome * 0.10; //TAX AT 10%
            } else if (taxableIncome <= 33950) {
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15; // TAX AT 15%
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25; //TAX AT 25%
            }
        }

        // STATUS 3: HEAD OF HOUSE HOLD
        if (status == 3) {
            if (taxableIncome <= 11950) {
                tax = taxableIncome * 0.10; // TAX AT 10%
            } else if (taxableIncome <= 45500) {
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;  // TAX AT 15%
            } else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25; // TAX AT 25%
            }
        }

        return tax; // RETURN TAX

    }
}
