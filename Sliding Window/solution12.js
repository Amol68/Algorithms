// problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/


var lengthOfLongestSubstring = function (s) {

    if(!s || !s.length || s==="") return 0;
    if(s === " ") return 1;

    if(s.length===1) return 1;

    let hset = new Set();
    let n = s.length;
    let maxLength = -1;

    for (let i = 0; i < n - 1; i++) {

        hset.clear();
        hset.add(s.charAt([i]));
        maxLength = Math.max(maxLength, 1);

        for (let j = i + 1; j < n; j++) {


            if (hset.has(s[j])) {
                break;
            }
            else {
                hset.add(s.charAt(j));
                maxLength = Math.max(maxLength, (j - i) + 1);
            }
        }
    }
  return maxLength;
};

// Time Complexity : O(N^2)
// Space Complexity : O(256)

// ----------->----------->--------- Better Approach --------->------>------>------>------>------>------>------>


var lengthOfLongestSubstring = function (s) {

    if (!s || !s.length || s === "") return 0;
    if (s === " ") return 1;

    if (s.length === 1) return 1;

    let hmap = new Map();
    let n = s.length;
    let maxLength = -1;
    let l = 0;

    for (let r = 0; r < n; r++) {

        let char = s.charAt(r);

        hmap.set(char, (hmap.get(char) || 0) + 1);

        while (hmap.get(char) > 1) {
            let leftChar = s.charAt(l)

            hmap.set(leftChar, hmap.get(leftChar) - 1);
            l++;
        }

        maxLength = Math.max(maxLength, (r - l) + 1);

    }
return maxLength;
}


// Time Complexity : O(N)
// Space Complexity : O(1)
