import java.util.Arrays;

class RecursiveEqualityCheck
{   // method to recursively check for equality across n integers
    static String recursiveEqualityCheck(int[] nums, String status) 
    {
        int nNums = nums.length;
        // validate input
        if (nNums < 2) return "at least two numbers are required for comparison!";
        // base case - what my function reduces to
        if (nNums == 2)
            {
            if (nums[0] == nums[1]) return "equal";
            else return "not equal";
            }
        else
            {   
            if (nums[0] == nums[nNums - 1]) 
                {
                int[] subsetNums = Arrays.copyOfRange(nums, 0, nNums - 1);
                return recursiveEqualityCheck(subsetNums, "checking");
                }
            else
                { 
                return "not equal";
                }
            }
        
    }
    public static void main(String[] args)
    {
        int[] nums = new int[args.length];
        for (int i = 0; i < nums.length; i++) 
        {
            nums[i] = Integer.parseInt(args[i]);
        }
        String status = "checking";
        String s = recursiveEqualityCheck(nums, status);
        System.out.print(s);
    }
}