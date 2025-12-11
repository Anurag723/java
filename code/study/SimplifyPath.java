import java.util.Stack;

class SimplifyPath{
    // Using Pointer   
    public String simplifyPathPointer(String path) {
        String[] parts = path.split("/");
        String[] dirs = new String[parts.length];  // stores valid directories
        int idx = 0;  // pointer to current directory count
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // ignore empty or current directory
                continue;
            } else if (part.equals("..")) {
                // go up one directory if possible
                if (idx > 0) {
                    idx--;
                }
            } else {
                // add a valid directory name
                dirs[idx++] = part;
            }
        }
        
        // Build the final simplified path
        if (idx == 0) return "/";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < idx; i++) {
            sb.append("/").append(dirs[i]);
        }
        
        return sb.toString();
    }
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