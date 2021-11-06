package de.telran;

public class Main {

    public static void main(String[] args) {

        LoanUser youngMan = new LoanUser("Vasya", "Vasin", 25, 40000);
        LoanUser midlMan = new LoanUser("Oli", "Carapuz", 69, 10000);
        LoanUser oldAndRichMan = new LoanUser("Porter", "Dolitel", 80, 1000000);
        LoanUser cairoNoManyMan = new LoanUser("Cairo", "Sulitan", 35, 15000);

        LoanIssuer lazyAndKindIssuer = new LoanIssuer("Maria", "Petrovna", true, true);
        LoanIssuer noLazyAndNoKind = new LoanIssuer("Doti", "Cray", false, false);
        LoanIssuer noLazyAndKind = new LoanIssuer("Titi", "Tring", false, true);
        LoanIssuer lazyAndNoKind = new LoanIssuer("Tom", "Thailor", true, false);

        System.out.println(lazyAndKindIssuer.toProvide(youngMan));//the result tels whether the issuer a loan to the user
        System.out.println(lazyAndKindIssuer.toProvide(midlMan));
        System.out.println(lazyAndKindIssuer.toProvide(oldAndRichMan));
        System.out.println(lazyAndKindIssuer.toProvide(cairoNoManyMan));

        System.out.println();
        System.out.println(noLazyAndNoKind.toProvide(youngMan));
        System.out.println(noLazyAndNoKind.toProvide(midlMan));
        System.out.println(noLazyAndNoKind.toProvide(oldAndRichMan));
        System.out.println(noLazyAndNoKind.toProvide(cairoNoManyMan));

        System.out.println();
        System.out.println(noLazyAndKind.toProvide(youngMan));
        System.out.println(noLazyAndKind.toProvide(midlMan));
        System.out.println(noLazyAndKind.toProvide(oldAndRichMan));
        System.out.println(noLazyAndKind.toProvide(cairoNoManyMan));

        System.out.println();
        System.out.println(lazyAndNoKind.toProvide(youngMan));
        System.out.println(lazyAndNoKind.toProvide(midlMan));
        System.out.println(lazyAndNoKind.toProvide(oldAndRichMan));
        System.out.println(lazyAndNoKind.toProvide(cairoNoManyMan));

        System.out.println();
        System.out.println(noLazyAndNoKind.toProvide(youngMan));
        System.out.println(noLazyAndNoKind.toProvide(midlMan));
        System.out.println(noLazyAndNoKind.toProvide(oldAndRichMan));
        System.out.println(noLazyAndNoKind.toProvide(cairoNoManyMan));

    }
}
