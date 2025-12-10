import java.util.Stack;

class SimplifyPath{
    public static String simplifyPath(String path){
        String[] parts = path.split("/");
        Stack<String> stc = new Stack<>();

        for(String part:parts){
            if(part.equals("")||part.equals(".")){
                continue;
            }

            else if(part.equals("..")){
                if(!stc.isEmpty()){
                    stc.pop();
                }
            }

            else{
                stc.push(part);
            }
        }
        return "/"+String.join("/", stc);
    }

    public static void main(String[] args) {
        String path1 = "/home/";
        String path2 = "/a/./b/../../c/";
        String path3 = "/../";
        String path4 = "/home//foo/";

        System.out.println(SimplifyPath.simplifyPath(path1)); // Output: /home
        System.out.println(SimplifyPath.simplifyPath(path2)); // Output: /c
        System.out.println(SimplifyPath.simplifyPath(path3)); // Output: /
        System.out.println(SimplifyPath.simplifyPath(path4)); // Output: /home/foo
    }
}