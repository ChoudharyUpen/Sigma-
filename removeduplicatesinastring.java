public class removeduplicatesinastring {
    public static void removeduplicate(String str,int idx, StringBuilder newstr,  boolean map[]) {
        if(idx== str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        //character nikal k currentcharacter mai store karwa lo
        char currcharacter=str.charAt(idx);
        if(map[currcharacter -'a']==true){
            //agar ye ho gya true matalb ye duplicate value hai
            //tau aga bad jao
            removeduplicate(str, idx+1, newstr, map);
        }
        else{
            map[currcharacter -'a']=true;
            //function ko call kartha huva he value dal do
            removeduplicate(str, idx+1, newstr.append(currcharacter), map);
        }
    }
    public static void main(String[] args){
        String str="appnnacollege";
       removeduplicate(str, 0, new StringBuilder(" "),new boolean[26]);
    }
}