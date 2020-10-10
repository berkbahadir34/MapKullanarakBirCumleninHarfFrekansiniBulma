import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] argc){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Cümleyi Giriniz : ");
        String cumle=scanner.nextLine();

        Map<Character,Integer> frekans=new TreeMap<Character, Integer>();

        for(int i =0;i<cumle.length();i++){
            char c=cumle.charAt(i);//Cümlemizin o anki karakterini c ye atadık...

            if(frekans.containsKey(c)){//frekans cümlemiz o karaktere daha önceden sahip ise....
                frekans.replace(c,frekans.get(c)+1); //c deki akraktere karşılık gelen valueyi bir arttırdık
            }
            else{
                frekans.put(c,1); //Karakteri ekledik ve değerini 1 olarak atadık..

            }
        }
        for(Map.Entry<Character,Integer> entry: frekans.entrySet()){
            System.out.println("Karakter : "+entry.getKey()+" "+entry.getValue()+" kadar geçiyor..");
        }

    }
}
