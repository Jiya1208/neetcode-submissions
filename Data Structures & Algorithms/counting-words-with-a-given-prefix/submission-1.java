 class Solution {
    public int prefixCount(String[] words, String pref) {
              int N = pref.length();
              int n = words.length;
              int res = 0;
             for (int i=0; i<n; i++){
                if(words[i].length() < N ) continue;
                     boolean match = true;
                for(int j=0; j<N; j++){
                    if(words[i].charAt(j) != pref.charAt(j)){
                        match = false ;
                        break;  }
                }
               
                   if(match == true ){
                    res++ ;

                   }
                   
             }
             return res;
    } 
                  }

            
 
            

    



































