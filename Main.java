public class Main {
    public static void main(String[] args) {
        Position pos = new Position(51.05, 13.73);
        UGV ugv = new UGV("UGV-1", pos, 100.0);
        System.out.println("UGV ID: " + ugv.getId());
        System.out.println("Position: " + ugv.getCurrentPosition().getLatitude());
    }
}
