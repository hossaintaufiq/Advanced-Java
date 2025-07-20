



import java.util.*;
import java.util.stream.*;

public class ArrayUtils {

    // ========================================
    // ===== 1️⃣ 1D ARRAY METHODS ============
    // ========================================

    /**
     * Calculates the sum of a 1D int array.
     */
    public static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    /**
     * Finds the maximum value in a 1D int array.
     */
    public static int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    /**
     * Finds the minimum value in a 1D int array.
     */
    public static int min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    /**
     * Builds prefix sum array for a 1D int array.
     * prefix[0] = 0; prefix[i] = sum of first i elements.
     */
    public static int[] prefixSum(int[] arr) {
        int[] prefix = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        return prefix;
    }

    /**
     * Reverses a 1D int array in place.
     */
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * Sorts a 1D int array in ascending order.
     */
    public static void sortAsc(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * Sorts a 1D Integer array in descending order.
     */
    public static void sortDesc(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
    }

    /**
     * Copies an array to a new array of newLength.
     */
    public static int[] copyOf(int[] arr, int newLength) {
        return Arrays.copyOf(arr, newLength);
    }

    /**
     * Copies a range from an array (from inclusive, to exclusive).
     */
    public static int[] copyOfRange(int[] arr, int from, int to) {
        return Arrays.copyOfRange(arr, from, to);
    }

    /**
     * Binary search on a sorted 1D int array.
     * Returns index of key if found, else (-insertion_point - 1).
     */
    public static int binarySearch(int[] arr, int key) {
        return Arrays.binarySearch(arr, key);
    }

    /**
     * Fills an entire array with a given value.
     */
    public static void fill(int[] arr, int value) {
        Arrays.fill(arr, value);
    }

    /**
     * Fills a portion of an array with a given value.
     * from (inclusive), to (exclusive)
     */
    public static void fill(int[] arr, int from, int to, int value) {
        Arrays.fill(arr, from, to, value);
    }

    /**
     * Checks if two 1D arrays are equal.
     */
    public static boolean equals(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    /**
     * Converts an int[] to List<Integer>.
     */
    public static List<Integer> toList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    /**
     * Converts a List<Integer> to int[].
     */
    public static int[] fromList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Counts frequency of each value up to maxVal.
     */
    public static int[] frequency(int[] arr, int maxVal) {
        int[] freq = new int[maxVal + 1];
        for (int num : arr) {
            freq[num]++;
        }
        return freq;
    }

    /**
     * Generates all subarrays using nested loops.
     * Example use in main logic — no return.
     */
    public static void generateSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // arr[i..j] is the subarray
            }
        }
    }

    /**
     * Rotates an array right by 1.
     */
    public static void rotateRightByOne(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    /**
     * Implements next permutation for int[] in-place.
     * Returns true if next permutation exists.
     */
    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--;
        if (i < 0) return false;
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) j--;
        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
        for (int l = i + 1, r = arr.length - 1; l < r; l++, r--) {
            tmp = arr[l]; arr[l] = arr[r]; arr[r] = tmp;
        }
        return true;
    }

    // ========================================
    // ===== 2️⃣ 2D ARRAY METHODS ============
    // ========================================

    /**
     * Calculates the total sum of all elements in a 2D int array.
     */
    public static int sum(int[][] matrix) {
        int total = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                total += val;
            }
        }
        return total;
    }

    /**
     * Calculates the sum of each row in a 2D int array.
     * Returns a 1D array of row sums.
     */
    public static int[] rowSum(int[][] matrix) {
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int val : matrix[i]) {
                sum += val;
            }
            res[i] = sum;
        }
        return res;
    }

    /**
     * Calculates the sum of each column in a 2D int array.
     * Returns a 1D array of column sums.
     */
    public static int[] colSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] res = new int[cols];
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            res[j] = sum;
        }
        return res;
    }

    /**
     * Builds a 2D prefix sum array.
     * prefix[i][j] = sum of submatrix (1,1) to (i,j).
     */
    public static int[][] prefixSum2D(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] prefix = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = matrix[i - 1][j - 1]
                        + prefix[i - 1][j]
                        + prefix[i][j - 1]
                        - prefix[i - 1][j - 1];
            }
        }
        return prefix;
    }

    /**
     * Checks if two 2D arrays are equal.
     */
    public static boolean equals(int[][] arr1, int[][] arr2) {
        return Arrays.deepEquals(arr1, arr2);
    }

    /**
     * Fills an entire 2D array with a given value.
     */
    public static void fill(int[][] matrix, int value) {
        for (int[] row : matrix) {
            Arrays.fill(row, value);
        }
    }

    /**
     * Prints a 1D array.
     */
    public static void print1D(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Prints a 2D array.
     */
    public static void print2D(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


public class CPArrayUtils {

    // GCD and LCM
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    // Prime Checking and Sieve
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    // Fast Power (Modular Exponentiation)
    public static long fastPower(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    // Modular Inverse (Fermat's Little Theorem)
    public static long modInverse(long a, long mod) {
        return fastPower(a, mod - 2, mod);
    }

    // Prefix Max and Min
    public static int[] prefixMax(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = Math.max(res[i - 1], arr[i]);
        }
        return res;
    }

    public static int[] prefixMin(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res[i] = Math.min(res[i - 1], arr[i]);
        }
        return res;
    }

    // Sliding Window Maximum
    public static List<Integer> slidingWindowMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            while (!dq.isEmpty() && dq.peek() <= i - k) dq.poll();
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) dq.pollLast();
            dq.offer(i);
            if (i >= k - 1) result.add(arr[dq.peek()]);
        }
        return result;
    }

    // Cumulative XOR Array
    public static int[] prefixXOR(int[] arr) {
        int[] xor = new int[arr.length + 1];
        for (int i = 1; i <= arr.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i - 1];
        }
        return xor;
    }

    // Factorial Precomputation
    public static long[] computeFactorials(int n, int mod) {
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        return fact;
    }

    // Two Sum Check in Unsorted Array
    public static boolean hasTwoSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) return true;
            set.add(num);
        }
        return false;
    }
}
