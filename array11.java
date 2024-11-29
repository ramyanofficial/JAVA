// input = a3b5c7
// output = aaabbbbbccccccc
class Main{
    public static void main (String[] args) {
        String Str="a3b5c7",ans="";
        char ch[]=Str.toCharArray();// a 2 b 5
        
        for(int i=1;i<Str.length();i+=2)
        {
            int num=ch[i]-'0';
        for(int j=0;j<num;j++)
        {
            ans=ans+ch[i-1];
            
        }
        }
        System.out.println(ans);
    }
}

