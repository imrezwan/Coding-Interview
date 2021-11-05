package Java.Recursion;

public class PermutationDemo {
    static int[] result ;
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        boolean[] used = new boolean[nums.length];
        result = new int[nums.length];

        permutation(nums, used, 0 );
    }

    public static void permutation(int[] nums, boolean[] used, int at){
        if(at == nums.length){
            for(int i =0 ;i<nums.length;i++){
                System.out.print(result[i]+" ");
            }
            System.out.println();
        }

        for(int i =0 ;i<nums.length;i++){
            if(!used[i]){
                used[i] = true;
                result[at] = nums[i];
                permutation(nums, used, at+1);
                used[i] = false;
            }
        }
    }

}
