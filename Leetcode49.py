# *The idea is to group words that are anagrams, meaning they’re made up of the same letters but arranged differently, like “eat”, “tea”, and “ate”. To do this, we use a dictionary where each key represents a kind of “signature” for the word, and the value is a list of all words that match that signature.
# *The signature we use is just the sorted version of the word because sorting the letters makes all anagrams look the same. For example, “eat”, “tea”, and “ate” all become “aet” when sorted. So, we map “aet” to the list ["eat", "tea", "ate"].
# *We repeat this for every word in the list: sort the word, use the sorted result as the key, and then add the word to the appropriate group in the dictionary.
# *At the end, the dictionary values give us the groups of anagrams, which we simply return.


>>> class Solution:
...     def groupAnagrams(self, strs):
...         anagram_map = defaultdict(list)
...         
...         for word in strs:
...             sorted_word = ''.join(sorted(word))
...             anagram_map[sorted_word].append(word)
...         

