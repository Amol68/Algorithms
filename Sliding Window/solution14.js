// problem: https://leetcode.com/problems/fruit-into-baskets/description/

// Optimal Approach


var totalFruit = function (fruits) {

    if (!fruits || !fruits.length) return -1;

    let maxLength = -1;
    const n = fruits.length;

    if (n === 1) return 1;

    let l = 0;

    let hmap = new Map();


    for (let r = 0; r < n; r++) {

        hmap.set(fruits[r], (hmap.get(fruits[r]) || 0) + 1);

        while (hmap.size > 2) {
            let curr = fruits[l];
            let curr_count = hmap.get(curr);

            hmap.set(curr, --curr_count);

            if (hmap.get(curr) === 0) hmap.delete(curr)

            l++;
        }

        maxLength = Math.max(maxLength, (r - l) + 1);


    }

    return maxLength;

}

{/* 
  Time Complexity: O(n), where n is the length of the fruits array.

The algorithm uses a sliding window approach with two pointers (i and j). 
The outer loop iterates through each element exactly once with pointer i, contributing O(n) operations.
The inner while loop moves pointer j forward, but critically, j can only move from position 0 to position n-1 
throughout the entire execution of the algorithm. Each element is visited at most twice -
once by pointer i and once by pointer j. Therefore, despite the nested loop structure, the total number of 
operations is bounded by 2n, which simplifies to O(n).

Space Complexity: O(1)

The algorithm uses a Counter (hash map) to store the frequency of fruit types in the current window. 
Since the problem constraint is to maintain at most 2 different fruit types in the window (the while loop ensures len(cnt) > 2 
never persists), the Counter will contain at most 3 entries at any point (momentarily 3 before reducing back to 2). 
This means the space used by the Counter is constant and independent of the input size n. 
The remaining variables (ans, i, j, x, y) all use constant space. Therefore, the overall space complexity is O(1).

*/}
