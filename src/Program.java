public class Program {
    public static void main(String[] args) {
        Familie fam1 = new Familie("Peter", "Judith");
        fam1.addKind("Günther");
        fam1.addKind("Gertrud");
        Familie fam2 = new Familie("Steve", "Karl");
        System.out.println(
                "Vater: " + fam1.getMitglied(Familie.Familienmitglied.VATER) +
                        " Mutter: " + fam1.getMitglied(Familie.Familienmitglied.MUTTER) +
                        " Kinder: " + fam1.getMitglied(Familie.Familienmitglied.KINDER));
        System.out.println(
                "Vater: " + fam2.getMitglied(Familie.Familienmitglied.VATER) +
                        " Mutter: " + fam2.getMitglied(Familie.Familienmitglied.MUTTER) +
                        " Kinder: " + fam2.getMitglied(Familie.Familienmitglied.KINDER));
    }
}
