class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        # Define a dictionary to map Roman numerals to their integer values
        roman_to_int = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        # Initialize the result to 0
        result = 0

        # Iterate over the string
        for i in range(len(s)):
            # If the current value is less than the next value, subtract the current value from the result
            if i < len(s) - 1 and roman_to_int[s[i]] < roman_to_int[s[i + 1]]:
                result -= roman_to_int[s[i]]
            # Otherwise, add the current value to the result
            else:
                result += roman_to_int[s[i]]

        return result
