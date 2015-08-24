class ThreeDMatrix {
  public static void main(String[] args) {
    int[][][] threeD = new int[3][4][5];
    int dim1;
    int dim2;
    int dim3;
    
    for(dim1 = 0; dim1 < 3; dim1++){
      for(dim2=0; dim2<4; dim2++){
        for(dim3=0; dim3<5; dim3++){
          threeD[dim1][dim2][dim3] = dim1 * dim2 * dim3;
        }
      }
    }

    for(dim1=0; dim1<3; dim1++) {
      for(dim2=0; dim2<4; dim2++) {
        for(dim3=0; dim3<5; dim3++) 
          System.out.print(threeD[dim1][dim2][dim3] + " "); 
        System.out.println();
      }
      System.out.println();
    }
  }
}