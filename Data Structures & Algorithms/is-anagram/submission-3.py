class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if(len(t) != len(s)):
            return False

        li = [0]*26

        for i in range(0, len(t)):
            li[ ord(t[i]) - ord('a') ] += 1
            li[ ord(s[i]) - ord('a') ] -= 1

        
        return all(x == 0 for x in li)
