
public class StringTest{

    /**对于String uri = "ftp://chenqigan@nimama:127.0.0.1";的
     * 最终结果:
     *  s:
            ftp:
            chenqigan@nimama:127.0.0.1
        s2:
            chenqigan
            nimama:127.0.0.1
        s3:
            chenqigan
     */
    /**对于String uri = "ftp://chenqigan:nimama@127.0.0.1";的最终结果
     * s:
        ftp:
        chenqigan:nimama@127.0.0.1
       s2:
        chenqigan:nimama
        127.0.0.1
       s3:
        chenqigan
        nimama
 */
    public static void main(String[] args){
        /*
        //String uri = "ftp://chenqigan@nimama:127.0.0.1";
        String uri = "ftp://chenqigan:nimama@127.0.0.1";

        String[] s = uri.split("//");
        String[] s2 = s[1].split("@", 2);
        String[] s3 = s2[0].split(":", 2);
        
        System.out.println("s:");
        for(String tmp:s){

            System.out.println(tmp);
        }

        System.out.println("s2:");
        for(String tmp:s2){

            System.out.println(tmp);
        }

        System.out.println("s3:");
        for(String tmp:s3){

            System.out.println(tmp);
        }
        //System.out.println("[s3[0]]"+s3[0]+"[s3[1]]"+s3[1]);
        */
        String mccmnc = "46011";
        String mcc = mccmnc.substring(0,3);
        String mnc = mccmnc.substring(3);
        System.out.println("[mcc]"+mcc+"[mnc]"+mnc);

    }
}