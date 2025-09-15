class One_Nine_Three_five{
public int canBeTypedWords(String text, String brokenLetters) {
        int ans=0;
        //String split by spaces for accessing one word at time 
        String arr[] = text.split(" ");
        //base case:
        if(text.length()==0) return 0;
        if(brokenLetters.length()==0) return arr.length;


        //now mapping brokenletters into hashmap
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0;i<brokenLetters.length();i++){
            map.put(brokenLetters.charAt(i) , i);
        }

        //loop for String array for every word to check whether that can be type using broken keyboard and make count to plus +1 
        for(int i=0;i<arr.length;i++){
            String curr = arr[i];
            int l = curr.length();
            int ind=0;
            boolean yes = true;
            while(ind<l){
                if(map.containsKey(curr.charAt(ind))) yes = false;
                ind++;
            }
            if(yes) ans++;
        }
        return ans;
    }
}
