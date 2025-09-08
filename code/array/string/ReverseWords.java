package string;

class ReverseWords{
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);

            if(i!=0){
                sb.append(" ");
            }
        }

        

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("  hello world  "));       // "world hello"
        System.out.println(new ReverseWords().reverseWords("a good   example"));      // "example good a"
        System.out.println(new ReverseWords().reverseWords("    "));                  // ""
        System.out.println(new ReverseWords().reverseWords("one"));                   // "one"
        System.out.println(new ReverseWords().reverseWords("  multiple   spaces "));  // "spaces multiple"

    }
}