class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.replace(" ", "").lower()

        res = re.sub(r'[^a-zA-Z0-9]', '', s)

        if res == res[::-1]:
            return True
        else:
            return False