package hashGraalVm;

public class hashGraalVm {

    public static final class StringHash {

        public static void main(String[] args) {
            StringHash sh = new StringHash();
            sh.run();
        }

        void run() {
            for (int i=1; i<2_000; i++) {
                timeHashing(i, 'x');
            }
        }

        void timeHashing(int length, char c) {
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length * 1_000_000; i++) {
                sb.append(c);
            }

            final String s = sb.toString();
            final long now = System.nanoTime();
            final int hash = s.hashCode();
            final long duraration = System.nanoTime() - now;
            System.out.println("Tamanho:" +length+ "Took:" +duraration+ "milisegundos");
    }
}
}
