// problem: https://leetcode.com/problems/max-consecutive-ones-iii/description/

var longestOnes = function (nums, k) {

    let maxLength = -1;
    let n = nums.length;

    for (let i = 0; i < n ; i++) {


        let counter = -1;

        for (let j = i ; j < n; j++) {

            if (counter===k) {
                break;
            }

            if (!nums[j]) {
                counter++;
            }
            else {
                maxLength = Math.max((j - i) + 1, maxLength);
            }
        }
    }

    return maxLength;

};

//Time Complexity: O(n^2) 
// Time Complexity: O(n) 

// --------->--------->--------->---------> Optimal Approach   --------->--------->--------->--------->

var longestOnes = function (nums, k) {

    let maxLength = -1;
    let n = nums.length;
    let l = 0;
    let zeroes = 0;

    for (let r = 0; r < n; r++) {

        if (nums[r] === 0) zeroes++;

        while (zeroes > k) {
            if (!nums[l]) zeroes--;
            l++
        }




        if (zeroes <= k) {
            maxLength = Math.max(maxLength, (r - l) + 1);
        }

    }

    return maxLength;

};

// Time Complexity: O(n) 
// Time Complexity: O(n) 
