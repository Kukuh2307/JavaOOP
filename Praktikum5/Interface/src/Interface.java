public class Interface {
    public static void main(String[] args) {
        Radio medium = new Radio("Panasonic");
        PlayStation ps4 = new PlayStation("4");
        medium.on();
        medium.off();
        ps4.on();
        ps4.off();
    }
}
