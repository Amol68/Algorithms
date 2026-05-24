// problem : https://leetcode.com/problems/binary-subarrays-with-sum/


var numSubarraysWithSum = function (nums, goal) {

    let ans = 0;

    for (let i = 0; i < nums.length; i++) {
        let sum = 0;
        for (let j = i; j < nums.length; j++) {

            sum += nums[j];

            if (sum === goal) {
                ans += 1;
                continue;
            } else if (sum > goal) break;

        }

    }
    return ans

}

// Time Complexity : O(n^2);
// Space Complexity : O(1)

// --------------->--------------->--------------->--------------->--------------->--------------->--------------->--------------->



var numSubarraysWithSum = function (nums, goal) {

     return  getCount(nums,goal)-getCount(nums,goal-1) ;
}


function getCount(nums, goal) {
    if (goal < 0) return 0;
    let left = 0;
    let sum = 0;
    let count = 0;

    for (let right = 0; right < nums.length; right++) {
        sum += nums[right];

        while (sum > goal) {
            sum -= nums[left];
            left++;
        }

        count = count + ( right - left) + 1;
    }
    return count;
}

// Time Complexity: O(n)
// Space Complexity: O(1)
