public class Cis4615a {
    public static void main(String[] args) {
	BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = Base64.getEncoder().encodeToString(byteArray);
byteArray = Base64.getDecoder().decode(s);
x = new BigInteger(byteArray);
    }
}