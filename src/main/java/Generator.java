import java.util.Random;

public class Generator {
    private String generateIntSymbols(int num) {
        String ret = "";
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            ret += (String.valueOf(random.nextInt(2)));
        }
        return ret;
    }

    private String generateDotSymbol(int num) {
        if (num == 1) {
            return ".";
        }
        return "";
    }

    String generate(int length) {
        Random random = new Random();
        Recognizer recognizer = new Recognizer();
        String generatedLine = "";
        while (true) {
            String s = "";
            int fp = random.nextInt(length)+1;
            s += generateIntSymbols(fp);
            if(random.nextInt(2)==1 && length-fp>1)
            {
                s+=".";
                s += generateIntSymbols(length-fp-1);
            }
            else{
                if(length-fp>0)
                s += generateIntSymbols(length-fp);
            }
            generatedLine = s;
            break;
        }
        return generatedLine;
    }

}