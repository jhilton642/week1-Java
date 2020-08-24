public class Array {
    public static void main(String[] args) {

        int[] iages = new int [6];
        iages[0] =48;
                iages[1] = 20;
                        iages[2] = 22;
                        iages[3] = 25;
                        iages[4] = 24;
                        iages[5] =26;

                        int[] inums = {2, 4, 6, 8, 10, 12 };
        System.out.println(inums[2]);
        System.out.println(iages[0]);

        //for statement loop
        for(int i =0;i<iages.length;i++) {
            System.out.println("Age["+ i + "]");
            System.out.println(iages[i]);

        }
    }
}
