class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d = {}
        for ch in s:
            if ch in d: 
                d[ch] += 1
            else:
                d[ch] = 1
        for ch in t:
            if ch in d and d[ch] > 0:
                d[ch] -= 1
            else:
                return False
        for key in d:
            if d[key] != 0:
                return False
        
        return True