public class SpeedReader {

    public static void main(String[] args) {
        while (true) {
            In input = new In("speed.txt");
            while (input.hasNextLine()) {
                String line = input.readLine();
                char[] characters = line.toCharArray();
                int i = 0;
                String word = "";
                while (i < characters.length) {
                    if (characters[i] == ' ') {
                        StdDraw.clear();
                        StdDraw.text(0.5, 0.5, word);
                        StdDraw.pause(250);
                        word = "";
                    } else {
                        word = word + characters[i];
                    }
                    i++;
                }
                StdDraw.clear();
                StdDraw.text(0.5, 0.5, word);
                StdDraw.pause(250);
            }
        }
    }

}
