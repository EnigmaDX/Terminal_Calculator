public Class Calculator{
  public static void main(String[] x){
  
    int answer = 0;
    if(x[0].equals("add")){
      answer  = Integer.parseInt(x[1]) + Integer.parseInt(x[2]);
      System.out.println(answer);
    }
    else if(x[0].equals("subtract")){
      answer  = Integer.parseInt(x[1]) - Integer.parseInt(x[2]);
      System.out.println(answer);
    }
    else if(x[0].equals("multiply")){
      answer  = Integer.parseInt(x[1]) * Integer.parseInt(x[2]);
      System.out.println(answer);
    }
  }
}