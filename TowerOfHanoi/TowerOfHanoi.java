package TowerOfHanoi;

public class TowerOfHanoi {

    public static void main(String[] args) {
        int disks = 3;
        towerOfHanoi(disks, 'a', 'b', 'c');
    }

    private static void towerOfHanoi(int disks, char a, char b, char c) {

        if (disks == 1) {
            System.out.println("rod moved from "+a+ " to rod "+b);
            return;
        }
        towerOfHanoi(disks-1, a, c, b);
        System.out.println("rod moved from "+a+ " to rod "+b);
        towerOfHanoi(disks-1, c, b, a);

    }

}
