public class ByteRep {
  private int num;
  private String hex;
  public ByteRep(int num) {
    this.num = num;
    hex = Integer.toHexString(num);
  }
}
