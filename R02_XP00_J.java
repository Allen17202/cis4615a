public class Cis4615a {
    public static void main(String[] args) {
        
    }
    public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  if (!someFile.delete()) {
    // Handle failure to delete the file
  }
}