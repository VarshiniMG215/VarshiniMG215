class Solution {
    public int maxNumberOfBalloons(String text) {
        
        String target = "balloon";

        HashMap< Character , Integer> need = new HashMap<>();

        for(int i=0;i<target.length() ; i++){
            char ch =  target.charAt(i);
            need.put(ch , need.getOrDefault(ch,0)+1);

        }

         HashMap< Character , Integer> given = new HashMap<>();

        for(int i=0;i<text.length() ; i++){
            char ch = text.charAt(i);
            given.put(ch , given.getOrDefault(ch,0)+1);

        }
         int min = Integer.MAX_VALUE;

        for(int i=0;i<target.length() ; i++){
                char ch  = target.charAt(i);

        if (i > 0 && target.charAt(i) == target.charAt(i - 1)) {
        continue;
    }


                int available = given.getOrDefault(ch , 0);
                int requried = need.get(ch);

                int count = available/requried;
                min=Math.min(min , count);
        }
        
       

return min;
    }
    
}