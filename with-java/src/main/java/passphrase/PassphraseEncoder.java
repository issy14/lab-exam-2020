package passphrase;

public class PassphraseEncoder {

    public static String encode(String str){

        String[] strArray = str.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<strArray.length;i++){
            if(strArray[i].equals(strArray[i].toUpperCase())){
                stringBuilder.append(strArray[i].toLowerCase());
            } else if (strArray[i].equals(strArray[i].toLowerCase())){
                stringBuilder.append(strArray[i].toUpperCase());
            } else {
                stringBuilder.append(strArray[i]);
            }
        }

        String encode = stringBuilder.toString();
        return encode;
    }

    public static String decode(String str){

        String[] strArray = str.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<strArray.length;i++){
            if(strArray[i].equals(strArray[i].toLowerCase())){
                stringBuilder.append(strArray[i].toUpperCase());
            } else if (strArray[i].equals(strArray[i].toUpperCase())){
                stringBuilder.append(strArray[i].toLowerCase());
            } else {
                stringBuilder.append(strArray[i]);
            }
        }

        String decode = stringBuilder.toString();
        return decode;
    }

}
