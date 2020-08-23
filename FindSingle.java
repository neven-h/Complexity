public class FindSingle {
    //finding the only element in an array which appears only once (as the others each appears twice in the array)
    // complexity O(logn)
    public static int findSingle(int[] a) {
        int itreationsNum = 0;
        if (a.length == 1)
            return a[0];

        if (a[0] != a[1])
            return a[0];

        if (a[a.length - 1] != a[a.length - 2])
            return a[a.length - 1];

        int low = 0, high = a.length - 1, mid;
        while (low <= high) {
            mid = (high + low) / 2;
            if (mid % 2 == 0)
                if (a[mid] == a[mid + 1])
                    low = mid + 2;
                else if (a[mid] != a[mid - 1])
                    return a[mid];
                else
                    high = mid - 2;
            if (a[mid] == a[mid - 1])
                low = mid + 1;
            else if (a[mid] != a[mid + 1])
                return a[mid];
            else
                high = mid - 1;
        }
    }
}
