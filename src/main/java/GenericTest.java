public class GenericTest {
    public static void main(String[] args) {
        // This is a placeholder for the main method.
        // You can add your test code here.
        System.out.println("GenericTest class is running.");

        int[] str = {1, 1, 2, 2, 2, 2, 2, 3, 3,3,3,3,3,4,5,6,3,3,2,1};
        int num = str[0];
        int count = 1;
        int countIndex = 0;
        int saveCount = 0;
        int saveCountIndex = 0;

        for(int i=1; i<str.length; i++){
            if(str[i] == num){
                count++;
            }
            else
            {
                if (count > saveCount) {
                    saveCount = count;
                    saveCountIndex = countIndex;
                }
                countIndex = i;
                count = 1;
                num = str[i];
            }
        }
        if (count > saveCount) {
            saveCount = count;
            saveCountIndex = countIndex;
        }

        System.out.println("Start index: " + saveCountIndex);
        System.out.println("Count: " + saveCount);
    }

}
