class Solution {
    public boolean canConstruct(String a, String b) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0;i<b.length();i++){
            Character ch = b.charAt(i);
             map.put(ch ,map.getOrDefault(ch,0)+1);
                    }

                    for(int i=0;i<a.length();i++){
                        Character ch = a.charAt(i);

                        if(!map.containsKey(ch)|| map.get(ch)==0)
                            return false;
                       
                       map.put(ch, map.get(ch)-1);}
                    return true;
 }
}