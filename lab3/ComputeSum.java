public class ComputeSum {
  public static ComputeSum _Sum = null; //devia ser _sum (minusculo)
  
  private int total;

  public ComputeSum(int t) {
    total = t;
  }

  // compute sum of the elements in the vector
  public void vectorSum (int[] my_vector) {    //devia ser myVector
    int i = 0;
    total = 0;

    while (i<my_vector.length) { //devia haver espassso entre ...<...
      total += my_vector[i++];
    }       
  }

  private int get_Total() {
    return total;
  }

  private void SetTotal(int NewTotal) { //devia ser newTotal
    total = NewTotal;
  }
}