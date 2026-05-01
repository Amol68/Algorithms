function twoSum(nums: number[], target: number): number[] {

    if (!nums || nums === undefined || nums.length < 2) return [-1, -1];

    if (nums.length === 2 && nums[0] + nums[1] === target) return [0, 1];

    let hmap = new Map<Number, Number>();

    for (let i = 0; i < nums.length; i++) {
        let curr = nums[i];
        let complement = target - curr;

        if (hmap.has(complement)) {
            return [hmap.get(complement), i];
        }
        else {
            hmap.set(curr, i);
        }

    }
    return [-1, -1];
};

// Time Complexity : O(n),
//  Space Complexity : O(1),
