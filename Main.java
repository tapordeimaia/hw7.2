public class Main {
    public static void main(String[] args) {
        Invoice plata = new Invoice("paine", "alba", 2, 9.78);
        System.out.println(plata.getAmount(plata.getCant(), plata.getPret()));
    }
}