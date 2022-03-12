public class MegabyteCoverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-2500);
        printMegaBytesAndKiloBytes(-500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(25500);
        printMegaBytesAndKiloBytes(1024102410);

    }
        public static void printMegaBytesAndKiloBytes(int kiloBytes) {
            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            } else {
//login cant be outside coz its says VOID which does not return anything....
                int megaBytes = kiloBytes / 1024;
                int remainder = kiloBytes % 1024;
                System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
            }
        }
    }
