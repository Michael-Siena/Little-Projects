class RecursiveBaseConversion
{
    static String convertBase(int num, int base, String num_NewBase)
    {
        // argument validation
        if (base < 2) System.out.printf("%d is not a valid base", base);
        // base case
        if (num < 1) return num_NewBase;
        // recursive case
        else 
        {
            int quotient = num/base;
            num_NewBase  = (num % base) + num_NewBase;
            return convertBase(quotient, base, num_NewBase) ;
        }
    }
    
    public static void main(String[] args)
    {
        int num              = Integer.parseInt(args[0]);
        int base             = Integer.parseInt(args[1]);
        String num_NewBase   = ""; 

        num_NewBase = convertBase(num, base, num_NewBase);
        
        System.out.printf("\n%s in base %s: %s\n", num, base, num_NewBase);
    }
}