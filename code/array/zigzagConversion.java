public class zigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows==1 || s.length()<=numRows) {
            return s;
        }
        StringBuilder[] stb = new StringBuilder[numRows];

        for(int i = 0; i<numRows; i++){
            stb[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean flag = false;

        for(int i = 0; i<s.length(); i++){
            stb[currRow].append(s.charAt(i));
            if (currRow==0 || currRow==numRows-1) {
                flag = !flag;
            }
            if (flag==false) {
                currRow-=1;
            }else{currRow+=1;}
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i<numRows; i++){
            res.append(stb[i]);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;

        String result = convert(input, numRows);

        System.out.println("Original String: " + input);
        System.out.println("Zigzag Conversion (" + numRows + " rows): " + result);
    }
}
