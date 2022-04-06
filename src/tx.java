public class tx {

        public static void main(String[] args) {
            char[][] board = {{'B', 'N', 'E', 'Y', 'S'},
                    {'H', 'N', 'D', 'E', 'S'},
                    {'S', 'G', 'N', 'D', 'E'}};

            String word = "BN";
            int x = findWordCount(board, word);
            System.out.println("x = " + x);

        }

        private static int findWordCount(char[][] board, String word) {
            int count = 0;

            for (int i = 0; i < board.length; i++) {
                String temp = "";
                for (int i1 = 0; i1 < board[0].length; i1++) {
                    temp += board[i][i1];
                }
                int countOfWord = countWord(temp, word);
                count += countOfWord;
                System.out.println("count1 = " + count);
            }

            for (int i = 0; i < board[0].length; i++) {
                String temp = "";
                for (int i1 = 0; i1 < board.length; i1++) {
                    temp += board[i1][i];
                }
                int countOfWord = countWord(temp, word);
                count += countOfWord;
                System.out.println("count2 = " + count);
            }

            for (int i = 0; i < board.length-board[0].length; i++) {
                String temp = "";
                for (int i1 = 0; i1 < board[0].length; i1++) {
                    temp += board[i1][i+i1];
                }
                int countOfWord = countWord(temp, word);
                count += countOfWord;
                System.out.println("count3 = " + count);
            }

            return count;
        }

        private static int countWord(String temp, String word) {
            int count = 0;
            for (int i = 0; i < temp.length()-word.length(); i++) {
                String s = temp.substring(i, i + word.length());
                if (s.equals(word))
                    count++;
            }
            return count;

        }

    }

