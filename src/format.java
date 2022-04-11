public class format {

        static int start =    1;
        public static void main(String[] args) {
            if(start<=100) {

                System.out.printf("%d ", start++);
                main(null);
            }
        }
    }

