public class DomaciNedelja {
    public static int[] reverse0(int[] y) {
        int[] x = new int[y.length];
        int pos = 0;
        for (int i = 0; i < x.length; i++) {
            if (y[i] != 0) {
                x[pos] = y[i];
                pos++;
            }
        }
        return x;
    }

    public static int[] arrGenerator() {
        Random r = new Random();
        int[] x = new int[r.nextInt(69)];
        for (int i = 0; i < x.length; i++)
            x[i] = r.nextInt(10);
        return x;
    }

    public static void testing() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Tests.txt"));
            for (int i = 0; i < 1000; i++) {
                int[] x = arrGenerator();
                String tmp1 = Arrays.toString(reverse0(x)).replace("[", "").replace("]", "");
                String tmp2 = Arrays.toString(x).replace("[", "").replace("]", "");
                String str = "assertEquals(new int[]{" + tmp1 + "}, reverse0(new int[]{" + tmp2 + "})";
                writer.write(str);
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testing();
    }
}
