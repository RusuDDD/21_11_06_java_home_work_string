package de.telran;

import com.sun.source.tree.BreakTree;

public class LoanIssuer {
    String name;
    String surname;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(LoanUser user) {
        //TODO implement
        // esli rabotnik lenivii , on adobrit kredit v slucee,esli u klienta zp bolsche 20000 v god.
        // esli rabotnik nelenivii i dobrii, on aformet kredit, eslizp bolische 20000 iklientu ne bolsche 70
        // esli rabotnic nelenivii i zloi, on aformet kredit, eslizp bolische 20000 iklientu ne bolsche 50

        if (isLazy && user.anualSalary > 20000 ||isKind && user.anualSalary > 20000 && user.age < 70||user.anualSalary > 20000 && user.age < 50 ) {
            return true;
        } else
            return false;

    }
}


