class oddevendef{
    static int def(int[] arr){
        int odsm = 0;
        int evsm = 0;

        for (int i : arr) {
            if (i%2!=0) {
                evsm += i;
            }
            else{
                odsm += i;
            }
        }

        return (int)Math.abs(evsm-odsm);
    }
    public static void main(String[] args){
        int[] arr = {12,11,15,14,16,17,18};
        System.out.println(def(arr));
    }
}