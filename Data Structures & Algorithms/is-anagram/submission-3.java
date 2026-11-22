
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() ) {
            return false;
        }
        char[] anagramChar = s.toCharArray();
        char[] checkForAnagaramChar = t.toCharArray();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < anagramChar.length; i++) {
            int count = frequencyMap.getOrDefault(anagramChar[i], 0);
            count++;
            frequencyMap.put(anagramChar[i], count);
            System.out.println("FrequencyMap: " + frequencyMap.toString());
        }

        for(int i = 0; i < checkForAnagaramChar.length; i++) {
            if (!frequencyMap.containsKey(checkForAnagaramChar[i])) {
                return false;
            }
            int count = frequencyMap.get(checkForAnagaramChar[i]);
            count--;
            if (count == 0) {
                frequencyMap.remove(checkForAnagaramChar[i]);
            } else {
                frequencyMap.put(checkForAnagaramChar[i], count);
            }
            
        }

        if(frequencyMap.size() > 0) {
            return false;
        } else {
            return true;

        }
        


    }
}
