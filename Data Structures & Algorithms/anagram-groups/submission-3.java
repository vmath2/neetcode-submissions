class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortedWords = new HashMap<String, List<String>>();
        List<List<String>> result = new ArrayList<List<String>>();
        for(int i = 0; i < strs.length; i++) {
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedLetters = String.valueOf(letters);
            System.out.println("Sorted words: " + sortedLetters);

            List<String> sortedList = sortedWords.getOrDefault(sortedLetters, new ArrayList<String>());
            System.out.println("Sorted List: " + sortedList);
            sortedList.add(strs[i]);
            System.out.println("Sorted List after adding: " + sortedList);
            sortedWords.put(sortedLetters, sortedList);
            System.out.println("HashMap Key Set " + sortedWords.keySet() + " ValueSet " + sortedWords.values());
            
        }
        result.addAll(sortedWords.values());
        System.out.println("Anagram List: " + result);
        return result;
    }
}
