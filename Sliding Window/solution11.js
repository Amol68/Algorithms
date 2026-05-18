// problem: : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

var maxScore = function (cardPoints, k) {

    if (!cardPoints || !cardPoints.length || !k) return -1;

    let lSum = cardPoints.slice(0, k).reduce((acc, curr) => {
        return acc += curr;
    },0)

    let maxSum = lSum;
    let rSum = 0;
 
    let rightIndex = cardPoints.length-1;


    for(let i=k-1; i>=0; i--){
      
      lSum -= cardPoints[i];
      rSum += cardPoints[rightIndex];
      rightIndex--;

      maxSum = Math.max(maxSum,lSum + rSum);

    }

    return maxSum;

};

// Time Complexity : O(2K);
// Space Complexity : O(1);
