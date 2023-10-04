class Main {
public static void main(String[] args) 
  {
    Cipher cipher = new Cipher();

    String result =  cipher.shift("Mrs. Tan is the coolest teacher ever", 3);
    System.out.println(result);

    String decryptResult = cipher.decipher(result, 3);
    System.out.println(decryptResult);

    cipher.decipherAll("E PSRK XMQI EKS, MR E KEPEBC JEV, JEV EAEC");

    String ownMessage = cipher.shift("Hello, my name is Bob Smith. Encryption and decryption is fun!!", 8);
    System.out.println(ownMessage);

    //Kuber's and Andrew's message deciphered
    cipher.decipherAll("s vyfo gkdobwovyx k vyd");

    //Elvis's and James's message deciphered
    cipher.decipherAll("tlt vlr zoxzhba x pefcqw");

    //Extension
    String encrypted = cipher.shift2("free pizza in the cafeteria", "543678");
    System.out.println(encrypted);
  }
}