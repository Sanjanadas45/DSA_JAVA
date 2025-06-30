//Allocate Minimum Pages(GFG)
package ASSIGNMENTS.Searching.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Min_Pages {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;

        // Edge case: If the number of students is greater than the number of books,
        // it's impossible to assign at least one book to each student contiguously.
        if (k > n) {
            return -1;
        }

        // Define the search space for the minimum possible maximum sum of pages.
        // 'low' (or 'start') is the minimum possible maximum sum:
        // This must be at least the maximum number of pages in a single book,
        // because a student must read at least one book.
        int low = 0;
        if (n > 0) { // Ensure array is not empty before finding max
            low = Arrays.stream(arr).max().getAsInt();
        } else {
            // If array is empty, there are no pages to allocate.
            // Problem constraints usually state n >= 1, but good to handle.
            return 0; // Or -1 depending on exact problem spec for empty array
        }

        // 'high' (or 'end') is the maximum possible maximum sum:
        // This is the sum of all pages (if k=1, one student reads all books).
        int high = Arrays.stream(arr).sum();

        int ans = -1; // To store the best possible answer found

        // Binary search for the minimum possible maximum sum
        while (low <= high) {
            // Calculate the middle value, which is our current guess for the "largest sum".
            // Using (high - low) / 2 to prevent potential integer overflow if low + high is very large.
            int mid = low + (high - low) / 2;

            // Check if it's possible to allocate books such that no student
            // reads more than 'mid' pages, using at most 'k' students.
            if (check(arr, k, mid)) {
                // If it's possible, 'mid' is a potential answer.
                // We store 'mid' as a valid answer and try to find an even smaller
                // maximum sum in the left half of our search space.
                ans = mid;
                high = mid - 1;
            } else {
                // If it's not possible to allocate books with 'mid' as the maximum page limit,
                // it means 'mid' is too small. We need to allow a larger maximum sum,
                // so we search in the right half of the search space.
                low = mid + 1;
            }
        }

        // After the binary search, 'ans' will hold the smallest 'mid' value
        // for which allocation was possible with 'k' or fewer students.
        // This is our minimum possible maximum pages.
        return ans;
    }

    /**
     * Helper function to check if it's possible to allocate books
     * with a given 'pageLimit' (maximum pages per student) to at most 'k' students.
     *
     * @param arr The array of book pages.
     * @param k The maximum number of students allowed.
     * @param pageLimit The maximum number of pages a single student is allowed to read.
     * @return true if books can be allocated within the given pageLimit and student count, false otherwise.
     */
    private static boolean check(int[] arr, int k, int pageLimit) {
        // 'studentCount' tracks how many students are needed for this 'pageLimit'.
        int studentCount = 1;
        // 'currentPageSum' tracks the pages assigned to the current student.
        int currentPageSum = 0;

        for (int pagesInBook : arr) {
            // If any single book has more pages than the allowed pageLimit,
            // it's impossible to satisfy the condition, so return false immediately.
            if (pagesInBook > pageLimit) {
                return false;
            }

            // If adding the current book to the current student's allocation
            // would exceed the 'pageLimit', then this book must go to a new student.
            if (currentPageSum + pagesInBook > pageLimit) {
                studentCount++; // Increment student count
                currentPageSum = pagesInBook; // Start the new student's sum with this book
            } else {
                // Otherwise, add the book to the current student's allocation.
                currentPageSum += pagesInBook;
            }
        }

        // If the total number of students required to allocate all books
        // is less than or equal to 'k', then it's possible with this 'pageLimit'.
        return studentCount <= k;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = {12, 34, 67, 90};
        int k1 = 2;
        System.out.println("Books: " + Arrays.toString(arr1) + ", Students: " + k1 +
                " -> Min Max Pages: " + findPages(arr1, k1)); // Expected: 113

        // Test Case 2
        int[] arr2 = {10, 20, 30, 40};
        int k2 = 2;
        System.out.println("Books: " + Arrays.toString(arr2) + ", Students: " + k2 +
                " -> Min Max Pages: " + findPages(arr2, k2)); // Expected: 60

        // Test Case 3 (More students than books)
        int[] arr3 = {10, 20, 30};
        int k3 = 4;
        System.out.println("Books: " + Arrays.toString(arr3) + ", Students: " + k3 +
                " -> Min Max Pages: " + findPages(arr3, k3)); // Expected: -1

        // Test Case 4 (k = 1)
        int[] arr4 = {10, 20, 30, 40};
        int k4 = 1;
        System.out.println("Books: " + Arrays.toString(arr4) + ", Students: " + k4 +
                " -> Min Max Pages: " + findPages(arr4, k4)); // Expected: 100

        // Test Case 5 (All students get one book)
        int[] arr5 = {10, 20, 30, 40};
        int k5 = 4;
        System.out.println("Books: " + Arrays.toString(arr5) + ", Students: " + k5 +
                " -> Min Max Pages: " + findPages(arr5, k5)); // Expected: 40
    }
}
