Python 3.12.4 (tags/v3.12.4:8e8a4ba, Jun  6 2024, 19:30:16) [MSC v.1940 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
>>> class Solution:
...     def groupAnagrams(self, strs):
...         anagram_map = defaultdict(list)
...         
...         for word in strs:
...             sorted_word = ''.join(sorted(word))
...             anagram_map[sorted_word].append(word)
...         
