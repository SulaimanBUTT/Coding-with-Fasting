class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer > n = new HashMap<>();

        n.put ('I',1);
        n.put ('V',5);
        n.put('X',10);
        n.put('L',50);
        n.put('C',100);
        n.put('D',500);
        n.put('M',1000);

        int ans = 0;

        for (int i =0 ; i <s.length(); i++){
            if (i < s.length()-1 && n.get(s.charAt(i)) < n.get(s.charAt(i+1))){
                ans = ans - n.get(s.charAt(i));
            }
            else {
                ans = ans + n.get(s.charAt(i));
            }
        }

        return ans;

    }
}