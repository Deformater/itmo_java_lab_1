public class Main {
    
    public static void main(String[] args) {
        long[] c = new long[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = 24 - i * 2;
        }
        float[] x = new float[13];
        for (int i = 0; i < x.length; i++){
            x[i] = (float) Math.random() * 8 - 3;
        }
        double[][] r = new double[11][13];

        for (int i = 0; i < c.length; i++){
            for (int j = 0; j < x.length; j++){
                if (c[i] == 12){
                    r[i][j] = Math.asin(Math.sin(Math.pow(Math.E, Math.log(Math.abs(x[j])))));
                } else if (c[i] == 4 || c[i] == 8 || c[i] == 10 || c[i] == 16 || c[i] == 20){
                    r[i][j] = Math.atan(Math.sin(2 * Math.pow(Math.E, x[j])));
                } else {
                    r[i][j] = Math.cos(Math.pow((3 / 4) * Math.pow(Math.asin((x[j] + 1) / 8), 3 - Math.pow((3/4) / (Math.PI - x[j]), x[j])), 2));
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%20.5f\t", r[i][j]);
            }
            System.out.println();
        }
    }

}
