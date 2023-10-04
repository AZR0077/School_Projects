public class Cipher
{
  private String alpha;
  
  public Cipher()
  {
    alpha = "abcdefghijklmnopqrstuvwxyz";
  }

  public String shift(String message, int shift)
  {
    message = message.toLowerCase();
    String shifted = "";
    for (int i = 0; i < message.length(); i++) {
      int index = alpha.indexOf(message.substring(i, i + 1));
      if (alpha.contains(message.substring(i, i + 1)) == false) {
        shifted += message.substring(i, i + 1);
      }
      else if (index + shift >= alpha.length()) {
        index += shift;
        index -= 26;
        shifted += alpha.substring(index, index + 1);
      }
      else {
        shifted += alpha.substring(index + shift, index + shift + 1);
      }
    }
    return shifted;
  }

  public String decipher(String message, int shift)
  {
    message = message.toLowerCase();
    String deciphered = "";
    for (int i = 0; i < message.length(); i++) {
      int index = alpha.indexOf(message.substring(i, i + 1));
      if (alpha.contains(message.substring(i, i + 1)) == false) {
        deciphered += message.substring(i, i + 1);
      }
      else if (index - shift < 0) {
        index -= shift;
        index += 26;
        deciphered += alpha.substring(index, index + 1);
      }
      else {
        deciphered += alpha.substring(index - shift, index - shift + 1);
      }
    }
    return deciphered;
  }

  public void decipherAll(String message)
  {
    for (int j = 0; j < 26; j++) {
      String deciphered = decipher(message, j);
      System.out.println(deciphered);
    }
  }

  //Extension
  public String shift2(String message, String key) {
    message = message.toLowerCase();
    String encrypted = "";
    int j = 0;
    for (int i = 0; i < message.length(); i++) {
      if (j == key.length()) {
        j = 0;
      }
      int shift = Integer.parseInt(key.substring(j, j + 1));
      int index = alpha.indexOf(message.substring(i, i + 1));
      if (alpha.contains(message.substring(i, i + 1)) == false) {
        encrypted += message.substring(i, i + 1);
      }
      else if (index + shift >= alpha.length()) {
        index += shift;
        index -= 26;
        encrypted += alpha.substring(index, index + 1);
        j++;
      }
      else {
        encrypted += alpha.substring(index + shift, index + shift + 1);
        j++;
      }
    }
    return encrypted;
  }
}