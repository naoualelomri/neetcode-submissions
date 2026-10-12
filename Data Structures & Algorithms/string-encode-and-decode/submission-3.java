class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for ( String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        String encoded = sb.toString();
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while ( i<str.length()){
            int j = i ;
            while( str.charAt(j) !='#'){
                j++ ;
            }
            int l = Integer.parseInt(str.substring(i, j)); 
            result.add(str.substring(j+1,j+1+l));
            i=1+j+l;
        }
        return result;
    }
}
