
public class Customer {

    public static void main(String[] args) {

        // Object of PhonePe
        PhonePe p = new PhonePe();
        p.actRule();     // SBI rule
        p.transRule();  // SBI rule
        p.addRule();    // PhonePe rule

        System.out.println("------------------------");

        // Object of GPay
        GPay g = new GPay();
        g.actRule();     // SBI rule
        g.transRule();  // SBI rule
        g.addRule();    // GPay rule

        System.out.println("------------------------");

        // Object of PayTM
        PayTM pay = new PayTM();
        pay.actRule();     // SBI rule
        pay.transRule();  // SBI rule
        pay.addRule();    // PayTM rule
    }
}
