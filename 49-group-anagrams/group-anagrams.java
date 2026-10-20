class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
       

        HashMap<String , List<String>> map = new HashMap<>();

        // List<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){  
                char[] ch = arr[i].toCharArray();
        Arrays.sort(ch);
        String  key = new String(ch);

       
         
        if(!map.containsKey(key)){
             map.put(key , new ArrayList<>());
            // map.get(key).add(arr[i]);
         
        }
              map.get(key).add(arr[i]);
           
        
         }
        return new ArrayList<>(map.values());
    }
}