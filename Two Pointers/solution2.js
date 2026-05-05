
// problem: https://leetcode.com/problems/is-subsequence/

var isSubsequence = function (s, t) {

    if (!s.length && t.length) return true;

    let sLength = s.length;
    let tLength = t.length;
    let i = 0; let j = 0;
    while (i < sLength && j < tLength) {

        if (s.charAt(i) === t.charAt(j)) {
            ++i;
            ++j;
        } else {
            ++j;
        }
    }

    if(i===sLength) return true;

    return false;
};

// Time Complexity: O(n) 
// Space Complexity: O(1)
