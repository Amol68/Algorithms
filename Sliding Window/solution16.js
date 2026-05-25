// problem: https://leetcode.com/problems/count-number-of-nice-subarrays/;


var numberOfSubarrays = function (nums, k) {

    let ans = 0

    for (let i = 0; i <= nums.length-k ; i++) {
        let oddCount = 0;
        for (let j = i; j < nums.length; j++) {


            if (nums[j] % 2 !== 0) {
                oddCount++;
            }


            if (oddCount > k) {
                break;
            }
            if (oddCount === k) ans++;

        }

    }

    return ans;

};

// Time Complexity: O(N2)
// Space Complexity: O(N)

// -------------->-------------->-------------->-------------->-------------->-------------->-------------->-------------->


