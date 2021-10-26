public class Cis4615a {
    public static void main(String[] args) {
    }

    public static int getAbsAdd(int x, int y){
	assert x != Integer.MIN VALUE;
	assert y != Integer.MIN VALUE;
	int absX = Math.abs(x);
	int absY = Math.abs(y);
	assert(absX <= Integer.MAX VALUE − absY);
	return absX + absY;
	}
	// Usage : getAbsAdd ( I n t e g e r .MIN VALUE, 1 ) ;
}