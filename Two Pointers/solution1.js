// Brute Force would be to iterate over the array with three loops and find sum. 
// time complexity : O(n^3);
// space complexity : O(1);
{/*
Time Complexity: O(N3 * log(no. of unique triplets)), where N = size of the array.
Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. 
But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.
Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.
  */}

// Better Approach

var threeSum = function (nums) {

    if (!nums || !nums.length || nums.length < 3) return [];

    let tempSet = new Set();
    const n = nums.length;

    for (let i = 0; i < n - 1; i++) {

        let hset = new Set();

        for (let j = i + 1; j < n; j++) {
            let third = -(nums[i] + nums[j]);

            if (hset.has(third)) {
                let temp = [nums[i], nums[j], third].sort((a, b) => a - b);
                tempSet.add(JSON.stringify(temp))
            }

            hset.add(nums[j]);
        }

        return Array.from(tempSet).map((curr) => JSON.parse(curr))

    }

};

{/*
 Time Complexity: O(N2 * log(no. of unique triplets)),
as we are mainly using 2 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity.
But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set.
*/}

// Optimal Approach:

var threeSum = function (nums) {

    if (!nums || !nums.length || nums.length < 3) return [];

    let result = [];
    let n = nums.length;

    let sorted = nums.sort((a, b) => a - b)
    for (let i = 0; i < sorted.length; i++) {

        if (i > 0 && sorted[i] === sorted[i - 1]) continue;

        let left = i + 1; let right = n - 1;

        while (left < right) {

            let sum = sorted[i] + sorted[left] + sorted[right];

            if (sum === 0) {

                result.push([sorted[i], sorted[left], sorted[right]]);
                left++;
                right--;

                while (sorted[left] === sorted[left - 1]) left++;
                while (sorted[right] === sorted[right + 1]) right++;

            } else if (sum < 0) {
                left++;
            } else {

                right--;

            }


        }

    }

    return result;
};

{/* 
  Time Complexity: O(n²)
The algorithm sorts the array first, which takes O(n log n) time. Then it uses a fixed pointer i to iterate through the array from index 0 to n-2,
which is O(n) iterations. For each fixed i, it uses two pointers j and k to traverse the remaining array with a two-pointer technique. 
In the worst case, the two pointers together traverse the remaining n-i-1 elements once, making it O(n) for each i. 
Therefore, the nested loop structure gives us O(n) × O(n) = O(n²). Since O(n²) dominates O(n log n), the overall time complexity is O(n²).
*/}

{
  /*
  Space Complexity: O(no. of quadruplets), This space is only used to store the answer.
  We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
  */
}

