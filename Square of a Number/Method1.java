class Method1 {
    public static int findSquare(int num) {
        int odd = 1;
        int sq = 0;

        // convert the number to positive if it is negative
        num = Math.abs(num);

        while (num-- > 0) {
            sq = sq + odd;
            odd = odd + 2;
        }

        return sq;
    }

    public static void main(String[] args) {
        System.out.println(findSquare(8));
        System.out.println(findSquare(-4));
    }
}

// The idea is based on the fact that the square root of any number n can be
// calculated by adding odd numbers exactly n times. The relation can be
// expressed as:

// 12 = 1
// 22 = (1 + 3) = 4
// 32 = (1 + 3 + 5 = 9)
// 42 = (1 + 3 + 5 + 7) = 16