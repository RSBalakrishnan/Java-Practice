class AnagramString{

    public static boolean isAnagram(String s, String t) {
        if (s.length()==t.length()){
            for (int  i=0;i<s.length();i++){
                for (int  j=0;j<s.length();j++){
                    //boolean  state;
                    if (s.charAt(i)==t.charAt(j)){
                        s.indexOf('.', i);
                        t.indexOf('.', j); 
                        System.out.println(t+s);  
                    }
                }
            }


            for (int  i=0;i<s.length();i++){
                for (int  j=0;j<s.length();j++){
                    //boolean  state;
                    if (s.charAt(i)==t.charAt(j)){
                        return true;
                    }else{
                        i=s.length();
                        j=s.length();
                        return false;
                    }
                }
            }
            System.out.println(t+s);
            return true;
        }
        
        else {
            return false;
        }
        
    }

    public static void main(String[] args){
        //AnagramString anagram = new AnagramString();
        String s = "anagram";
        String t = "nagaram";
        //System.out.println(s.charAt(1));
        System.out.println(isAnagram(s, t));
    }
}