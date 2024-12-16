class Solution{
  int findHCF(int m, int n){
    while(m!=n){
      if(m>n){
        m=m-n;
      }else{
        n=n-m;
      }
  }
  return m;
}
